package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 17/10/2016.
 */
public class PlatoTest {
        private  Plato plato;
    @Before
    public void setUp() throws Exception {
        plato=new Plato();
        plato.setNombre("Milanesa con papa fritas");
        plato.setCantidadIngredientes(2);
            }

    @Test
    public void getPrecio() throws Exception {
      Assert.assertTrue(6==plato.getPrecio());
    }

}