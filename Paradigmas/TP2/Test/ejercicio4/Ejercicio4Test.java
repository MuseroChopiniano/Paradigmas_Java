package ejercicio4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio4Test {
    private Ejercicio4 ejercicio4;

    @Before
    public void setUp() throws Exception {
this.ejercicio4=new Ejercicio4();
    }

    @Test
    public void errorDesapercibido() throws Exception {
        Assert.assertTrue(2592==ejercicio4.errorDesapercibido());
    }
}