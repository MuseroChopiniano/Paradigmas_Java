package ejercicio7;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class ProductoAlimenticio implements ProductoDeVenta
    {
        private double precio;

        /**Getters y Setters*/
        public void setPrecio(double pPrecio){this.precio=pPrecio;}

        @Override
        public double getPrecioVenta() {
            return precio;
        }
    }
