package com.blakie;

public class p6_single_dimensional_double_dimensional_array {

    public static void main(String[] args){
        int[] marks = {100,99,98,100};
        for (int mark : marks){
            System.out.print(mark +" ");
        }
        int[][] submarks = {{100,100,100},{98,90,85}};
        System.out.println("\n"+submarks[0][1]);
        System.out.println(submarks[1][1]);
        for (int[] submark : submarks) {
            for (int i : submark) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
