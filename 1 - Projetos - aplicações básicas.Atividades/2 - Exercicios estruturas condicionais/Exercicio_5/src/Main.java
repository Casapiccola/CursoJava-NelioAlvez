import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valor = 0;

        System.out.print("Qual o codigo do produto? ");
        codigo = sc.nextInt();
        System.out.print("Quantos deseja? ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valor = 4.00 * quantidade;
        } else if (codigo == 2) {
            valor = 4.50 * quantidade;
        } else if (codigo == 3) {
            valor = 5.00 * quantidade;
        } else if (codigo == 4) {
            valor = 2.00 * quantidade;
        } else if (codigo == 5) {
            valor = 1.50 * quantidade;
        }

        System.out.printf("Valor a pagar R$ %.2f", valor);

        sc.close();
    }
}
