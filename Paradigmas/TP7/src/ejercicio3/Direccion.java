package ejercicio3;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Direccion {
    /** Atributos */

    private String calle;
    private int numero;
    private String ciudad;

    /** Getters y Setters*/

    public void setCalle(String pCalle){this.calle=pCalle;}
    public String getCalle(){return this.calle;}
    public  void setNumero(int pNumero){this.numero=pNumero;}
    public int getNumero(){return this.numero;}
    public void setCiudad(String pCiudad){this.ciudad=pCiudad;}
    public String getCiudad(){return  this.ciudad;}
}
