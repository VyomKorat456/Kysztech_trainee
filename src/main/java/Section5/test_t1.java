package Section5;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class test_t1 {
    public static void main(String[] args) {
        //input 10,20,5,40,30
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(40);
        list.add(30);


        System.out.println(list);

        List<Integer> l1= list.stream().sorted().toList();
        System.out.println(l1);
        System.out.println(l1.get(l1.size()-2));

    }
}
