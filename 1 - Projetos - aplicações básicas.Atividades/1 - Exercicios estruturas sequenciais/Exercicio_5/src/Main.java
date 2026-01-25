import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int codigoProd1, codigoProd2, numProd1, numProd2;
        double valUniProd1, valUniProd2, total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto 1°: ");
        codigoProd1 = sc.nextInt();
        System.out.print("Número de peças: ");
        numProd1 = sc.nextInt();
        System.out.print("Valor da Unidade do produto: R$ ");
        valUniProd1 = sc.nextDouble();

        System.out.print("\nCodigo do produto 2°: ");
        codigoProd2 = sc.nextInt();
        System.out.print("Número de peças: ");
        numProd2 = sc.nextInt();
        System.out.print("Valor da Unidade do produto: R$ ");
        valUniProd2 = sc.nextDouble();

        total = valUniProd1 * numProd1 + valUniProd2 * numProd2;

        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
