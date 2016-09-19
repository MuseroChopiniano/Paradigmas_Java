package ejercicio8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GastónAlejandro on 18/09/2016.
 */
public class Ejercicio8Test {
    private  Ejercicio8 Ejercicio8;

    @Before
    public void setUp() throws Exception {
        Ejercicio8=new Ejercicio8();
    }
    @Test
    public void combinaciones() throws Exception {
             String[] resultado={"AAA","AAN","ANA","ANN","NAA","NAN","NNA","NNN"};
              Assert.assertArrayEquals(resultado,Ejercicio8.Combinaciones(3));
    }

}