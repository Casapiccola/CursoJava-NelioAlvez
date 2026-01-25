package application;

import entities.Contract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level.toUpperCase());

        System.out.print("Base salary: $");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, workerLevel, baseSalary);

        System.out.print("How many contracts worker have: ");
        int nContracts = sc.nextInt();

        for (int i = 1; i <= nContracts; i++) {
            System.out.println("Contract #" + i + ": ");
            System.out.print("Date: ");
            LocalDate date = LocalDate.parse(sc.next(), fmt);

            System.out.print("Value hour: ");
            double valueHour = sc.nextDouble();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            Contract contract = new Contract(date, valueHour, hours);
            worker.addContract(contract);
        }

        System.out.print("Mouth to increase: ");
        int mouth = sc.nextInt();
        worker.increaseSalary(mouth);

        System.out.println(worker);

        sc.close();
    }
}
