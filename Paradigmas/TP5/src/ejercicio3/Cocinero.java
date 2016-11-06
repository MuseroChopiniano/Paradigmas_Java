package ejercicio3;

import ejercicio1.Plato;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Cocinero {

    /**Atributos**/

    private String nombre;
    private String apellido;
    private String direccionEmail;
    private List<ejercicio3.Plato> listaPlatos=new ArrayList<ejercicio3.Plato>();


    /**Getters y Setters*/

    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String pNombre)
    {
        this.nombre=pNombre;
    }

    public String getApellido(){return this.apellido;}
    public void setApellido(String pApellido){this.apellido=pApellido;}

    public String getDireccionEmail(){return this.direccionEmail;}
    public void setDireccionEmail(String pDireccion){this.direccionEmail=pDireccion;}

    public void agregarPlato(ejercicio3.Plato unPlato) {
        listaPlatos.add(unPlato);
    }

    /** Métodos*/

    public int cantidadPlatos()
    {
        return listaPlatos.size();
    }



}
