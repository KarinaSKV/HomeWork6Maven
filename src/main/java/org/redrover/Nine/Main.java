package org.redrover.Nine;

public class Main {
    public static void main(String[] args) {
        Worker w1= new Worker("Anna", 100);
        Manager m1= new Manager("Alex jjj", 1000, 3);
        Director d1= new Director("Pobert", 1000, 5);
        Manager m2 = new Manager("Alex", 1000, 4);

        Worker [] arrEmpl = {w1, m1, d1, m2};
        BaseManager [] arrManag = { m1, d1, m2};
        for (int i = 0; i < arrEmpl.length; i++) {
            System.out.println(arrEmpl[i].getName() + " "+ arrEmpl[i].getSalary()); // почему вызыввается getName/ salary

        }

        System.out.println(Utill.scanName(arrEmpl, "Alex"));
        System.out.println(Utill.lookIntoName(arrEmpl, "Alex"));
        System.out.println(Utill.allSalary(arrEmpl));
        System.out.println(Utill.maxSalary(arrEmpl));
        System.out.println(Utill.minSubordinates(arrManag));



    }
}
