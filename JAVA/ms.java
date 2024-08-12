import java.util.Scanner;

    public class ms {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Declare arrays to store data
            int[] rollNumbers = new int[5];
            String[] names = new String[5];
            int[][] marks = new int[5][5]; // Assuming 5 subjects
            int[] totalMarks = new int[5];
            double[] percentages = new double[5];
            char[] grades = new char[5];
    
            // Input data for 5 students
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");
                
                // Input roll number
                System.out.print("Roll Number: ");
                rollNumbers[i] = scanner.nextInt();
    
                // Input name
                System.out.print("Name: ");
                scanner.nextLine(); // Consume newline character
                names[i] = scanner.nextLine();
    
                // Input marks for 5 subjects
                System.out.println("Enter marks for 5 subjects:");
                for (int j = 0; j < 5; j++) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    marks[i][j] = scanner.nextInt();
                    totalMarks[i] += marks[i][j];
                }
    
                // Calculate percentage
                percentages[i] = (double) totalMarks[i] / 5;
    
                // Determine grade
                if (percentages[i] >= 90) {
                    grades[i] = 'A';
                } else if (percentages[i] >= 80) {
                    grades[i] = 'B';
                } else if (percentages[i] >= 70) {
                    grades[i] = 'C';
                } else if (percentages[i] >= 60) {
                    grades[i] = 'D';
                } else {
                    grades[i] = 'F';
                }
            }
    
            // Display results
            System.out.println("\nResults:");
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    "Roll Number", "Name", "Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5", "Total", "Percentage");
    
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-15d%-15s%-15d%-15d%-15d%-15d%-15d%-15d%-15.2f%-15c\n",
                        rollNumbers[i], names[i], marks[i][0], marks[i][1], marks[i][2], marks[i][3], marks[i][4],
                        totalMarks[i], percentages[i], grades[i]);
            }
    
            // Close the scanner
            scanner.close();
        }
    }
    

