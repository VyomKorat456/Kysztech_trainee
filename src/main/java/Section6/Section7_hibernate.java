package Section6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Section7_hibernate {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Students s1= new Students();

        s1.setId(4);
        s1.setName("priya");
        s1.setCity("Amreli");

        Session session = factory.openSession();
        session.beginTransaction();

        Students s2 = session.get(Students.class,1);
        if(s2!=null){
            s2.setName("Patel Vyom");
            s2.setCity("Rajkot");
        }

        Students s3 = session.get(Students.class,2);
                if(s3!=null){
                    session.delete(s3);
                }
        session.persist(s1);

        session.getTransaction().commit();
        session.close();

        System.out.println("Student saved successfully!");
    }
}
