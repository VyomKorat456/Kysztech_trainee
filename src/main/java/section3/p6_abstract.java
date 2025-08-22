package section3;

abstract class animals {
    abstract void sounds();

    void eat(){
        System.out.println("animals can eat");
    }
}

class dog1 extends animals{
    void sounds(){
        System.out.println("dogs are barking");
    }
}

class cat1 extends animals{
    void sounds(){
        System.out.println("cat are meauing");
    }
}
public class p6_abstract {
    public static void main(String[] args) {
        animals a1 = new dog1();
        a1.eat();
        a1.sounds();

        animals a2 = new cat1();
        a2.eat();
        a2.sounds();
    }
}
