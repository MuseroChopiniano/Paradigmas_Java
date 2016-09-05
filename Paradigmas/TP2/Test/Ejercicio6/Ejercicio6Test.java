package Ejercicio6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 3/9/2016.
 */
public class Ejercicio6Test {
    private Ejercicio6 Ejercicio6;

    @Before
    public void setUp() throws Exception {
        this.Ejercicio6 = new Ejercicio6();
    }

    @Test
    public void gemelos() throws Exception {
        int[] resultado={11,13};
        Assert.assertArrayEquals(resultado, Ejercicio6.Gemelos(10) );
    }

}