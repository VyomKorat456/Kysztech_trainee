package section3;

interface Animal1{
    void method1();
}
interface Animal2{
    void method2();
}

class animal3 implements Animal1,Animal2{
    public void method1(){
        System.out.println("this is method 1");
    }
    public  void method2(){
        System.out.println("this is method 2");
    }
}
public class p5_multiple {
    public static void main(String[] args) {
        animal3 c = new animal3();
        c.method1();
        c.method2();
    }
}
