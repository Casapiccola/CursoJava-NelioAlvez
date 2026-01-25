package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] peoples = new People[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            peoples[i] = new People(name, idade);
        }

        int oldPeople = 0;
        String nameOldPeople = "";
        for (int i=0; i<peoples.length; i++) {
            if (i == 0) {
                oldPeople = peoples[i].getAge();
                nameOldPeople = peoples[i].getName();
            }
            else if (peoples[i].getAge() > oldPeople) {
                oldPeople = peoples[i].getAge();
                nameOldPeople = peoples[i].getName();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nameOldPeople);

        sc.close();
    }
}
