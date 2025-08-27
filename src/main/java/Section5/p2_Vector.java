package Section5;

import java.util.Vector;

public class p2_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("blakie");
        vector.add("nikhil");
        vector.add("harshal");
        System.out.println("After add: "+vector);

        vector.addElement("Vyom");
        System.out.println("after addingelemt: "+vector);

        System.out.println("first element: "+vector.firstElement());

        System.out.println("last element: "+vector.lastElement());

        System.out.println("elemet at 1:"+vector.elementAt(1));

        boolean removedelement = vector.removeElement("nikhil");
        System.out.println("removed element nikhil :"+removedelement);

        System.out.println("the capacity of vector is:"+vector.capacity());

        System.out.println("the size of vector is:" + vector.size());
    }
}
