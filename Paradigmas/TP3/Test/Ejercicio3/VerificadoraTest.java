package ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GastónAlejandro on 18/09/2016.
 */
public class VerificadoraTest {
    private Verificadora Verificadora;
    @Before
    public void setUp() throws Exception {
 Verificadora = new Verificadora();
    }

    @Test
    public void telNum() throws Exception {
        Assert.assertTrue(Verificadora.telNum("+541143282601"));
    }
    @Test
    public void telNumFalse() throws Exception{
        Assert.assertFalse(Verificadora.telNum("+542as22232551"));
    }
    @Test
    public void Mail() throws  Exception{
        Assert.assertTrue(Verificadora.mail("tonchis007@hotmail.com"));
            }
            @Test
    public void mailFlase() throws Exception{
        Assert.assertFalse(Verificadora.mail("tonchis.com"));
            }
    @Test
    public void FechaTrue() throws  Exception{
        Assert.assertTrue(Verificadora.fecha("15/10/1995"));
    }
    @Test
    public void FechaFalse() throws Exception{
        Assert.assertFalse(Verificadora.fecha("10/23/1999"));
    }
}