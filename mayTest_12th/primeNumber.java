package mayTest_12th;

public class primeNumber {
    public static void main(String[] args){
        int a=1;
        int b=50;
        for(int i=a;i<=b;i++){
            if(checkPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static boolean checkPrime(int num){
        if(num<2){
            return false;
        }
        else{
            int x=num/2;
            for(int i=2;i<x;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
