package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio7Test {
    private Ejercicio7 ejercicio7;

    @Before
    public void setUp() throws Exception {
this.ejercicio7=new Ejercicio7();
    }

    @Test
    public void rectangulos() throws Exception {
        int[] rectangulo1={2,3};
        int[] rectangulo2={4,1};
        Assert.assertTrue("No encajan"==ejercicio7.rectangulos(rectangulo1, rectangulo2));
    }

}