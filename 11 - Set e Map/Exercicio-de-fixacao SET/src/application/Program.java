package application;

import model.entities.Courses;
import model.entities.Instructor;
import model.entities.Student;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Instructor instructor = new Instructor("Erik");

        List<Courses> courses = new ArrayList<>();
        courses.add(new Courses("A", instructor));
        courses.add(new Courses("B", instructor));
        courses.add(new Courses("C", instructor));

        instructor.setCourses(courses);

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            instructor.getCourses().get(0).getStudents().add(new Student(sc.nextInt()));
        }
        for (Student student : instructor.getCourses().get(0).getStudents()) {
            student.getCourses().add(courses.get(0));
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            instructor.getCourses().get(1).getStudents().add(new Student(sc.nextInt()));
        }
        for (Student student : instructor.getCourses().get(1).getStudents()) {
            student.getCourses().add(courses.get(1));
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            instructor.getCourses().get(2).getStudents().add(new Student(sc.nextInt()));
        }
        for (Student student : instructor.getCourses().get(2).getStudents()) {
            student.getCourses().add(courses.get(2));
        }

        for (Courses course : instructor.getCourses()) {
            instructor.getStudents().addAll(course.getStudents());
        }

        System.out.println("Total studants: " + instructor.getStudents().size());
        sc.close();
    }
}
