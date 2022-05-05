package core_java;

import java.util.HashMap;
import java.util.Map;

public class mapex {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Map is empty : " + map.isEmpty());
        map.put("Madhu",1234);
        map.put("Nani",5678);
        map.put("Sameena", 987);
        System.out.println("Map is empty : " + map.isEmpty());

        System.out.println("key : Madhu, value : " + map.get("Madhu"));
        System.out.println("key : Nani, value : " + map.get("Nani"));

        System.out.println("key : lucky is there ? " + map.containsKey("lucky"));
        System.out.println("key : 4567 is there ? " + map.containsValue(4567));

        map.remove("Nani");
        System.out.println("key : Nani removed");

        map.put("Teja",1234567);

        map.forEach((K, v) ->{
            System.out.println("key : " + K + ", value : " + v);
        });
    }
}
