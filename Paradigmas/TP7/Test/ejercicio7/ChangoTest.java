package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 06/11/2016.
 */
public class ChangoTest {
    private Chango chango;
    private Carne carneroja;
    private Lacteos lacteo1;
    private Enlatados enlatado1;
    private Perfume perfume;
    @Before
    public void setUp() throws Exception {
        chango=new Chango();
        carneroja=new Carne(Carne.tipoCarne.roja);
        lacteo1=new Lacteos();
        enlatado1=new Enlatados();
        perfume=new Perfume(500);
                chango.agregarProducto(carneroja);
        chango.agregarProducto(lacteo1);
        chango.agregarProducto(enlatado1);
        chango.agregarProducto(perfume);
    }

    @Test
    public void agregarProducto() throws Exception {
        Indumentaria remera =new Indumentaria("Nike", "Small");
        chango.agregarProducto(remera);
        Assert.assertTrue(5==chango.getProductos().size());
    }

    @Test
    public void getProductos() throws Exception {
        Assert.assertTrue(500==chango.getProductos().get(3).getPrecioVenta());
    }

}