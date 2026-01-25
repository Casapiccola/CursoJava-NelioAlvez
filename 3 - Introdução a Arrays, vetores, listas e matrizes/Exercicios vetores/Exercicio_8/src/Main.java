import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter no vetor? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int somaPares = 0;
        int nPares = 0;
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if ((numeros[i] % 2) == 0) {
                somaPares += numeros[i];
                nPares += 1;
            }
        }

        double mediaPares = 0.0;
        if (somaPares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            mediaPares = somaPares / nPares;
            System.out.printf("MÉDIA DOS PARES = %.1f", mediaPares);
        }

        sc.close();
    }
}