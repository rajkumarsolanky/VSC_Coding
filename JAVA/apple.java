import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        System.out.println( "Two Numbers PLUS AND MINS" );
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("number 1  :");
            int a = s.nextInt();
      
            System.out.println("number 2  :");
            int b = s.nextInt();
            
            int sum = a+b;
            int mins = a-b;
      
            System.out.println("Two Number Plus  :  " + sum);
            System.out.println("Two Number Mins  :  " + mins);
        }
    }
    
}
