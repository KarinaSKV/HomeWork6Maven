package org.redrover.Thirteen;

public abstract class Employee {
    int baseSalary;
    String name;
    int salary;

    public Employee(String name, int baseSalary) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

//    public void setBaseSalary(int baseSalary) {
//        this.baseSalary = baseSalary;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public abstract int getSalary() ;
}
