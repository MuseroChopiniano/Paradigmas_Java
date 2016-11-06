package ejercicio7;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Lacteos extends ProductoAlimenticio {
    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta()*0.20;
    }
}
