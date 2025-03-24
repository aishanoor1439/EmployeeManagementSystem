package com.mycompany.mavenproject30;

public class Intern extends Employee{
        
//    Attributes
    private int monthsDuration;
    
//    Methods
    public Intern(String name, String department, double baseSalary, int monthsDuration) {
        super(name, department, baseSalary);
        this.monthsDuration = monthsDuration;
        calculateSalary();
        System.out.print(toString());
    }
    @Override
    public double calculateSalary() {
        return baseSalary/2;
    }
    @Override
    public String toString() {
        return "Intern: " + name + ", Department: " + department + ", Salary: " + calculateSalary();
    }
    
}
