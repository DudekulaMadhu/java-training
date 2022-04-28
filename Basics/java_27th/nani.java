package Basics.java_27th;

interface honey{
    void name();
    void age();
    void school();
}
public class nani implements honey {
    public void name(){
        System.out.println("my name is Nani");
    }
    public void age(){
        System.out.println("my age is 20");
    }
    public void school(){
        System.out.println("my school name is pragathi school");
    }
    public static void main(String[] args){
        nani n = new nani();
        n.name();
        n.age();
        n.school();
    } 
}
