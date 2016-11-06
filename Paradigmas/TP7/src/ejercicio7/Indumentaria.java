package ejercicio7;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Indumentaria {

    /**Atributos*/

    private  String marca;
    private  String talle;

    /**Getters y Setters*/
    public void setMarca(String pMarca){this.marca=pMarca;}
    public String getMarca(){return this.marca;}
    public void setTalle(String pTalle){this.talle=pTalle;}
    public String getTalle(){return this.talle;}

    /**Constructor*/
    public Indumentaria(String pMarca,String pTalle)
    {
        this.talle=pTalle;
        this.marca=pMarca;
    }


}
