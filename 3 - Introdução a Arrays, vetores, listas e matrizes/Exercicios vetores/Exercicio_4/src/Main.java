import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int nPares = 0;
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i=0; i<numeros.length; i++) {
            if ((numeros[i] % 2) == 0) {
                System.out.printf("%d ", numeros[i]);
                nPares += 1;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Quantidades de pares = " + nPares);

        sc.close();
    }
}
