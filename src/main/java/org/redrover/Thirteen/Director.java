package org.redrover.Thirteen;

public final class Director extends BaseManager{
    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
@Override
    public int getSalary(){
        if (getNumberOfSubordinates() ==  0){
            return getSalary();
        }else {
        final int NAMBER_DIRECTOR = 9;// почему нельзя public
        return getBaseSalary()*getNumberOfSubordinates()/100*NAMBER_DIRECTOR;
    }
    }
}
