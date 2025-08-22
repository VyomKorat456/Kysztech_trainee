package section2;

public class p2_StringHandling {
    public static void main(String[] args){
        String string = "Java Programing";

        System.out.println(string.length());

        System.out.println(string.charAt(2));

        System.out.println(string.substring(5));
        System.out.println(string.substring(0,4));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        System.out.println(string.equals("Java"));
        System.out.println(string.equalsIgnoreCase("Java Programing"));

        System.out.println(string.contains("Prog"));
        System.out.println(string.indexOf("a"));
        System.out.println(string.lastIndexOf("a"));

        System.out.println(string.replace("Java","Spring"));

        String s2 = "              Hello         ";
        System.out.println(s2.trim());

    }
}
