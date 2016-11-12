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
    private String padre="NO FATHER";


    @JsonCreator
    public PersonDTO(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

  /**  public PersonDTO(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("age")int age,@JsonProperty("padre")String pPadre) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.padre=pPadre;
        /**if (hijos.size()!=0){
        for (int i=0;i<hijos.size();i++)
        {
            this.hijos.add(hijos.get(i).getName());
        }

    } */
    private List<String> hijos=new ArrayList<String>();

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getPadre(){return padre;}
    public void setPadre(String pPadre){
        this.padre=pPadre;
    }
    public void agregarHijos(String pHijos){this.hijos.add(pHijos);}
    public List<String> getHijos(){
        return       this.hijos;}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + ", age=" + age + ", padre=" + padre /**+ ", Hijos=" + getHijos() */ + "]";

    }

}
