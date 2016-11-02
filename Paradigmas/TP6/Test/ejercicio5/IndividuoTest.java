package ejercicio5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 27/10/2016.
 */
public class IndividuoTest {
    Individuo individuo;

    @Before
    public void setUp() throws Exception {
        this.individuo = new Individuo();
    }

    @Test
    public void darValorANucleotidos() throws Exception {
        Assert.assertTrue(25000==individuo.genesIguales(individuo).size());
    }
}