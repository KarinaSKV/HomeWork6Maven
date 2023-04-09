package org.redrover.Thirteen;

public abstract class BaseManager extends Employee{ // почему baseManager должен быть абстрактный
    private int numberOfSubordinates ;

    public BaseManager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
