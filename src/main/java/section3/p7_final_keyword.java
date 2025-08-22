package section3;

// can not be inherited
final class Bank{

    //constant variable
    final String bank_name="Bank Of India";
    final double Interest_rate;
    Bank(double rate){
        Interest_rate=rate;
    }
    //cannot be override
    final void display(){
        System.out.println("Bank: "+bank_name);
        System.out.println("Interest rate: "+Interest_rate);
    }
}
public class p7_final_keyword {
    public static void main(String[] args) {
        Bank b = new Bank(10);
        b.display();
    }
}
