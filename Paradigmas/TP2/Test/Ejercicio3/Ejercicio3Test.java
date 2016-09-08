package ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio3Test {
    private Ejercicio3 ejercicio3;

    @Before
    public void setUp() throws Exception {
        this.ejercicio3 = new Ejercicio3();
    }

    @Test
    public void juego() throws Exception {
        Assert.assertTrue("Ganó el usuario con Papel"==ejercicio3.Juego(1,0));
    }
}