package ejercicio2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 30/8/2016.
 */
public class Ejercicio2Test {
    private Ejercicio2 Ejercicio2;

    @Before
    public void setUp() {
        this.Ejercicio2 = new Ejercicio2();
    }

    @Test
    public void Mayor() throws Exception {
        Assert.assertTrue(8== Ejercicio2.Mayor(245831));
    }

    @Test
    public void NoMayor() throws Exception {
        Assert.assertFalse(4== Ejercicio2.Mayor(245831));
    }
}