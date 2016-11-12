package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 06/11/2016.
 */
public class CajaTest {
    private Caja caja;
    private Chango chango;
    private Carne carneroja;
    private Lacteos lacteo1;
    private Enlatados enlatado1;
    @Before
    public void setUp() throws Exception {
        chango=new Chango();
        carneroja=new Carne(Carne.tipoCarne.roja);
        carneroja.setNombre("Carre de Cerdo");
        carneroja.setPrecio(80);
        lacteo1=new Lacteos();
        lacteo1.setNombre("Leche Chelita");
        lacteo1.setPrecio(20);
        enlatado1=new Enlatados();
        enlatado1.setNombre("Choclo");
        enlatado1.setPrecio(15);
        caja=new Caja();
        chango.agregarProducto(carneroja);
        chango.agregarProducto(lacteo1);
        chango.agregarProducto(enlatado1);
    }

    @Test
    public void getLiquidacionCaja() throws Exception {
        Chango chango2=new Chango();
       Carne carneroja2=new Carne(Carne.tipoCarne.roja);
        carneroja2.setNombre("Bondiola");
        carneroja2.setPrecio(180);
       Lacteos lacteo2=new Lacteos();
        lacteo2.setPrecio(25);
        lacteo2.setNombre("Queso Rallado");
        chango2.agregarProducto(carneroja2);
        chango2.agregarProducto(lacteo2);
        caja.facturar(chango);
        caja.facturar(chango2);
        Assert.assertTrue(285==caja.getLiquidacionCaja());
    }

    @Test
    public void facturar() throws Exception {
        caja.facturar(chango);
        Assert.assertTrue(103==caja.getLiquidacionCaja());
    }

}