import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the height of the triangle
        System.out.println("Enter the height of the triangle (a positive integer):");

        try {
            // Read the input as an integer
            int height = scanner.nextInt();

            // Check if the input is valid
            if (height > 0) {
                // Print out a triangle using asterisks
                for (int i = 1; i <= height; i++) {
                    // Print out spaces before each row
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }
                    // Print out asterisks for each row
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    // Move to the next line
                    System.out.println();
                }
            } else {
                // Print out an error message if the input is not positive
                System.out.println("Invalid input. The height must be a positive integer.");
            }
        } catch (Exception e) {
            // Print out an error message if the input is not an integer
            System.out.println("Invalid input. The height must be an integer.");
        }

        // Close the scanner object
        scanner.close();
    }
}
