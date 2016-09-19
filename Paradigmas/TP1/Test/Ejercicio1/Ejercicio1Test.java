package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 30/8/2016.
 */
public class Ejercicio1Test {

    private Ejercicio1 Ejercicio1;

    @Before
    public void SetUp() {
        this.Ejercicio1 = new Ejercicio1();
    }

    @Test
    public void pertenece() throws Exception {
        Assert.assertEquals(true, (Ejercicio1.Pertenece(1,10)));
    }

    @Test
    public void nopertenece() throws Exception {
        Assert.assertNotEquals(true, Ejercicio1.Pertenece(3,10));
    }
}