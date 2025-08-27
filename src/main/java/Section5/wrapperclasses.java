package Section5;

import java.util.ArrayList;

public class wrapperclasses {
    public static void main(String[] args) {
        int a = 10;
        char c='X';
        boolean flag = true;

        Integer intobj = Integer.valueOf(a);
        Character chobj = Character.valueOf(c);
        Boolean bool_obj = Boolean.valueOf(flag);

        Double doubleobj = 20.33;

        int unboxInt = intobj;
        char unboxchar = c;

        System.out.println("integer object: "+ intobj);
        System.out.println("character object: "+ c);
        System.out.println("Boolean object: "+ bool_obj);
        System.out.println("Double Object: "+doubleobj);

        System.out.println("unboxed int: "+ unboxInt);
        System.out.println("unboxed char: "+unboxchar);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println("Arraylist with wrapper: "+list);
    }
}
