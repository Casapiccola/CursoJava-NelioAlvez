import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, maiorNumero, menorNumero;

        System.out.print("Digite um número: ");
        A = sc.nextInt();
        System.out.print("Digite outro número: ");
        B = sc.nextInt();

        if (A > B) {
            maiorNumero = A;
            menorNumero = B;
        } else {
            maiorNumero = B;
            menorNumero = A;
        }
        
        if (maiorNumero % menorNumero == 0) {
            System.out.println("É multiplo!");
        } else {
            System.out.println("Não é Multiplo!");
        }

        sc.close();
    }
}