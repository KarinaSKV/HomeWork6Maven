package org.redrover.Thirteen;

public class Main {
    public static void main(String[] args) {
        BaseManager[] arrBaseManager = {
                new Manager("Anna",100, 10),
                new Director("Alex", 100,10)};
        for (int i = 0; i < arrBaseManager.length; i++) {
            System.out.println(arrBaseManager[i].getSalary());

        }
    }

}
