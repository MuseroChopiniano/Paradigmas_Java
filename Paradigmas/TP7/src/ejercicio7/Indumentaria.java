package ejercicio7;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class Indumentaria implements ProductoDeVenta {

    /**Atributos*/

    private  String marca;
    private  String talle;
    private double precio;
private  String nombre;
    /**Getters y Setters*/
    public void setNombre(String pNombre){this.nombre=pNombre;}
    public String getNombre(){return this.nombre;}
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
    @Override
    public boolean equals(Object pObj) {
        if (pObj.hashCode() == this.hashCode()) {
            return true;
        } else
        {return false;}
    }
    @Override
    public int hashCode(){
        int result=17;
        result=37*result+this.getNombre().hashCode();
        return result;
    }

    /**Promo Segunda Undidad 70% de descuento*/
    @Override
    public void promoDescuento70SegundaUnidad() {
        setPrecio(getPrecioVenta()*0.30);
    }

}
