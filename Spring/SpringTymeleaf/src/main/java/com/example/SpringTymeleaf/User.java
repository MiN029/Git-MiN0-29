package com.example.SpringTymeleaf;


public class User {

    private String firstName;
    private String lastName;
    private int Age;
    private String email;

    private String role;

    public User(String firstName, String lastName, int Age, String email , String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
        this.email = email;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
