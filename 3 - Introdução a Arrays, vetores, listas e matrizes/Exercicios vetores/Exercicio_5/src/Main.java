import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        double maiorNumero = 0;
        int posicaoMaiorNumero = 0;
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();

            if (i == 0) {
                maiorNumero = numeros[i];
            }
            else if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaiorNumero = i;
            }

        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);
        System.out.printf("POSIÇÃO DO MAIOR VALOR: %d%n", posicaoMaiorNumero);

        sc.close();
    }
}
