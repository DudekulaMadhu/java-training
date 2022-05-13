package mayTest_13th;

import java.time.LocalDate;
import java.time.Period;

public class findDate{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate end_date = LocalDate.of(2022,05,21);

        Period p = Period.between(today, end_date);

        System.out.println(p.getDays() + " Days");    
    }
}