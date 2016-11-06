package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.font.CreatedFontTracker;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 06/11/2016.
 */
public class SupermercadoTest {
    private Supermercado supermercado;
    private Caja caja1;
    private Chango chango1;
    private Chango chango2;
    private Caja caja2;
    private Chango chango3;
    @Before
    public void setUp() throws Exception {
    supermercado=new Supermercado();
        caja1=new Caja();
        chango1=new Chango();
        Carne carne1=new Carne(Carne.tipoCarne.roja);
        carne1.setPrecio(180);
        Lacteos lacteo1=new Lacteos();
        lacteo1.setPrecio(25);
        chango1.agregarProducto(carne1);
        chango1.agregarProducto(lacteo1);
        caja1.facturar(chango1);
        chango2= new Chango();
        Perfume perfume1= new Perfume(500);
        Crema crema1=new Crema(200);
        chango2.agregarProducto(perfume1);
        chango2.agregarProducto(crema1);
        caja1.facturar(chango2);
        caja2=new Caja();
        chango3=new Chango();
        Enlatados enlatados=new Enlatados();
        enlatados.setPrecio(24);
        Indumentaria remera=new Indumentaria("Nike","Small");
        remera.setPrecio(250);
        chango3.agregarProducto(enlatados);
        chango3.agregarProducto(remera);
        caja2.facturar(chango3);
supermercado.agregarCaja(caja1);
        supermercado.agregarCaja(caja2);
    }

    @Test
    public void agregarCaja() throws Exception {
        supermercado.agregarCaja(new Caja());
        Assert.assertTrue(3==supermercado.cantCajas());
    }

    @Test
    public void liquidacionDelDia() throws Exception {
        Assert.assertTrue(882+274==supermercado.liquidacionDelDia());
    }

}