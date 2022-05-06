package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class sreamex1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("madhu");
        list.add("nani");
        list.add("honey");
        list.add("lucky");
        list.forEach(System.out::println);
        System.out.println(list.stream().findAny().get());
        Set<String> s = list.stream().sorted().collect(Collectors.toSet());
        System.out.println(s);
    }
}
