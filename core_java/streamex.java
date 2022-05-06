package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamex {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(5);
        list.add(10);
        list.add(7);

        //1st method
        System.out.println("Even number:-");
        for(int e : list){
            if(e % 2 == 0){
                System.out.println(e);
            }
        }

        //2nd method
        System.out.println("\nEven number:-");
        list.stream().filter(e -> (e % 2 == 0)).sorted()
            .collect(Collectors.toMap(e -> e+" Meow", Function.identity()))
            .forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
