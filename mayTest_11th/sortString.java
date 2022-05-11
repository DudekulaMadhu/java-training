package mayTest_11th;

import java.util.Arrays;

public class sortString {
    public static void main(String[] args){
        String str1 = "madhu";
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

        // another way

        String str = "honey";
        char[] arr = str.toCharArray();

        char temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1;j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
