package SingleTableInheritanceHibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "people")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype",discriminatorType = DiscriminatorType.STRING, length = 20)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    protected Person (){}

    protected Person(String name){
        this.name = name;
    }
    public Long getId(){return id;}
    public  void setId(Long id){this.id = id;}

    public String getname(){return name;}
    public void setName(String name){this.name=name;}

   @Override
    public String toString(){
        return "Person{id=" + id+",name='"+name+"'}";
    }
}
