package SingleTableInheritanceHibernate;

import jakarta.persistence.Entity;

@Entity
public class Teacher extends Person {
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String name,Double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{id=" + getId() +
                "name='" + getname() +
                "salary=" + salary +
                '}';
    }
}
