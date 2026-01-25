import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte numero;

        System.out.print("Digite um número: ");
        numero = sc.nextByte();

        if (numero % 2 == 0) {
            System.out.println("Par!");
        } else if (numero == 0) {
            System.out.println("Nulo!");
        } else {
            System.out.println("Impar!");
        }

        sc.close();
    }
}