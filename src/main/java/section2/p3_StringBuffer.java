package section2;

public class p3_StringBuffer {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println("length "+sb.length());
        System.out.println("capacity "+sb.capacity());

        sb.append("Spring");
        System.out.println("length "+sb.length());
        System.out.println("capacity "+sb.capacity());

        System.out.println(sb);

        sb.insert(6," language");
        System.out.println(sb);

        sb.replace(0,6,"Spring Boot");
        System.out.println(sb);

        sb.delete(12,20);
        System.out.println(sb);
        System.out.println("capacity "+sb.capacity());
        System.out.println("length "+sb.length());

    }
}
