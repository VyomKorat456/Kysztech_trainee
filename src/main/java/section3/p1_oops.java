package section3;


// Main 4 pillers
//Encapsulation
//polymorphism
//abstraction
//inheritance

//Class
class Students {
    //Attributes
    private String name;

    //Methods
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class p1_oops{
    public static void main(String[] args){
        //S is objects
        Students s = new Students();
        s.setName("Vyom");
        System.out.println(s.getName());
    }
}
