package org.redrover.Nine;


public class Manager extends  BaseManager{

    private static int KOEF_MANAGER = 3;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary,numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() ==  0){
         return super.getSalary();
        }else {
            return super.getSalary() * getNumberOfSubordinates() / 100 * KOEF_MANAGER;
        }
    }
}
