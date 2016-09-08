package ejercicio5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio5Test {
    private Ejercicio5 Ejercicio5;

    @Before
    public void setUp() {
        this.Ejercicio5 = new Ejercicio5();
    }

    @Test
    public void funcion() throws Exception {
        Assert.assertTrue(999==Ejercicio5.Funcion(3,9));
    }

}