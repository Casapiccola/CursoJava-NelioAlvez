package aplication;

import entities.Money;
import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Whats is the dollar price? ");
        double dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double reaisValue = sc.nextDouble();
        System.out.println();

        Money money = new Money(dolarPrice, reaisValue);
        System.out.println(money.dollar + money.reais);

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converterDol(dolarPrice, reaisValue));

        sc.close();
    }
}
