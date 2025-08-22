package section4_import;
import Section4.Base;

public class Test {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.showAccess();

        System.out.println("\n Inside test class");
        System.out.println(obj.publicVar);
//        System.out.println(obj.privatevar); not accessible
//        System.out.println(obj.protectedvar); // without same package not accisable
//        System.out.println(obj.defaultvar); //without same package not accisable
    }
}
