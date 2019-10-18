package by.svetilnik.epam.d_classes.simpleClasses.task3;

import java.util.ArrayList;

public class StudentLogic {
    private static final int POINT_NINE = 9;
    private static final int POINT_TEN = 10;

    public static ArrayList<Student> fillListStudent() {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1 Ivanov", "P-1", new int[]{10, 10, 10, 10, 9}));
        students.add(new Student("2 Petrov", "P-2", new int[]{5, 6, 7, 8, 4}));
        students.add(new Student("3 Novikov", "P-3", new int[]{5, 6, 7, 8, 9}));
        students.add(new Student("4 Sidorov", "P-3", new int[]{5, 6, 7, 8, 9}));
        students.add(new Student("5 Sidorov", "P-3", new int[]{5, 6, 7, 8, 1}));
        students.add(new Student("6 Novikov", "P-3", new int[]{5, 6, 7, 8, 2}));
        students.add(new Student("7 Sidorov", "P-3", new int[]{5, 6, 7, 8, 9}));
        students.add(new Student("8 Sidorov", "P-3", new int[]{9, 9, 9, 9, 9}));
        students.add(new Student("9 Lionov", "P-3", new int[]{5, 6, 7, 10, 4}));

        return students;
    }

    public static ArrayList<Student> findExcellentStudents(ArrayList<Student> students) {

        int count = 0;
        ArrayList<Student> studentExcellent = new ArrayList<>();
        for (Student student : students) {
            for (int j = 0; j < student.progress.length; j++) {
                if (student.progress[j] == POINT_NINE || student.progress[j] == POINT_TEN) {
                    count++;
                }
            }
            if (count == student.progress.length) {
                studentExcellent.add(student);
            }
            count = 0;
        }
        return studentExcellent;
    }
}
