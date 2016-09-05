package Ejercicio8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 3/9/2016.
 */
public class Ejercicio8Test {
    private Ejercicio8 Ejercicio8;

    @Before
    public void setUp() throws Exception {
        this.Ejercicio8=new Ejercicio8();
    }

    @Test
    public void salir() throws Exception {
        Assert.assertTrue(3==Ejercicio8.Salir(10,5,2));
    }

}