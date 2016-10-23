package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 22/10/2016.
 */
public class NumeroComplejoTest {
    NumeroComplejo numeroComplejo;
    @Before
    public void setUp() throws Exception {
numeroComplejo= new NumeroComplejo("4 + 3i");
    }

    @Test
    public void suma() throws Exception {
        NumeroComplejo numero = new NumeroComplejo("6 - 4i");
        Assert.assertEquals("10 - 1i",numeroComplejo.suma(numero));
    }

    @Test
    public void resta() throws Exception{
        NumeroComplejo numero = new NumeroComplejo("6 - 4i");
        Assert.assertEquals("-2 + 7i", numeroComplejo.resta(numero));
    }
}