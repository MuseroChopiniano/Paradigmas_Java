package ejercicio4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio4Test {

    private Ejercicio4 ejercicio4;
    @Before
    public void setUp() throws Exception {
this.ejercicio4 = new Ejercicio4();
    }

    @Test
    public void balanceo() throws Exception {
        boolean resultado=false;
        Assert.assertSame(resultado, ejercicio4.balanceo("{123+2+[x+3[y*32](z+x)]}"));
    }

}