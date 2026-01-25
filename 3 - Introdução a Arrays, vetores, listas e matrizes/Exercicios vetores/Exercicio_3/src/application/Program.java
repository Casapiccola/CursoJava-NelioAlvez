package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoa serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] peoples = new People[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            peoples[i] = new People(name, idade, altura);
        }

        double somaAlturas = 0;
        double idade16 = 0;
        for (int i=0; i<peoples.length; i++) {
            somaAlturas += peoples[i].getHeight();
            if (peoples[i].getAge() < 16) {
                idade16 += 1;
            }
       }
        double mediaAlturas = somaAlturas / peoples.length;
        idade16 = (idade16 * 100) / n;

        System.out.printf("Altura média: %.2f%n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f", idade16);
        System.out.println("%");
        for (int i=0; i<peoples.length; i++) {
            if (peoples[i].getAge() < 16) {
                System.out.println(peoples[i].getName());
            }
        }

        sc.close();
    }
}
