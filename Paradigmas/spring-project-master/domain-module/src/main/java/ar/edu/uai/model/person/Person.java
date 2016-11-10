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
    @JoinColumn(name= "PADRE")
    private Person padre;

    @OneToMany
    @JoinColumn(name="PADRE")
   private List<Person> hijos = new ArrayList<Person>();     /**Lista de Hijos*/

    public Person getPadre() {
        return padre;
    }
    public List<Person> getHijos() {
        return hijos;
    }


    public Person() {
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
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


    public void setPadre(Person pPadre)
    {
        this.padre=pPadre;
    }
    public void agregarHijos(Person pPersona)
    {
        if (pPersona!=null)
        {
            if (hijos.contains(pPersona)==false){
            this.hijos.add(pPersona);
            pPersona.setPadre(this);}
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
