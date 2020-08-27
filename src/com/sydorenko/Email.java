package com.sydorenko;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "nicecompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println(email);
    }

    private String setDepartment() {
        System.out.println("New worker " + firstName + "\nDepartment Codes" + "\n1 for sales\n2 for development\n3 for accounting\n4 for none\n Enter department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        switch (depChoice) {
            case 1:
                return "department";
            case 2:
                return "development";
            case 3:
                return "accounting";
            default:
                return "";
        }
    }

    private String randomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * characters.length());
            password[i] = characters.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
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

    public String showInfo() {
        return "NAME: " + firstName + " " + lastName +
                "\nEMAIL: " + email + "\nMAIL BOX CAPACITY IS " + mailboxCapacity + "mb";
    }
}
