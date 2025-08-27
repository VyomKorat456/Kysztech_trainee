package Kysztechque;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class f2_unionoftwonum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9));

        Set<Integer> union = new HashSet<>(list);
        union.addAll(list2);

        System.out.println("using hashset "+union);

        List<Integer> l1 = Stream.concat(list.stream(),list2.stream())
                        .distinct()
                                .collect(Collectors.toList());
        System.out.println("Using distinct method "+l1);


    }
}
