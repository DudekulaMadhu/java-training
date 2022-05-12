package mayTest_12th;


public class leapYear {
    public static void main(String[] aegs){
        int year = 2022;
        int n = 7;
        int count = 0;
        while(count != n){
            year = year + 1;
           if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            count++; 
            System.out.println(year);       
           }

        }
    }
}
