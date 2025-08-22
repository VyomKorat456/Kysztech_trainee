package section4_import;

import Section4_package.p1_package;

class test implements p1_package{

    @Override
    public void greet() {
        System.out.println("this the main class for test");
    }
}

public class myclass{
    public static void main(String[] args){
        p1_package obj = new test();
        obj.greet();
    }
}


