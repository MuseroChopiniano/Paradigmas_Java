package ejercicio5;

import ejercicio3.Plato;
import ejercicio3.Cocinero;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class CocineroTest {
    private  Cocinero cocinero1;
    private  Cocinero cocinero2;
    private  Plato plato1;
    private  Plato plato2;
    private  Plato plato3;

    @Before
    public void SetUp() throws  Exception{
        cocinero1=new Cocinero();
        cocinero1.setNombre("Facundo");
        plato1=new Plato();
        plato2=new Plato();
        plato1.setCocinero(cocinero1);
        plato2.setCocinero(cocinero1);
        cocinero2=new Cocinero();
        cocinero2.setNombre("Gastón");
        plato3=new Plato();
        plato3.setCocinero(cocinero2);
    }
    @Test
    public void cocineroMasPlatos() throws  Exception{
        Assert.assertTrue(cocinero1.cantidadPlatos()>cocinero2.cantidadPlatos());
    }
}
