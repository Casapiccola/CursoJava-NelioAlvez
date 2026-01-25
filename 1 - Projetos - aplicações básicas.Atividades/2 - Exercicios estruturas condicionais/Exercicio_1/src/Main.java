import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo!");
        } else if (numero == 0) {
            System.out.println("O número é nulo!");
        } else {
            System.out.println("Número positivo!");
        }

        sc.close();

    }
}
