package SingleTableInheritanceHibernate;

import jakarta.persistence.Entity;

@Entity
public class Student extends Person {
    private String course;

    public Student(){}
    public Student(String name,String course){
        super(name);
        this.course=course;
    }

    public String getCourse(){return course;}
    public void setCourse(String course){this.course= course;}

    @Override
    public String toString(){
        return "Student{id=" + getId() + ", name='" + getname() +"', course='"+course+"'}";
    }
}
