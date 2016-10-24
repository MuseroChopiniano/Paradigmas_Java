package ejercicio2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 22/10/2016.
 */
public class PilaDeCaracteresTest {
    PilaDeCaracteres pila;
    PilaDeCaracteres pilaConMax;
    @Before
    public void setUp() throws Exception {
        pila=new PilaDeCaracteres();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pilaConMax = new PilaDeCaracteres(4);
    }

    @Test
    public void length() throws Exception {
        Assert.assertEquals(3,pila.length());
    }

    @Test
    public void push() throws Exception {
        pila.push('a');
        pila.push('j');
        Assert.assertTrue(pila.length()==5);
        pilaConMax.push('a');
        pilaConMax.push('b');
        pilaConMax.push('c');
        pilaConMax.push('d');
        pilaConMax.push('f');
        Assert.assertTrue(pilaConMax.length()==4);
    }

    @Test
    public void pop() throws Exception {
        char caracter =pila.pop();
        Assert.assertEquals('c',caracter);
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(pila.isEmpty(), false);
    }

}