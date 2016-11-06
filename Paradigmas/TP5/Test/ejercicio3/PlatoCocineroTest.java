package ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class PlatoCocineroTest {
    private Cocinero cocinero;
    private Plato plato;
    @Before
    public void setUp() throws Exception {
        cocinero=new Cocinero();
        plato=new Plato("Pollo a la parrilla",1);
        cocinero.setDireccionEmail("jorge@yahoo.com");
        plato.setCocinero(cocinero);
        plato.agregarOpinion(5);
        plato.agregarOpinion(7);
    }

    @Test
    public void getMailDelCocinero() throws Exception {
            Assert.assertEquals(cocinero.getDireccionEmail(),plato.getMailDelCocinero());
            plato.imprimite();
    }
    }