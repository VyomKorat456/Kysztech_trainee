package com.blakie;

public class p5_while_do_while {
    public static void main(String[] args)
    {
        int c=5;
        while(c>=0){
            System.out.println("c = " + c);
            c--;
        }

        int d=0;
        do {
            System.out.println("c = " + d);
            d++;
        }while (d<=5);

        String[] fruits = {"banana","mango","pineapple"};
        for (String fruit : fruits ){
            System.out.println(fruit);
        }
    }

}
