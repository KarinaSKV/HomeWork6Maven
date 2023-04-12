package org.redrover.Nine;


public class Utill{

       public static int scanName(Worker [] arrEmpl,String name){
        for (int i = 0; i < arrEmpl.length; i++) {
            if( name.equals(arrEmpl[i].getName())){
                return i;
            }
        }
            return -1;
        }

        public static int lookIntoName (Worker [] arrEmpl,String allString){
            for  (int i = 0; i < arrEmpl.length; i++) {
                if(arrEmpl[i].getName().contains(allString)){
                    return i;
                }
            }
            return -1;
        }

        public static int allSalary ( Worker [] arrEmpl ){
            int sum =0;
            for (int i = 0; i < arrEmpl.length; i++) {
                sum += arrEmpl[i].getSalary();
            }
            return sum;
        }

    public static int maxSalary ( Worker [] arrEmpl ){
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arrEmpl.length; i++) {
           if ( max < arrEmpl[i].getSalary()) {
               max = arrEmpl[i].getSalary();
           }
        }
        return max;
    }

    public static int minSubordinates ( BaseManager [] arrEmpl ){
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arrEmpl.length; i++) {
            if ( min > arrEmpl[i].getNumberOfSubordinates()) {
                min = arrEmpl[i].getNumberOfSubordinates();
            }
        }
        return min;
    }


}
