import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hrInicial, hrFinal, duracao;

        System.out.print("Qual a hora inicial do jogo? ");
        hrInicial = sc.nextInt();
        System.out.print("Qual a hora final do jogo? ");
        hrFinal = sc.nextInt();

        if (hrInicial < hrFinal) {
            duracao = hrFinal - hrInicial;
        } else {
            duracao = 24 - hrInicial + hrFinal;
        }

        System.out.printf("A duração do jogo foi de: %d horas", duracao);

        sc.close();
    }
}