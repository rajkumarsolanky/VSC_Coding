
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import org.opencv.core.Point;
import org.opencv.core.Rect;

public class HandGestureVolumeControl {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        VideoCapture camera = new VideoCapture(0);

        if (!camera.isOpened()) {
            System.out.println("Error: Camera not opened");
            return;
        }

        Mat frame = new Mat();
        Mat grayFrame = new Mat();

        while (true) {
            if (camera.read(frame)) {
                // Convert frame to grayscale
                Imgproc.cvtColor(frame, grayFrame, Imgproc.COLOR_BGR2GRAY);

                // Apply Gaussian blur to reduce noise
                Imgproc.GaussianBlur(grayFrame, grayFrame, new Size(5, 5), 0);

                // Apply thresholding
                Imgproc.threshold(grayFrame, grayFrame, 70, 255, Imgproc.THRESH_BINARY_INV);

                // Find contours
                List<MatOfPoint> contours = new ArrayList<>();
                Mat hierarchy = new Mat();
                Imgproc.findContours(grayFrame, contours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);

                // Iterate through contours
                for (MatOfPoint contour : contours) {
                    Rect boundingRect = Imgproc.boundingRect(contour);
                    // Check for hand-like contours (adjust these conditions based on your needs)
                    if (boundingRect.width > 30 && boundingRect.height > 30) {
                        // Draw bounding box
                        Imgproc.rectangle(frame, new Point(boundingRect.x, boundingRect.y),
                                new Point(boundingRect.x + boundingRect.width, boundingRect.y + boundingRect.height),
                                new Scalar(0, 255, 0), 2);
                    }
                }

                // Show the frame
                HighGui.imshow("Hand Gesture Volume Control", frame);

                if (HighGui.waitKey(30) >= 0)
                    break;
            } else {
                System.out.println("Error: Unable to capture frame");
                break;
            }
        }

        camera.release();
        HighGui.destroyAllWindows();
    }
}
