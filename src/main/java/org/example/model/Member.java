package org.example.model;

// basic class of our project. Models the members of the organism with their respective attributes.
public class Member {
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
    private int age;

    public Member(String firstName, String lastName, String email, Long phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}
