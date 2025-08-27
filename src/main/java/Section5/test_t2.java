package Section5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test_t2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(4);

       List<Integer> l1 = list.stream()
                .filter(e->e.equals(0))
                .collect(Collectors.toList());

       List<Integer> l2 = list.stream()
                       .filter((e->e!=0))
                       .collect(Collectors.toList());

        System.out.println(l2);
        l2.addAll(l1);
        System.out.println(l1);
        System.out.println(l2);
    }
}
