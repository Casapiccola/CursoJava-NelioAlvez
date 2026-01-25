import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Valor do X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (y > 0.0 && x < 0.0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q1");
        }
        
        sc.close();
    }
}