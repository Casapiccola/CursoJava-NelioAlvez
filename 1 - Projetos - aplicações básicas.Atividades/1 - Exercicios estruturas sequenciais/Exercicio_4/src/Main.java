import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num_func, work_hrs;
        double sal_hr, salario;

        System.out.print("Qual o seu número? ");
        num_func = sc.nextInt();
        System.out.print("Horas trabalhadas? ");
        work_hrs = sc.nextInt();
        System.out.print("Quanto você recebe por hora? ");
        sal_hr = sc.nextDouble();

        salario = (double) work_hrs * sal_hr;

        System.out.printf("NUMBER: %d%nSALARY: U$ %.2f%n", num_func, salario);

        sc.close();
    }
}
