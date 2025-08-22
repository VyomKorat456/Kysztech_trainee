package com.blakie;

public class p2_Operations {
    public static void main(String[] args){
        int a=10,b=5;

        //Arithmetic operator +,-,*,/,%
        System.out.println("Arithmetic operator");
        System.out.println("A+B = " + (a+b));
        System.out.println("A-B = " + (a-b));
        System.out.println("A*B = " + (a*b));
        System.out.println("A/B = " + (a/b));
        System.out.println("A%B = " + (a%b));
        //Relational operator ==,!=,>,<,>=,<=

        System.out.println("Relational operators");
        System.out.println("a==b = " + (a==b));
        System.out.println("a!=b = " + (a!=b));
        System.out.println("a>b = " + (a>b));
        System.out.println("a<b = " + (a<b));
        System.out.println("a>=b = " + (a>=b));
        System.out.println("a<=b = " + (a<=b));

        //Logical operator &&,||,!
        boolean x=true,y=false;
        System.out.println("Logical operator");
        System.out.println(" x&&y = " + (x&&y));
        System.out.println(" x||y = "+ (x||y));
        System.out.println(" !x = " + (!x));

        //Bitwise operator &,|,^,~,<<,>>,>>>
        int p =6,q= 3;
        System.out.println("Bitwise operator");
        System.out.println("p&q = " + (p&q));
        System.out.println("p|q = " + (p|q));
        System.out.println("p^q = " + (p^q));
        System.out.println("~p = " + (~p));
        System.out.println("p<<1 = " + (p<<1));
        System.out.println("p>>1 = " + (p>>1));
        System.out.println("p>>>1" + (p>>>1));

        //assignment operators
        int num = 10;
        System.out.println("Assignment Operators:");
        num += 5;
        System.out.println("num += 5 -> " + num);
        num -= 3;
        System.out.println("num -= 3 -> " + num);
        num *= 2;
        System.out.println("num *= 2 -> " + num);
        num /= 4;
        System.out.println("num /= 4 -> " + num);
        num %= 3;
        System.out.println("num %= 3 -> " + num);

        // Unary Operators
        int z = 5;
        System.out.println("Unary Operators:");
        System.out.println("z = " + z);
        System.out.println("++z = " + (++z));
        System.out.println("z++ = " + (z++));
        System.out.println("z after z++ = " + z);
        System.out.println("--z = " + (--z));
        System.out.println("z-- = " + (z--));
        System.out.println("z after z-- = " + z);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b is " + max);
    }
}
