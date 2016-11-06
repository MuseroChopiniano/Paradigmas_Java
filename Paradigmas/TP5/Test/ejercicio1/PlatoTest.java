package ejercicio1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GastónAlejandro on 17/10/2016.
 */
public class PlatoTest {
        private  Plato platoConstSinParam;
        private  Plato platoConsConParam;
        private Plato platoCon4Ingredientes;

    @Before
    public void setUp() throws Exception {
        platoConstSinParam =new Plato();
        platoConstSinParam.setNombre("Milanesa con papas fritas");
        platoConstSinParam.setCantidadIngredientes(2);
        platoConsConParam=new Plato("Pollo a la Parrilla",1);
        platoCon4Ingredientes=new Plato("Ensalada de rúcula, tomate y queso",4);
            }

            @Test
            public void TestConstructorSinParam() throws Exception{
                Assert.assertEquals("Milanesa con papas fritas",platoConstSinParam.getNombre());
                Assert.assertEquals(2,platoConstSinParam.getCantidadIngredientes());
            }
            @Test
            public void testConstructorConParam() throws Exception{
                Assert.assertEquals("Pollo a la Parrilla",platoConsConParam.getNombre());
                Assert.assertEquals(1,platoConsConParam.getCantidadIngredientes());
            }
            @Test
              public void getPrecio() throws Exception {
                Assert.assertTrue(6 == platoConstSinParam.getPrecio());
                  Assert.assertTrue(8 == platoCon4Ingredientes.getPrecio());
            }
}