import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input character: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Exit");
                break;
            }
            char character = input.charAt(0);
            if (Character.isLetter(character)) {
                System.out.println("'" + character + "' is alphabet");
            }
            else if (Character.isDigit(character)) {
                System.out.println("'" + character + "' is a number");
            }
            else {
                System.out.println("'" + character + "' is special character");
            }
        }
        scanner.close();
    }
}
