package ejercicio8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio8Test {
    private Ejercicio8 ejercicio8;

    @Before
    public void setUp() throws Exception {
        this.ejercicio8=new Ejercicio8();
    }

    @Test
    public void salir() throws Exception {
        Assert.assertTrue(3==ejercicio8.salir(10,5,2));
    }

}