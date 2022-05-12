package mayTest_12th;

import java.time.Year;

public class leapYear {
    public static boolean isLeapYear(int year){
        return Year.isLeap(year);
    }
    public static void main(String[] aegs){
        final int startyear = 2022;
        final int endyear = startyear + 50;
        for(int i = startyear; i < endyear; i++){
            if(isLeapYear(i)){
                System.out.println(i);
            }
        }
    }
}
