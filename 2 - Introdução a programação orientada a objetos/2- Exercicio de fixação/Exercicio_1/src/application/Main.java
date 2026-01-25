package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Enter there na initial deposit? (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(code, name, initialDeposit);
        }
        else {
            account = new Account(code, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }

}
