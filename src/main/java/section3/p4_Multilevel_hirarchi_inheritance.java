package section3;

class animal{

    void eat(String name){
        System.out.println(name + " can eat");
    }
}

class cat extends animal{
    void miau(){
        System.out.println("cat can miau");
    }
}
class dog extends animal
{
    void bark(){
        System.out.println("dog can bark");
    }
}

class puppy extends dog{
    void weep(){
        System.out.println("puppys weeps");
    }
}
public class p4_Multilevel_hirarchi_inheritance {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.weep();
        p.eat("Dog");
        p.bark();

        cat c = new cat();
        c.miau();
        c.eat("cat");
    }
}
