package ejercicio7;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class Carne extends ProductoAlimenticio
{
    public enum tipoCarne{roja,blanca}
    private tipoCarne tipo;

    public Carne(tipoCarne pTipo){this.tipo=pTipo;}


    @Override
    public double getPrecioVenta() {
            if (this.tipo==tipoCarne.roja)
            {
                return super.getPrecioVenta()*0.90;  /**Si carne es roja se le descuenta un 10%*/
            }
            else {
                return super.getPrecioVenta();
            }
    }

}
