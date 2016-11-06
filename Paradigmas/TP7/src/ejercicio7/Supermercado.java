package ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Supermercado {

    private List<Caja> cajas = new ArrayList<Caja>();

    /**Metodos*/
    public double liquidacionDelDia()
    {
        double facturacion=0;
    for (int i=0;i<cajas.size();i++)
    {
        facturacion+=cajas.get(i).getLiquidacionCaja();
    }
        return facturacion;
    }
}
