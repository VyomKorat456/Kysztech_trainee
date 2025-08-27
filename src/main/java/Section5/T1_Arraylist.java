package Section5;

import java.util.*;
import java.util.stream.Collectors;

public class T1_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Banana");
        list.add("Apple");
        list.add("Apple");

        System.out.println("list is: "+list);

        Map<String,Long> li = list.stream()
                .collect(Collectors.groupingBy(a-> a,Collectors.counting()));
        System.out.println("counts of a is " + li);

        Map<Integer,String> frequnecymap = new HashMap<>();
        for(String fruits : list){
            frequnecymap.put(Collections.frequency(list,fruits), fruits);
        }
        System.out.println("couts using collection.frequency"+ frequnecymap);
    }
}
