import java.util.Scanner;

public class allstudentki {
    public static void main(String[] args) {
 
        int N = 5;

        String[] R = new String[N];
        String[] D = new String[N];
        int[] F = new int[N];
        int[] G = new int[N];
        int[] J = new int[N];
        int[] O = new int[N];
        int[] P = new int[N];

        Scanner scanner = new Scanner(System.in);

        System.out.println("___________________");
        System.out.println("University Of Sindh");
        System.out.println("-------------------");
        System.out.println("_______________________");
        System.out.println("Information Technology");
        System.out.println("-----------------------");

        for (int i = 0; i < N; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Roll Number : 2k23/ITE/");
            R[i] = scanner.nextLine();
            System.out.print("Enter Name : ");
            D[i] = scanner.nextLine();

            System.out.print("English Marks : ");
            F[i] = scanner.nextInt();
            System.out.print("Philosophy Marks : ");
            G[i] = scanner.nextInt();
            System.out.print("Calculus Marks : ");
            J[i] = scanner.nextInt();
            System.out.print("Programing Marks : ");
            O[i] = scanner.nextInt();
            System.out.print("Ethics Marks : ");
            P[i] = scanner.nextInt();
            

        }

        scanner.close();
    }

    
}