package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();
        System.out.print(". Freshmen \n2. Sophmore \n3. Junior \n4. Senior \nEnter student class level: ");
        this.gradeYear = scanner.nextInt();
        setStudentID();
    }

    //generate an ID
    private void setStudentID() {
        //grade lvl + ID
        ++id;
        this.studentID = gradeYear + "" + id;

    }

    // enroll in courses

    public void enroll() {
        //get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                System.out.println("Break!");
                break;
            }
        } while (1 != 0);

        System.out.println("Enrolled in: " + courses);
        System.out.println("tuition balance " + tuitionBalance);
    }

    //view balance

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //show status

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Grade Level=" + gradeYear +
                ", student ID='" + studentID + '\'' +
                ", courses='" + courses + '\'' +
                ", Balance=" + tuitionBalance +
                '}';
    }
}

