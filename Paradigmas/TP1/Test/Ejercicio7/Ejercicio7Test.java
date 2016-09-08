package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio7Test {
   private Ejercicio7 Ejercicio7;

    @Before
    public void setUp() throws Exception {
this.Ejercicio7 = new Ejercicio7();
    }

    @Test
    public void calculoTiempo() throws Exception {
        Assert.assertTrue(300==Ejercicio7.CalculoTiempo(100, 500));
    }

}