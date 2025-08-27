package Section5;

import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class p6_Hash_table {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();

        table.put(1,"apple");
        table.put(2,"banana");
        table.put(3,"mango");

        System.out.println("value for key 2: "+table.get(2));
        System.out.println("Contains Key 3: "+table.containsKey(3));
        System.out.println("Contains value banana: "+table.containsValue("banana"));

        table.remove(1);

        System.out.println("Size: "+table.size());

        System.out.println("Keys: "+table.keys());
        System.out.println("values: "+table.values());

        table.keySet().stream()
                .forEach(System.out::println);

        table.values().stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        table.entrySet().stream()
                .filter(e->e.getKey()%2==0)
                .forEach(e->System.out.println(e.getKey() + "=>"+e.getValue()));

        List<String> fruits = table.values().stream()
                .collect(Collectors.toList());
        System.out.println(fruits);

        long count = table.values().stream()
                .filter(v->v.startsWith("b"))
                .count();
        System.out.println("value start with B: "+count);
    }
}
