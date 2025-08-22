package com.blakie;
import java.lang.*;

public class p1_Datatypes {

    //Data types
    byte b = 100;
    short s = 20000;
    int i = 10;
    long l = 1000000000L;

    float f= 10.5F;
    double d = 3.2131321313;

    char c = 'A';
    boolean flag = true;

    String str = "Hello Kysz_tech";
    int[] numbers =  {1,2,3,4,5,6};

    public static void main(String[] args) {
        p1_Datatypes p = new p1_Datatypes();
        System.out.println("b = " + p.b);
        System.out.println("s = " + p.s);
        System.out.println(" i = " + p.i);
        System.out.println(" l = " + p.l);
        System.out.println(" f = " + p.f);
        System.out.println(" d = " + p.d);
        System.out.println(" c = " + p.c);
        System.out.println(" flag = " + p.flag);
        System.out.println(" String = " + p.str);
        System.out.println("number 2 is = " + p.numbers[2]);
    }
}
