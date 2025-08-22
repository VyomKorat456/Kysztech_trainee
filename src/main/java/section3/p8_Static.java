package section3;

class University{

    static String university_name = "SKPIMCS";

    static{
        System.out.println("Static block executed: University loded");
    }

    int rollno;
    String name;

    University(int r,String n){
        rollno= r;
        name= n;
    }

    static void change_uni_name(String newname){
        university_name = newname;
    }

    void display(){
        System.out.println(rollno + " "+ name+" "+university_name);
    }
    //nested class
    static class department {
        void showDept(){
            System.out.println("welcome to cumputer science department of " + university_name);
        }
    }
}


public class p8_Static {
    public static void main(String[] args) {
        University.change_uni_name("Nirma");

        University s1= new University(1,"Vyom");
        University s2= new University(2,"Priya");

        s1.display();
        s2.display();

        University.department dpt= new University.department();
        dpt.showDept();
    }
}
