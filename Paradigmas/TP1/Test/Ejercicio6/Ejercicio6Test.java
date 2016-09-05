package Ejercicio6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio6Test {
    private Ejercicio6 Ejercicio6;

    @Before
    public void setUp() {
        this.Ejercicio6 = new Ejercicio6();
    }
    @Test
    public void orden() throws Exception {
       Assert.assertEquals(3 & 5 & 10, Ejercicio6.ordenar(5,3,10));
    }

}