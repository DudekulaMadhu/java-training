package Basics.java_27th;

import java.util.Scanner;

public class multiply {
    private static int multi;

    public static void main(String[] args){
        int i,num;
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = {2, 6, 8, 9, 5, 6, 4, 6, 5, 7};
            System.out.println("The given array is");
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println("Enter the number which you want to multiply with each element of array");
            num = sc.nextInt();
            System.out.println("Array after multiply with" + " "+num);
            System.out.println();
            for(i=0;i<arr.length;i++){
            multi=num*arr[i];
            System.out.println(multi+" ");
            }
        }
    }
}
