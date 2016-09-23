package ejercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio7FactorialTest {
    private Ejercicio7Factorial factorial;

    @Before
    public void setUp() throws Exception {
this.factorial = new Ejercicio7Factorial();
    }

    @Test
    public void factorial() throws Exception {
        Assert.assertTrue(24==factorial.factorial(4));
    }

}