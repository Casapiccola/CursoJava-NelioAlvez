import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        double soma = 0.0;
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.printf("%.1f%n", numeros[i]);
            }
        }

        sc.close();
    }
}
