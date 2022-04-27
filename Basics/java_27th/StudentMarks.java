package Basics.java_27th;

public class StudentMarks {
   public static void main(String[] args){
       int[] arr = {89, 30, 50, 40, 34, 56,99, 57, 78, 67};
       int greatest,lowest;
       greatest = arr[0];
       lowest = arr[0];
       for(int i=0;i<arr.length;i++){
           if(greatest<arr[i]){
               greatest = arr[i];
           }
       }
       for(int j=0;j<arr.length;j++){
           int i;
        if(lowest>arr[i]){
               lowest = arr[i];
           }
       }
       System.out.println("greatest =" + greatest);
       System.out.println("lowest =" + lowest);
   }  
}
