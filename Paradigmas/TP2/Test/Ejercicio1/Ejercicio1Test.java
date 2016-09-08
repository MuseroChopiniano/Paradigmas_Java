package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio1Test {
    private Ejercicio1 ejercicio1;

    @Before
    public void setUp() {
        this.ejercicio1 = new Ejercicio1();
    }

    @Test
    public void mayores() throws Exception {
        int[] array={4,2,5,43,66,3,2,11,54,0};
        int[] maximos={66, 54};
        Assert.assertArrayEquals(maximos , ejercicio1.mayores(array) );
    }


}