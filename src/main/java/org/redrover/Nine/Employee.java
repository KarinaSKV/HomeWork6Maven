package org.redrover.Nine;

public class Employee {
    private int baseSalary;
    private String name;


    public int getSalary() {

        return baseSalary;
    }

    public  String getName() {

        return name;
    }

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary =baseSalary;
    }
}

