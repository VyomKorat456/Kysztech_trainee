package Section5;

import java.util.ArrayList;

public class p1_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("This list is: " + list);

        list.add(1,15);
        System.out.println("after adding element: " + list);

        int getell = list.get(1);
        System.out.println("element no 1 is :"+getell);

        list.set(1,25);
        System.out.println(list);

        int removedell = list.remove(1);
        System.out.println("removed element is : " + removedell);

        boolean removedval = list.remove(Integer.valueOf(30));
        System.out.println("remove(Integer.valueOf(30)) ->"+removedval);

        System.out.println("size of list is"+list.size());

        System.out.println("there was an element 10:t?f"+list.contains(10));
        System.out.println("there was an element 99:t?f"+list.contains(99));

    }
}
