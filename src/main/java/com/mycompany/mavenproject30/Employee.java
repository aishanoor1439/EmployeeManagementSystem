package com.mycompany.mavenproject30;

public abstract class Employee {
    
//    Attributes
    protected String name;
    protected String department;
    protected double baseSalary;
    
//    Methods
    Employee(String name, String department, double baseSalary){
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }
    
    public double calculateSalary(){
        return baseSalary;
    }
    
    @Override
    public String toString(){
        return "Employee: " + name + ", Department: " + department + ", Salary: " + calculateSalary();
    }    
}
