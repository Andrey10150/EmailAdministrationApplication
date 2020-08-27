package com.sydorenko;

public class EmailApplication {
    public static void main(String[] args) {
        Email email = new Email("Andrey", "Sydorenko");
        System.out.println(email.showInfo());
    }
}
