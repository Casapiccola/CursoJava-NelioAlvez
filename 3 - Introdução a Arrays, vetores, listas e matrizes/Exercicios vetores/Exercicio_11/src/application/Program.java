package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        People[] peoples = new People[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            char genero = sc.next().charAt(0);

            peoples[i] = new People(genero, altura);
        }

        double menorAltura = peoples[0].getHeight();
        double maiorAltura = peoples[0].getHeight();
        double sumAlturaMulheres = 0.0;
        int numMulheres = 0;
        int numHomens = 0;
        for (int i=0; i<peoples.length; i++) {

            if (peoples[i].getHeight() > maiorAltura) {
                maiorAltura = peoples[i].getHeight();
            }

            if (peoples[i].getHeight() < menorAltura) {
                menorAltura = peoples[i].getHeight();
            }

            if (peoples[i].getGender() == 'F' || peoples[i].getGender() == 'f') {
                sumAlturaMulheres += peoples[i].getHeight();
                numMulheres += 1;
            }
            else {
                numHomens += 1;
            }

        }

        double mediaAlturaMulheres = sumAlturaMulheres / numMulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Número de homens = %d%n", numHomens);
        sc.close();
    }

}
