package com.mycompany.mavenproject30;

public class Engineer extends Employee{
    
//    Attributes
    private int experienceYears;
    
//    Methods
    public Engineer(String name, String department, double baseSalary, int experienceYears) {
        super(name, department, baseSalary);
        this.experienceYears = experienceYears;
        calculateSalary();
        System.out.print(toString());
    }
    @Override
    public double calculateSalary() {
        return baseSalary + (experienceYears*100);
    }
    @Override
    public String toString() {
        return "Engineer: " + name + ", Department: " + department + ", Salary: " + calculateSalary();
    }
    
}
