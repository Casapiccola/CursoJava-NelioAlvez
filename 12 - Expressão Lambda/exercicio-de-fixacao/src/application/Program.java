package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String filePath = "C:/home/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.println("Email of  people whose salary is more than " + String.format("%.2f", salary) + ": ");
            employees.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList()
                    .forEach(System.out::println);

            double employeeSalary = employees.stream()
                    .filter(p -> p.getName().toUpperCase().startsWith("M"))
                    .mapToDouble(Employee::getSalary)
                    .sum();

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", employeeSalary));
        }
        catch (IOException e) {
            e.getStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
