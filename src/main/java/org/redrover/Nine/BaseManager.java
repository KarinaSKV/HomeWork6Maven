package org.redrover.Nine;

public class BaseManager extends Worker{

    private int numberOfSubordinates;
    public BaseManager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }
}
