package ru.aston.homework.lesson_6;

public class Person {

    String fullName;
    String jobTitle;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String fullName, String jobTitle, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName +
                ", должность: " + jobTitle +
                ", почта: " + email +
                ", номер телефона: " + phone +
                ", зарплата: " + salary +
                ", возраст: " + age;
    }
}