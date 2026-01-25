import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        do {
            System.out.print("Digite um número de 1 a 1000: ");
            x = sc.nextInt();
        } while (!(1 <= x && x <= 1000));

        for (int i = 0; i < x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}