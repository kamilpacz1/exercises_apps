package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 7;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySufix = "company.com";

    //Constructor to receive the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "" + lastName.toLowerCase() + "@" + department + "." + companySufix;
        System.out.println("Your email is: " + email);

    }

    //Ask for the department
    private String setDepartment() {
        System.out.println("Enter the department\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if(departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }


    //Generate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNPQRStUWXYZ012345678!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]  = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailbox capacity

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;

    }


    //Set the alternate email

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password


    public void setPassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", defaultPasswordLength=" + defaultPasswordLength +
                ", email='" + email + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                ", companySufix='" + companySufix + '\'' +
                '}';
    }
}
