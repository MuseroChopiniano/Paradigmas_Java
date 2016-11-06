package ejercicio3;

import com.sun.org.glassfish.gmbal.ManagedObject;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Persona {
    /** Atributos */

    private String DNI;
    private String nombre;
    private String apellido;
    private Direccion direccion;

    /**Getters y Setters*/
    public void setDNI(String pDNI){this.DNI=pDNI;}
    public String getDNI(){return this.DNI;}
    public void setNombre(String pNombre){this.nombre=pNombre;}
    public String getNombre(){return this.nombre;}
    public void setApellido(String pApellido){this.apellido=pApellido;}
    public String getApellido(){return this.apellido;}
    public void setDireccion(Direccion pDireccion){this.direccion=pDireccion;}
    public Direccion getDireccion(){return this.direccion;}


    /**Constructor*/
    public Persona(String pDNI)
    {
 setDNI(pDNI);
    }
    @Override
    public String toString(){
        String respuesta;
        respuesta=this.DNI + " " + this.nombre + " " + this.apellido;
        return respuesta;
    }
    @Override
    public int hashCode(){
        int result=17;
        result=37*result+this.getDNI().hashCode();
        return result;
    }
    @Override
    public boolean equals(Object pObj)
    {
        if (pObj.hashCode()==this.hashCode())
        {
            return true;
        }
        else {return false;}
    }
    }
