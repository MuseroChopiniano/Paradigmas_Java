package ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Chango {

    private List<ProductoDeVenta> productos =new ArrayList<ProductoDeVenta>();

    public void agregarProducto(ProductoDeVenta pProducto){this.productos.add(pProducto);}
    public List<ProductoDeVenta> getProductos(){return this.productos;}

}
