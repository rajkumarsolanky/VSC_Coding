import java.util.Scanner;

public class Mytpye {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("My Information");

            System.out.println("Name");
            String a = sc.nextLine();

            System.out.println("Father name");
            String b = sc.nextLine();

            System.out.println("Caste");
            String caste = sc.nextLine();

            System.out.println("University of Name");
            String uni = sc.nextLine();

            System.out.println("Department");
            String sub = sc.nextLine();


            System.out.println("Roll Number");
            long r = sc.nextLong();

            System.out.println("Blood Group");
            String my = sc.next();

            System.out.println("Mobile Number");
            long g = sc.nextLong();

            System.out.println("complete Yes type ");
            System.out.println("YOUR INFORMATION" );
            System.out.println("Name  " + a );
            System.out.println("Father Name  " + b);
            System.out.println("Caste   " + caste);
            System.out.println("Whatsapp Number   0" + g);
            System.out.println("Roll Number    "+ r);
            System.out.println("University of name    "  + uni);
            System.out.println("Department   " + sub);
            System.out.println("Blood Group    " + my);
        }


    }
    
}
