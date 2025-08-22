package com.blakie;

public class p4_loops {
    public static void main(String[] args){
        int row= 5 ;
        //upper
        for(int i=1;i<=row;i++)
        {
            System.out.println();
            for(int j=i;j<row;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
        }
        System.out.println("\n");
        //down
        int down=5;
        for(int c=down;c>=1;c--)
        {
            System.out.println();
            for (int d=c;d<down;d++)
            {
                System.out.print(" ");
            }
            for (int e=1;e<=c;e++)
            {
                System.out.print("* ");
            }

        }



    }
}
