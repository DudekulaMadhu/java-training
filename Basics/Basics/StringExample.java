package Basics.Basics;

public class StringExample {
    public static void main(String[] args){
        String s = "Madhu is a learner";
        System.out.println(s.length());
        System.out.println(s.charAt(s.length() -1));
        System.out.println(s.substring(0,15));
        System.out.println(s.indexOf("s"));
        System.out.println(s.equals("Madhu is a learner"));
        System.out.println(s.replace("Madhu","Nani"));

        String[] sarr = s.split(",");
        for(String str: sarr){
            System.out.println(str);
        }
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String str = "";
        for(int i = s.length() - 1;i>0;i--){
            str += s.charAt(i);
        }
        return str;     
    }
}
