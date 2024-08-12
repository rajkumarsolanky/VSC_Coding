import java.util.Scanner;

public class aplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("My Information");
            System.out.println("Name");
            String a = sc.next();
            System.out.println("Father name");
            String b = sc.next();
            System.out.println("Caste");
            String caste = sc.next();
            System.out.println("Mobile Number");
            long phonenumber = sc.nextLong();
            System.out.println("Roll Number");
            int rollnum = sc.nextInt();
            System.out.println("University of Name");
            String uni = sc.next();
            System.out.println("Deparment");
            String sub = sc.next();
            System.out.println("Blood Group");
            String my = sc.next();
            
            
            System.out.println("YOUR INFORMATION" );
            System.out.println("name  " + a );
            System.out.println("father name  " + b);
            System.out.println("Caste   " + caste);
            System.out.println("Call#   0" + phonenumber);
            System.out.println("Roll Number    "+ rollnum);
            System.out.println("University of name    "  + uni);
            System.out.println("Deparment   " + sub);
            System.out.println("Blood Group    " + my );
        }


    }
    
}
