import java.util.Scanner;
public class celsius {
    public static void main(String[] args) {
    
        Scanner a = new Scanner(System.in);
        System.out.print(" °C : ");
        double celsius = a.nextDouble();
        a.close();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °C = " + fahrenheit + " °F");
    }
}
