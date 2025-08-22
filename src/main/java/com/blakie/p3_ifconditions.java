package com.blakie;

import java.util.Scanner;

public class p3_ifconditions {


    public static void main(String[] args){
        int a=10,b=5,age;
        if(a>b)
            System.out.println("a is grater than b");

        if(a>b){
            System.out.println("\na is grater than b");
        }
        else{
            System.out.println("\nb is grater than a");
        }


        System.out.println("This example includes 15 rides");
        System.out.println("Enter the age ");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        if(age<=10){
            System.out.println("you are not allow for 10 rides only allow 5 rides ");
        }
        else if(age>10 && age<=15){
            System.out.println("you are not allow 5 rides");
        }
        else{
            System.out.println("you are allow for all rides");
        }

    }

}
