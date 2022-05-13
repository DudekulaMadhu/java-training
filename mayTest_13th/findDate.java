package mayTest_13th;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class findDate{
    public static void findDifference(String start_date, String end_date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    try{
        Date d1 = sdf.parse(start_date);
        Date d2 = sdf.parse(end_date);
        long difference_In_Time = d2.getTime() - d1.getTime();
        long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24));
        System.out.println("Difference" + "between two dates is :");
        System.out.println(difference_In_Days + " days");
     }catch(ParseException e){
         e.printStackTrace();
     }
    }
    public static void main(String[] args) throws ParseException{
        String start_date = "10-05-2022";
        String end_date = "18-05-2022";
        findDifference(start_date, end_date);
    }
}