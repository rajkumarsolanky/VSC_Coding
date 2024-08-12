import speech_recognition as sr
import pyttsx3
import pywhatkit
import wikipedia
import datetime
import pyjokes

listener = sr.Recognizer()
engine = pyttsx3.init()

def talk(text):
    engine.say(text)
    engine.runAndWait()

def take_command():
    try:
        with sr.Microphone() as source:
            print("Listening...")
            voice = listener.listen(source)
            command = listener.recognize_google(voice)
            command = command.lower()
            if 'assistant' in command:
                command = command.replace('assistant', '')
                print(command)
    except:
        pass
    return command

def run_assistant():
    command = take_command()
    if 'play' in command:
        song = command.replace('play', '')
        talk('Playing ' + song)
        pywhatkit.playonyt(song)
    elif 'time' in command:
        time = datetime.datetime.now().strftime('%I:%M %p')
        talk('Current time is ' + time)
    elif 'search' in command:
        search = command.replace('search', '')
        info = wikipedia.summary(search, 1)
        talk(info)
    elif 'joke' in command:
        talk(pyjokes.get_joke())
    else:
        talk("I didn't understand that. Can you repeat?")

while True:
    run_assistant()
