package Section5;

import java.util.HashSet;
import java.util.Iterator;

public class p3_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("blakie");
        set.add("nikhil");
        set.add("harshal");
        set.add("blakie");
        System.out.println("set elemts are: "+set);

        System.out.println("Contains nikhil : "+set.contains("nikhil"));
        System.out.println("contains vyom :" + set.contains("Vyom"));

        set.remove("nikhil");
        System.out.println("removed element after set: "+set);

        System.out.println("the size of set is: "+set.size());
        System.out.println("is set is empty: "+set.isEmpty());

        System.out.println("iterating: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");

        }
        System.out.println();

        set.clear();
        System.out.println("All clear in set:"+set);

    }
}
