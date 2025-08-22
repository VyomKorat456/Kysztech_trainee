package section3;

//basically constructor have a same name as class name and it not have a return type and
// also we don't have to call a cunstructor whenever class object creates it's call automatically
class cunstructor{
    cunstructor(){
        System.out.println("we are int the cunstructor");
    }
    cunstructor(int age){
        System.out.println("the age of cunstructor is" + age);
    }
    cunstructor(String name,String type){
        System.out.println("cunstructor name is "+name);
        System.out.println("cunsturctor type is "+type);
    }
}

public class p2_cunstructor {
    public static void main(String[] args){
        cunstructor c = new cunstructor();
        cunstructor c1 = new cunstructor(10);
        cunstructor c2 = new cunstructor("second","overloding");
    }
}
