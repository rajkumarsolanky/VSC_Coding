import java.util.Scanner;

public class koko {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of r: "); 
            int r = sc.nextInt();
            System.out.println("enter the of s:");
            int s = sc.nextInt();
            System.out.println("the total nuber of input");
            double n = r*s+1023;
            System.out.println(n);
            System.out.println(n/2);
        }
        
    }
    
}
