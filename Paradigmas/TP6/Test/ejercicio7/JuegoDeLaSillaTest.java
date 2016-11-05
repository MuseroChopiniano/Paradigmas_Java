package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 4/11/2016.
 */
public class JuegoDeLaSillaTest {
    JuegoDeLaSilla juegoDeLaSilla;
    @Before
    public void setUp() throws Exception {
juegoDeLaSilla=new JuegoDeLaSilla();
    }

    @Test
    public void jugar() throws Exception {
        juegoDeLaSilla.cantDeSillas=4;
        juegoDeLaSilla.getListaJugadores().add("Juan");
        juegoDeLaSilla.getListaJugadores().add("Pepe");
        juegoDeLaSilla.getListaJugadores().add("Lucas");
        juegoDeLaSilla.getListaJugadores().add("Marcos");
        juegoDeLaSilla.getListaJugadores().add("Maria");
        juegoDeLaSilla.jugar();
        Assert.assertTrue(1==juegoDeLaSilla.getListaJugadores().size());
        Assert.assertTrue(0==juegoDeLaSilla.getCantDeSillas());
    }

}