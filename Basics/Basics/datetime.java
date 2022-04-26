package Basics.Basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class datetime {

public static void main(String[] args){
       System.out.println(LocalTime.now());
       System.out.println(LocalDate.now());
       System.out.println(LocalDateTime.now());
       System.out.println(LocalTime.now(ZoneId.of("US/Michigan")));
}
}


