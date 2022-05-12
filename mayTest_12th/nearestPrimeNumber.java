package mayTest_12th;

public class nearestPrimeNumber {
    static int prime(int n){
        if(n % 2 != 0)
            n -= 2;
        else  
            n--;
            
        int i, j;
        for(i = n; i >=2; i -= 2){
            if(i % 2 == 0)
               continue;
            for(j = 3; j <= Math.sqrt(i); j += 2){
                if(i % j == 0)
                  break;
            }
            if(j > Math.sqrt(i))
              return i;
        }
        return 2;
    }
    public static void main(String[] args){
        int n = 20;
        System.out.println(n);
    }
}
