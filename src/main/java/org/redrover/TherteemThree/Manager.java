package org.redrover.TherteemThree;

import org.redrover.ThirteemTwo.Month;

public final class Manager extends BaseEmployee{

    private int numberSubordinates;

    public Manager(String name, int age, String pol, int salaryDay, int numberSubordinates) {
        super(name, age, pol, salaryDay);
        this.numberSubordinates = numberSubordinates;
    }

    public int getNumberSubordinates() {
        return numberSubordinates;
    }

    public void setNumberSubordinates(int numberSubordinates) {
        this.numberSubordinates = numberSubordinates;
    }
@Override
    public int getSalary(Month[] monthArray){
        return (int) (super.getSalary(monthArray)*(1.0+getNumberSubordinates() /100));
    }

}
