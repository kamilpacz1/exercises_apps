package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {

        //Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll ");
        Scanner scanner = new Scanner(System.in);
        int numbOfStudents = scanner.nextInt();
        Student[] students = new Student[numbOfStudents];

        //Create n number of new students
        for (int i = 0; i < numbOfStudents; i++) {
            Student stu = new Student();
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
}
