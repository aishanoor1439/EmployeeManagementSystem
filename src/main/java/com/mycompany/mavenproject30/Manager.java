package com.mycompany.mavenproject30;

class Manager extends Employee {
    
//    Attributes
    private double bonus;
    
//    Methods
    public Manager(String name, String department, double baseSalary, double bonus) {
        super(name, department, baseSalary);
        this.bonus = bonus;
        calculateSalary();
        System.out.print(toString());
    }
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    @Override
    public String toString() {
        return "Manager: " + name + ", Department: " + department + ", Salary: " + calculateSalary();
    }
}
