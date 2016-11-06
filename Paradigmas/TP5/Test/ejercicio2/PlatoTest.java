package ejercicio2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class PlatoTest {
    private Plato plato;
    @Before
    public void setUp() throws Exception {
    plato=new Plato();
        plato.agregarOpinion(5);
        plato.agregarOpinion(5);
    }

    @Test
    public void getOpinionPromedio() throws Exception {
            Assert.assertTrue(5==plato.getOpinionPromedio());
    }

    @Test
    public void agregarOpinion() throws Exception {
            plato.agregarOpinion(2);
            Assert.assertTrue(4==plato.getOpinionPromedio());
    }

}