package ejercicio7;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Perfumeria implements ProductoDeVenta{

    private double precio;

    public void setPrecio(double pPrecio){this.precio=pPrecio;}

    public  Perfumeria(double pPrecio){this.precio=pPrecio;}

    @Override
    public double getPrecioVenta() {
        return precio;
    }
}
