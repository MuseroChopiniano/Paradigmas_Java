package ar.edu.uai.paradigms.dto.person;

import ar.edu.uai.model.person.Person;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Federico Donnarumma on 10/15/14.
 */
public class PersonDTO {

    private Integer id;

    private String name;
    private int age;

    @JsonCreator
    public PersonDTO(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

   /** @JsonCreator
    public PersonDTO(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("age") int age, @JsonProperty("padre") Person padre, @JsonProperty("hijos")List<Person> hijos) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.padre=padre.getName();
        if (hijos.size()!=0){
        for (int i=0;i<hijos.size();i++)
        {
            this.hijos.add(hijos.get(i).getName());
        }
        }
    }

*/
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
  /**  public String getPadre(){return padre;}

    public List<String> getHijos(){return this.hijos;}
*/
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + ", age=" + age + "]";

    }

}
