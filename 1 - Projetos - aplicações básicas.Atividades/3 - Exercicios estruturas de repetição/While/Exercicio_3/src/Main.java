import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int preferencia;

            System.out.println("Qual sua preferência? ");
            System.out.printf("[1] Alcool%n[2] Gasolina%n[3] Diesel%n[4] Sair%n");
            System.out.print("Escolha: ");
            preferencia = sc.nextInt();

            if (preferencia == 1) {
                alcool += 1;
            } else if (preferencia == 2) {
                gasolina += 1;
            } else if (preferencia == 3) {
                diesel += 1;
            } else if (preferencia == 4) {
                System.out.println("MUITO OBRIGADO");
                System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
                break;
            } else {
                System.out.println("Escolha inválida!");
            }

        }

        sc.close();
    }
}