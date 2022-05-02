package core_java;

import java.util.Stack;

public class stackex {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(56);
        s.push(33);
        s.push(78);
        s.pop();
        System.out.println(s.isEmpty());
        s.forEach(System.out::println);
        //System.out.println(s);
    }
}
