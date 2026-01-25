package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno:%n", i+1);
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, grade1, grade2);
        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i<students.length; i++) {
            if (students[i].gradeMedia() >= 6.00) {
                System.out.println(students[i].getName());
                students[i].setAprovado(true);
            }
        }

        sc.close();
    }
}
