package org.redrover.Nine;

public class Director extends BaseManager{
    private static int KOEF_DIRECTOR = 9;

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() ==  0){
            return super.getSalary();
        }else {
            return super.getSalary() * getNumberOfSubordinates() / 100 * KOEF_DIRECTOR; // не тот get подтягивает. как подтянуть без чисел?
        }
    }

}
