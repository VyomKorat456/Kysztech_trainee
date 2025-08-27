package Kysztechque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class f6_startwithN {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("vyom","neha","nidhi","nikhil","harshal","vyom"));
        List<String> l1 = list.stream()
                .filter(e->e.startsWith("n"))
                .collect(Collectors.toList());

        System.out.println(l1);

        List<Long> l5 = Collections.singletonList(list.stream()
                .filter(e -> e.startsWith("n"))
                .count());

        System.out.println(l5);

        List<String> l3 = list.stream()
                .filter(e-> Collections.frequency(list,e)>1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(l3);
    }
}
