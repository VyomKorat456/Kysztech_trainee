package Section4;


import java.util.Scanner;

public class p4_try_catch {
    static void demo(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        System.out.println("Result = " + (a/b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter the a");
            int a = sc.nextInt();
            System.out.println("enter the b");
            int b = sc.nextInt();
            demo(a,b);

        }
        catch (ArithmeticException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally {
            System.out.println("finally block called");
        }
        System.out.println("program continues after exception handling");
        sc.close();
    }
}
