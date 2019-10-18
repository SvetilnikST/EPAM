package by.svetilnik.epam.d_classes.simpleClasses.task3;

import java.util.ArrayList;

public class StudentView {
    public static void printInfoStudent(Student student) {
        System.out.println(student.fullName + " " + student.groupNumber);
    }

    public static void printStudents(ArrayList<Student> students) {
        System.out.println();
        for (Student student : students) {
            printInfoStudent(student);
        }
    }

    public static void printAllInfoStudent(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.print(student.fullName + " " + student.groupNumber + " ");
            for (int j = 0; j < student.progress.length; j++) {
                System.out.print(student.progress[j] + " ");
            }
            System.out.println();
        }
    }
}
