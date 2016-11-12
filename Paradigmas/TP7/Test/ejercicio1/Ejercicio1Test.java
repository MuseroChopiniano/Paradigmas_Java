package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class Ejercicio1Test {
    private  Ejercicio1 ejercicio1;
    @Before
    public void setUp() throws Exception {
ejercicio1=new Ejercicio1();
    }

    @Test
    public void intento1() throws Exception {
            ejercicio1.intento1();
        Assert.assertTrue("unElemento"==ejercicio1.arrayListNoTipado.get(0));
        Assert.assertTrue("unElemento"==ejercicio1.arrayListTipado.get(0));
    }

    @Test
    public void intento2() throws Exception {
            ejercicio1.intento1();
            ejercicio1.intento2();
        Assert.assertTrue("unElemento"==ejercicio1.unElemento);
        Assert.assertTrue("unElemento"==ejercicio1.otroElemento);
    }

    @Test
    public void intento3() throws Exception {
        ejercicio1.intento3();
        Assert.assertTrue(3== Integer.parseInt(ejercicio1.arrayListTipado.get(0)));
        Assert.assertTrue(3==(Integer)ejercicio1.arrayListNoTipado.get(0));
    }

}