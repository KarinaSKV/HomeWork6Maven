package org.redrover.Thirteen;

public class Worker extends Employee{
    public Worker(String name, int baseSalary) {
        super(name,baseSalary);
    }

    @Override
    public final int getSalary(){
        return getBaseSalary();
    }
}
