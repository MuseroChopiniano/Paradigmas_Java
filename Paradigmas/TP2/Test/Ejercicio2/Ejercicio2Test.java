package ejercicio2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio2Test {
    private Ejercicio2 ejercicio2;

    @Before
    public void setUp() {
        this.ejercicio2 = new Ejercicio2();
    }

    @Test
    public void maxPares() throws Exception {
        int[] numeros={42179, 8456, 123, 487};
        Assert.assertEquals(8456, ejercicio2.maxPares(numeros));
    }


}