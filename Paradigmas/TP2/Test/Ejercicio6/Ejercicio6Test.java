package ejercicio6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio6Test {
    private Ejercicio6 ejercicio6;

    @Before
    public void setUp() throws Exception {
        this.ejercicio6 = new Ejercicio6();
    }

    @Test
    public void gemelos() throws Exception {
        int[] resultado={17,19};
        Assert.assertArrayEquals(resultado, ejercicio6.gemelos(12));
    }
}