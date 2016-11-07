package ar.edu.uai.model.person;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "PERSON")
@Access(AccessType.FIELD)
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AGE", nullable = false)
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "PADRE")
    private Person parent;

    @OneToMany
    @JoinColumn(name="PADRE")
    List<Person> hijos = new ArrayList<Person>();

    public Person() {
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public Person(Integer id, String name, Integer age, Person parent) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.parent = parent;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Person getParent() {
        return parent;
    }
    public void setParent(Person parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + ", age=" + age + "]";
    }


    public void setHijos(List<Person> hijos) {
        this.hijos = hijos;
    }

    public void agregarHijos(Person hijo){
        hijos.add(hijo);
    }
}

