package org.redrover.ThirteemTwo;

public  class MonthUtils {
    static final String [] mounth = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};

    static String  [] [] kvartal ( int mounthKol) {

        String [] [] kvartalThree= new String[][];

        for (int i = 0; i < mounth.length; i++) {
            if( mounthKol == 3){
                for (int j = 0; j< mounthKol; j++) {
                    kvartalThree[j][i] = mounth[i];
                    kvartalThree[j][i+1] = mounth[i+1];
                    kvartalThree[j][i+2] = mounth[i+2];
                    i+=2;
                }

            }

        } return kvartalThree;
    }
}
