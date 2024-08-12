import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("check CGPA");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Programing");
            Float A = sc.nextFloat();
            System.out.println("English");
            Float B = sc.nextFloat();
            System.out.println("Sindhi");
            Float C = sc.nextFloat();
            System.out.println("urdu");
            Float D = sc.nextFloat();
            float E = (A + B + C + D)/15*4;
            System.out.println("CGPA  :   " + E);
        }

    }
}
