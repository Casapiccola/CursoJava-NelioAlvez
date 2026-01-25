import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i=0; i< numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("Valores = ");

        double sum = 0;
        for (int i=0; i< numeros.length; i++) {
            System.out.printf("%.1f ", numeros[i]);
            sum += numeros[i];
        }

        double media = sum / numeros.length;

        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}