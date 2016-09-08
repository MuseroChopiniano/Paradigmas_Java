package ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 30/8/2016.
 */
public class Ejercicio3Test {

    private Ejercicio3 Ejercicio3;

    @Before
    public void setUp() {
        this.Ejercicio3 = new Ejercicio3();
    }

    @Test
    public void factorial() throws Exception {
        Assert.assertTrue(24==Ejercicio3.Factorial(4));
    }

}