package com.anotherexample;

public class Employee {

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private int id;
    private String department;
    private double salary;
    private String email;

    public void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + email);
    }

}
