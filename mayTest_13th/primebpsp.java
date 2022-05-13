package mayTest_13th;

import java.util.Scanner;

public class primebpsp{
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int smallPrime(int num){
        for(int i = num - 1; i > 0; i--){
            if(isPrime(i)){
                return i;
            }
        }
        return -1;
    }
    public static int biggerPrime(int num){
        int count = num + 1;
        while(true){
            if(isPrime(count)){
                return count;
            }
            count++;
        }
    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return num;
    }
    public static void main(String[] args){
         int num = input();
         if(isPrime(num)){
            System.out.println("it is prime itself");
         }else{
            int s1 = smallPrime(num);
            int b1 = biggerPrime(num);

            int s2 = smallPrime(s1);
            int bs2 = biggerPrime(s1);

            int b2 = smallPrime(b1);
            int sb2 = biggerPrime(b1);

            int solution = (s2 + b2) * (bs2 + sb2);
            System.out.println("product = " + solution);
            
         }
    }
}