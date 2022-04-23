import java.util.Scanner;
public class eligible {
   public static void main(String[] args){
       String s = "Madhu";
       System.out.println("Enter the age");
       try (Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
           if(age >= 18){
               System.out.println(s+" "+"is eligible");
           }else{
               System.out.println(s+" "+"is not eligible");
           }
    }
   } 
}
