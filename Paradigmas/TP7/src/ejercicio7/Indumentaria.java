package ejercicio7;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Indumentaria implements ProductoDeVenta {

    /**Atributos*/

    private  String marca;
    private  String talle;
    private double precio;

    /**Getters y Setters*/
    public void setMarca(String pMarca){this.marca=pMarca;}
    public String getMarca(){return this.marca;}
    public void setTalle(String pTalle){this.talle=pTalle;}
    public String getTalle(){return this.talle;}
    public void setPrecio(double pPrecio){this.precio=pPrecio;}

    @Override
    public double getPrecioVenta() {
        return this.precio;
    }

    /**Constructor*/
    public Indumentaria(String pMarca,String pTalle)
    {
        this.talle=pTalle;
        this.marca=pMarca;
    }


}
