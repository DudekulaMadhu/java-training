package core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class listex {
   public static List<Integer>convertIntoList(){
       int [] arr = {10, 15, 30, 56, 78};
       //ArrayList<Integer>[]> list = Array.asList(arr);
       List<Integer>list = new ArrayList<>();
       for (int e : arr){
           list.add(e);
       }
       return list;
   } 
   public static void main(String[] args){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(67);
       list.add(56);
       list.add(-89);

       list.remove(2);
       list.add(2, 45);

       System.out.println(list);
       System.out.println(list.size());
       System.out.println(list.get(1));
       System.out.println(list.contains(90));
       System.out.println(list.indexOf(90));
       System.out.println("1) Element :- ");
       for (int i = 0;i < list.size();i++){
           System.out.println(list.get(i));
       }
       System.out.println("2) Element:- ");
       for (int e : list){
           System.out.println(e);
       }
       System.out.println("Lamba :-");
       list.forEach(e -> System.out.println(e));
       System.out.println("Enhanced :- ");
       list.forEach(System.out::println);
       System.out.println("Iterator :- ");
       Iterator<Integer> it = list.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
   }
}
class c implements Consumer<Integer>{
    @Override
    public void accept(Integer t){
        System.out.println(t);
    }
}
