package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> listPersons = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char person = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (person == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                listPersons.add(new NaturalPerson(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                listPersons.add(new LegalPerson(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for (Person person : listPersons) {
            System.out.println(person);
            sum += person.taxCalculation();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);
        sc.close();
    }
}
