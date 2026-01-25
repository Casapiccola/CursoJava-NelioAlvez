import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Digite um valor: ");
        numero = sc.nextDouble();

        if (numero >= 0.0 && numero <= 25.0) {
            System.out.println("Entre 0 a 25");
        } else if (numero >= 25.0 && numero <= 50.0) {
            System.out.println("Entre 25 a 50");
        } else if (numero >= 50.0 && numero <= 75.0) {
            System.out.println("Entre 50 a 75");
        } else if (numero >= 75.0 && numero <= 100.0) {
            System.out.println("Entre 75 a 100");
        } else {
            System.out.println("Fora do intervalo");
        }

        sc.close();
    }
}