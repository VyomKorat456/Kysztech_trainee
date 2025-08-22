package section3;


class Animal{
    void eat(){
        System.out.println("eniaml eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public class p3_inheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
