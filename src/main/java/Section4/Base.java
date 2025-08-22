package Section4;

public class Base {
    public String publicVar = "public Variable";
    private  String priavatevar = "priavte variable";
    protected  String protectedvar = "protected var";
    String defaultvar = "default var";

    public void showAccess(){
        System.out.println("Inside base class:");
        System.out.println(publicVar);
        System.out.println(priavatevar);
        System.out.println(protectedvar);
        System.out.println(defaultvar);
    }
}