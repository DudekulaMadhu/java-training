package mayTest_13th;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the numer: ");
            int number = sc.nextInt();
            int i=1,fact=1;
            while(i<=number){
                fact = fact * i;
                i++;
            }
            System.out.println("factorial of the number : " + fact);
        }
    }
}
