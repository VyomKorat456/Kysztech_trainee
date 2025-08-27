package Section5;

import java.util.HashMap;

public class p5_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"pineapple");
        map.put(4,"mango");

        System.out.println("Map after put: "+map);

        System.out.println("get(2) "+ map.get(2));

        System.out.println("contains key 3? "+map.containsKey(3));
        System.out.println("contains value banana? "+ map.containsValue("Banana"));

        map.remove(1);
        System.out.println("after removing the element map: "+map);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("Entries: "+map.entrySet());

        System.out.println("Size of map is: "+map.size());
        System.out.println("Is empty? "+map.isEmpty());

        //iterating with streams
        System.out.println("iterating using streams");
        map.entrySet().stream()
                        .forEach(e-> System.out.println(e.getKey() + " => " + e.getValue()));

        System.out.println("filter+iterate");
        map.entrySet().stream()
                        .filter(e->e.getValue().startsWith("B"))
                                .forEach(e-> System.out.println(e.getKey() + " => " + e.getValue()));


        map.clear();
        System.out.println("after clearing map: "+map);
    }
}
