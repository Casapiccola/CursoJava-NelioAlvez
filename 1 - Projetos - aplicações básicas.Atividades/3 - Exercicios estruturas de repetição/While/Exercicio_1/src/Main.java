import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senhaUsario = "123";
        boolean senhaCorreta = false;

        while (!senhaCorreta) {

            String senha = "";

            System.out.print("Digite sua senha: ");
            senha = sc.nextLine();

            if (senhaUsario.equals(senha)) {
                System.out.println("Acesso permitido!");
                senhaCorreta = true;
            }
            else {
                System.out.println("Senha inválida!");
            }

        }

        sc.close();
    }
}