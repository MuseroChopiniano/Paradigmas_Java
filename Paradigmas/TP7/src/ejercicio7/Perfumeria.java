package ejercicio7;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class Perfumeria implements ProductoDeVenta{

    private double precio;
    private String nombre;
    public void setPrecio(double pPrecio){this.precio=pPrecio;}

    public  Perfumeria(double pPrecio){this.precio=pPrecio;}

    public void setNombre(String pNombre){this.nombre=pNombre;}
    public String getNombre(){return this.nombre;}

    @Override
    public double getPrecioVenta() {
        return precio;
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
