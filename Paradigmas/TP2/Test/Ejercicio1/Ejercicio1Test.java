package Ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio1Test {
    private Ejercicio1 Ejercicio1;

    @Before
    public void setUp() {
        this.Ejercicio1 = new Ejercicio1();
    }

    @Test
    public void mayores() throws Exception {
        int[] numeros={4,2,5,43,66,3,2,11,54,0};
        int[] maximos={66, 54};
        Assert.assertArrayEquals(maximos , Ejercicio1.Mayores(numeros) );
    }

}