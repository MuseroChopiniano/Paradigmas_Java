package Ejercicio4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio4Test {

    private Ejercicio4 Ejercicio4;

    @Before
    public void setUp() {
        this.Ejercicio4 = new Ejercicio4();
    }

    @Test
    public void MenorA1() throws Exception {
        Assert.assertTrue(5==Ejercicio4.Resultado(1/2,1/3));
    }

    @Test
    public void MayorA1() throws Exception {
        Assert.assertTrue(4==Ejercicio4.Resultado(1/2,2));
    }
}