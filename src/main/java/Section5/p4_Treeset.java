package Section5;

import java.util.TreeSet;

public class p4_Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(60);
        ts.add(30);
        ts.add(40);
        ts.add(15);
        ts.add(10);
        System.out.println("treeset sorted automatically: "+ts);

        System.out.println("First element: "+ts.first());
        System.out.println("last element:"+ts.last());

        System.out.println("set higher than 30 "+ts.higher(30));
        System.out.println("set lower than 40 "+ts.lower(30));

        System.out.println("headset(30) "+ts.headSet(30));
        System.out.println("tailset(30) "+ts.tailSet(30));
        System.out.println("subset(20,50) "+ ts.subSet(20,50));

        ts.remove(30);
        System.out.println("after remve 30: "+ts);

        System.out.println("Desending order");
        for (Integer val : ts.descendingSet()){
            System.out.println(val + " ");
        }

        System.out.println("using strems");
        ts.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

    }
}
