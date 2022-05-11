package Basics.Basics;

public class arrayex {
    public static void main(String[] args){
        int[] arr = new int[5];
        Object[] obj = new Object[2];

        //int[] arr2 = {10, 20, 30, 40, 50};
        //same data-type

        obj[0] = "Madhu";
        obj[1] = 10;

        for(Object ob : obj){
            System.out.println(ob.toString());
        }
        arr[0] = 10;
        arr[3] = 30;
        arr[2] = 40;
        arr[1] = 50;
        arr[4] = 0;

        int sum = 0;

        //for-each
        for(int i : arr){
            sum = sum + i;
            //pre + new
            System.out.println("sum = "+ sum);
        }
    }
}

