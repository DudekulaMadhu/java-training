package Basics.Basics;

public class methodex {
    public static void add(int a, int b){
        System.out.println("sum of (" + a +"," + b +") =" + (a + b));
    }
    public static boolean even(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        add(5,6);
        add(12,34);
    }
}
