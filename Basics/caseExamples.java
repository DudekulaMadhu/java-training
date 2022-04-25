package Basics;

public class caseExamples {
    public static void main(String[] args){
        int weight = 40;
        int ch=0;
        if(weight > 90){
            ch=0;
        }else if(weight < 30){
            ch=1;
        }else if(weight >= 45 && weight <= 65){
            ch=2;
        }
        switch(ch){
            case 0:System.out.println("fat");break;
            case 1:System.out.println("thin");break;
            case 2:System.out.println("your healthy");break;
            default:System.out.println("invalid age");break;
        }
    }
}
