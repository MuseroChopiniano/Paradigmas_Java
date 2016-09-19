package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio7FibonacciTest {

    private Ejercicio7Fibonacci fibonacci;
    @Before
    public void setUp() throws Exception {
        this.fibonacci = new Ejercicio7Fibonacci();
    }

    @Test
    public void fibonacci() throws Exception {
        Assert.assertTrue(13== fibonacci.Fibonacci(6));
    }

}