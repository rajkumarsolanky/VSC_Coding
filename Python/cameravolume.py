import cv2
import mediapipe as mp
import ctypes
import numpy as np

# Set the volume range (0 to 100)
MIN_VOLUME = 0
MAX_VOLUME = 100

# Set the minimum and maximum distance for volume control
MIN_DISTANCE = 50
MAX_DISTANCE = 300

# Initialize the hand tracking module
mp_hands = mp.solutions.hands
hands = mp_hands.Hands()

# Initialize the drawing module for visualization
mp_drawing = mp.solutions.drawing_utils

# Function to get the distance between two points
def distance(p1, p2):
    return np.linalg.norm(p1 - p2)

# Function to map a value from one range to another
def map_value(value, from_min, from_max, to_min, to_max):
    return (value - from_min) * (to_max - to_min) / (from_max - from_min) + to_min

# Function to set system volume
def set_system_volume(volume):
    volume = int(volume)
    ctypes.windll.user32.keybd_event(0xAD, 0, 0x0002, 0)  # Volume mute off
    ctypes.windll.user32.keybd_event(0xAE, 0, 0x0002, 0)  # Volume down
    ctypes.windll.user32.keybd_event(0xAE, 0, 0x0002, 0)  # Volume down
    ctypes.windll.user32.keybd_event(0xAF, 0, 0x0002, 0)  # Volume up

# Open the camera
cap = cv2.VideoCapture(0)

while cap.isOpened():
    # Read a frame from the camera
    ret, frame = cap.read()
    if not ret:
        break

    # Flip the frame horizontally for a later selfie-view display
    frame = cv2.flip(frame, 1)

    # Convert the BGR image to RGB
    rgb_frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

    # Process the frame and get hand landmarks
    results = hands.process(rgb_frame)

    # Check if hands are detected
    if results.multi_hand_landmarks:
        for hand_landmarks in results.multi_hand_landmarks:
            # Get landmarks for thumb and index finger
            thumb_tip = np.array([hand_landmarks.landmark[mp_hands.HandLandmark.THUMB_TIP].x,
                                  hand_landmarks.landmark[mp_hands.HandLandmark.THUMB_TIP].y])
            index_finger_tip = np.array([hand_landmarks.landmark[mp_hands.HandLandmark.INDEX_FINGER_TIP].x,
                                         hand_landmarks.landmark[mp_hands.HandLandmark.INDEX_FINGER_TIP].y])

            # Calculate the distance between thumb tip and index finger tip
            hand_distance = distance(thumb_tip, index_finger_tip)

            # Map the hand distance to the volume range
            volume = map_value(hand_distance, MIN_DISTANCE, MAX_DISTANCE, MIN_VOLUME, MAX_VOLUME)

            # Set the system volume
            set_system_volume(volume)

            # Draw the hand landmarks on the frame
            mp_drawing.draw_landmarks(frame, hand_landmarks, mp_hands.HAND_CONNECTIONS)

    # Display the frame
    cv2.imshow('Gesture Volume Control', frame)

    # Break the loop if 'q' key is pressed
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Release the camera and close all windows
cap.release()
cv2.destroyAllWindows()

