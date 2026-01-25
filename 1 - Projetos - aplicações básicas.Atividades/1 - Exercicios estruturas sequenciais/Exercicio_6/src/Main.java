import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTri, areaCirc, areaTrapz, areaQuad, areaRet;
        double pi = 3.14159;

        System.out.print("Valor 1°: ");
        A = sc.nextDouble();
        System.out.print("Valor 2°: ");
        B = sc.nextDouble();
        System.out.print("Valor 3°: ");
        C = sc.nextDouble();

        areaTri = A * C / 2.0;
        areaCirc = pi * Math.pow(C, 2.0);
        areaTrapz = (A + B) * C / 2.0;
        areaQuad = B * B;
        areaRet = A * B;

        System.out.printf("Triangulo: %.3f%n", areaTri);
        System.out.printf("Circulo: %.3f%n", areaCirc);
        System.out.printf("Trapezio: %.3f%n", areaTrapz);
        System.out.printf("Quadrado: %.3f%n", areaQuad);
        System.out.printf("Retangulo: %.3f%n", areaRet);

        sc.close();
    }
}