package com.example.student_management.model;

public class Student {
    private String id;
    private String name;
    private String email;
    private double average;

    public Student() {
    }

    public Student(String id, String name, String email, double average) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
