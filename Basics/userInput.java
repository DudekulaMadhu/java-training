package Basics;

import java.util.Scanner;//import

public class userInput {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();//input
        System.out.println("You entered = "+n);
    }
}
