package com.example.backend.model;

public class Student {
    private String id;
    private String name;
    private String email;
    private double attendance;
    private double overallGPA;

    // Constructors
    public Student() {}

    public Student(String id, String name, String email, double attendance, double overallGPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.attendance = attendance;
        this.overallGPA = overallGPA;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getAttendance() { return attendance; }
    public void setAttendance(double attendance) { this.attendance = attendance; }

    public double getOverallGPA() { return overallGPA; }
    public void setOverallGPA(double overallGPA) { this.overallGPA = overallGPA; }
}