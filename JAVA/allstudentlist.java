import java.util.Scanner;
public class allstudentlist {
    public static void main(String[] args) {
        try (Scanner A = new Scanner(System.in)) {
            System.out.println("ALL STUDENT LIST");
            System.out.println("Name of Student");
            String B = A.nextLine();
            System.out.println("Roll Number : 2k23/ITE/");
            int c = A.nextInt();
            System.out.println("English Marks");
            int d = A.nextInt();
            System.out.println("Philosophy Marks");
            int e = A.nextInt();
            System.out.println("Calculus Marks");
            int f = A.nextInt();
            System.out.println("Programing Marks");
            int g = A.nextInt();
            System.out.println("Ethics Marks");
            int h = A.nextInt();
            int i = d+e+f+g+h;
            int j = 500;
            int k = i*100/j;

            System.out.println("*_* ALL STUDENT LIST *_*");
            System.out.println("Name : "+ B);
            System.out.println("Roll Number : 2k23/ITE/"+ c );
            System.out.println("English : "+ d +"  Philosophy : "+ e +"  Calculus : "+ f +"  Programing : "+ g +"  Ethics : "+ h );
            System.out.println("Total marks : "+ j +"  Ob marks : "+ i +"  percentage : "+ k +"%");

        }
        
    }
    
}
