package section2;

public class p1_function {
    void car()
    {
        System.out.println("inside the car");
    }
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        p1_function c = new p1_function();
        c.car();
        System.out.println(c.add(100,55));
        System.out.println(c.add(500,600,100));
    }
}
