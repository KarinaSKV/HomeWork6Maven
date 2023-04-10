package org.redrover.ThirteemTwo;

import java.util.Arrays;

public class MonthUtils {
    static final Month[] mounth = {
            new Month("January", 30, 20),
            new Month("February", 30, 20),
            new Month("March", 30, 20),
            new Month("April", 30, 20),
            new Month("May", 30, 20),
            new Month("June", 30, 20),
            new Month("July", 30, 20),
            new Month("August", 30, 20),
            new Month("September", 30, 20),
            new Month("October", 30, 20),
            new Month("November", 30, 20),
            new Month("December", 31, 19)
    };

    public static void kvartal(int mounthKol) {
        for (int i = 0; i < mounth.length; i++) {

            if (mounthKol == 12) {

                System.out.println(mounth[i].mounth + " day " + mounth[i].day + " WD " + mounth[i].workDay);

            } else if (mounthKol == 6) {
                for (int j = 0; j < 6; j++) {
                    System.out.println(mounth[i].mounth + " day " + mounth[i].day + " WD " + mounth[i].workDay);
                    i++;
                }
                System.out.println("second part");
                for (int j = 6; j < mounth.length; j++) {
                    System.out.println(mounth[i].mounth + " day " + mounth[i].day + " WD " + mounth[i].workDay);
                    i++;
                }
            }else if ( mounthKol == 3){

            } else{
                System.out.println("здайте верный квартал ");
            }
        }
    }
}
