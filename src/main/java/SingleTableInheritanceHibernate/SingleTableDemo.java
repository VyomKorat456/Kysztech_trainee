package SingleTableInheritanceHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SingleTableDemo {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();

        try(SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession()){

            session.beginTransaction();

            Student s1 = new Student("Krishna","JAVA");
            Student s2 = new Student("Radha","Spring");
            Teacher t1 = new Teacher("Navin",100000.00);
            Teacher t2 = new Teacher("John",68000.00);

            session.persist(s1);
            session.persist(s2);
            session.persist(t1);
            session.persist(t2);
            session.getTransaction().commit();
            System.out.println("Inserted 4 rows into people");

            session.beginTransaction();

            List<Person> everyone = session.createQuery("from Person", Person.class).list();
            System.out.println("\nAll People");
            everyone.forEach(System.out::println);

            List<Student> students = session.createQuery("from Student",Student.class).list();
            System.out.println("\nOnly Students");
            students.forEach(System.out::println);

            List<Teacher> teacher = session.createQuery("from Teacher",Teacher.class).list();
            System.out.println("\nonly teacher");
            teacher.forEach(System.out::println);

            session.getTransaction().commit();
        }

    }
}
