package ejercicio4;

import ejercicio3.Plato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class CartaTest {
    private Carta carta;
    private Plato plato1;
    private Plato plato2;

    @Before
    public void setUp() throws Exception {
        carta=new Carta();
        plato1=new Plato("Milanesas con papas fritas",4);
        plato2=new Plato("Pollo a la parrilla",2);
        plato1.agregarOpinion(5);
        plato1.agregarOpinion(10);
        plato2.agregarOpinion(8);
        plato2.agregarOpinion(9);
        carta.agregarPlato(plato1);
        carta.agregarPlato(plato2);
    }

    @Test
    public void agregarPlato() throws Exception {
        Plato plato3=new Plato("Ensalada de rúcula, tomate y queso",10);
        plato3.agregarOpinion(10);
        plato3.agregarOpinion(10);
        carta.agregarPlato(plato3);
        Assert.assertEquals(plato3.getNombre(),carta.platoConMejorOpinion().getNombre());

    }

    @Test
    public void removerPlato() throws Exception {
        carta.removerPlato(plato2);
        Assert.assertEquals(plato1.getNombre(),carta.platoConMejorOpinion().getNombre());
    }

    @Test
    public void precioPromedio() throws Exception {
        Assert.assertTrue(7==carta.precioPromedio());
    }

    @Test
    public void platoConMejorOpinion() throws Exception {
        Assert.assertEquals(plato2,carta.platoConMejorOpinion());
    }

}