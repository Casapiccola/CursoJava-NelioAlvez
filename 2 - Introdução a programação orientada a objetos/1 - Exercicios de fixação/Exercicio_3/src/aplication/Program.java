package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Nota primeiro trimestre: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Nota segundo trimestre: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Nota terceiro trimestre: ");
        student.nota3 = sc.nextDouble();

        System.out.print(student.finalResult());

        sc.close();
    }
}
