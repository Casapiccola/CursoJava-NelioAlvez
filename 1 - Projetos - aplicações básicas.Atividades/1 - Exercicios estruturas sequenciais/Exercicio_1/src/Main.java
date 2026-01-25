import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.print("Digite um número: ");
        a = sc.nextInt();
        System.out.print("Digite outro número: ");
        b = sc.nextInt();
        soma = a + b;

        System.out.printf("%d + %d = %d", a, b, soma);

        sc.close();
    }
}
