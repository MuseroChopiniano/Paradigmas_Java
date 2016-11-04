package ejercicio7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 4/11/2016.
 */
public class JuegoDeLaSillaTest {
    JuegoDeLaSilla juegoDeLaSilla;
    @Before
    public void setUp() throws Exception {
juegoDeLaSilla=new JuegoDeLaSilla();
    }

    @Test
    public void jugar() throws Exception {
juegoDeLaSilla.agregarJugadores(5);
        juegoDeLaSilla.jugar();
    }

}