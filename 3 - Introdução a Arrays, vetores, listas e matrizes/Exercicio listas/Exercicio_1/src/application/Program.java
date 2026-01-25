package application;

import entities.Employee;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employee will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Emplyoee #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            while (hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        employees.sort(Comparator.comparing(Employee::getId));

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase? ");
        int id = sc.nextInt();
        Employee result = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (result != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            result.increaseSalary(percentage);
        }
        else {
            System.out.println("This id does not exist!");
        }

        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
    
}
