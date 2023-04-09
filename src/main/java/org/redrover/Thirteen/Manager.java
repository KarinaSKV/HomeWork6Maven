package org.redrover.Thirteen;

public final class Manager extends BaseManager{

    public final int NUMBER_PODCHINEN = 3;

    public Manager(String name, int baseSalary, int numberOfSubordinates){
        super(name, baseSalary, numberOfSubordinates);
    }
    public int getNUMBER_MANAGER() {
        return NUMBER_PODCHINEN;
    }
  @Override
    public  int getSalary(){
        if (getNumberOfSubordinates() ==  0){
            return getSalary();
        }else {
            return getBaseSalary() * getNumberOfSubordinates() / 100 * NUMBER_PODCHINEN;
        }
    }
}
