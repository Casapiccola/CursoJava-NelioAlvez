import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1;
        int y = 1;

        while (x != 0 || y != 0) {
            System.out.print("Valor de X: ");
            x = sc.nextInt();
            System.out.print("Valor de Y: ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }

        }

        sc.close();
    }
}