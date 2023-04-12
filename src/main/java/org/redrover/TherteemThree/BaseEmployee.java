package org.redrover.TherteemThree;

import org.redrover.ThirteemTwo.Month;

public abstract class BaseEmployee {
    private int age;
    private String name;
    private String pol;
    private int salaryDay;
    public BaseEmployee(String name, int age,  String pol, int salaryDay) {
        this.age = age;
        this.name = name;
        this.pol = pol;
        this.salaryDay = salaryDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public int getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(int salaryDay) {
        this.salaryDay = salaryDay;
    }
    public  int getSalary(Month[] monthArray){
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum+= monthArray[i].getWorkDay()*getSalaryDay();
        }
        return sum;
    }
}
