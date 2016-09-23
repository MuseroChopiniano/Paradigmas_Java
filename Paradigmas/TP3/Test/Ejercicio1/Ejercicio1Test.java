package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GastónAlejandro on 06/09/2016.
 */
public class Ejercicio1Test {
    private Ejercicio1 ejercicio1;

    @Before

    public void setUp() throws Exception {
        ejercicio1 = new Ejercicio1();
    }

    @Test
    public void retornaResultado() throws Exception {
        Assert.assertTrue(180 == ejercicio1.retornaResultado("15 * 12"));
    }
    @Test
    public void retornaSuma() throws Exception {
        Assert.assertTrue(27 == ejercicio1.retornaResultado("15 + 12"));
    }
    @Test
    public void retornaResta() throws Exception {
        Assert.assertTrue(3 == ejercicio1.retornaResultado("15 - 12"));
    }
    @Test
    public void retornaDiv() throws Exception {
        Assert.assertTrue(1 == ejercicio1.retornaResultado("15 / 12"));
    }
}
