package bdrestaurant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Facu on 19/9/2016.
 */
public class BebidaDAOTest {
    private BebidaDAO bebidaDAO;

    @Before
    public void setUp() throws Exception {
this.bebidaDAO = new BebidaDAO();
        BebidaDAO.altaBebida("CervezaStella", 1000, 80);
        BebidaDAO.altaBebida("CervezaStellaPorron", 350, 40);
        BebidaDAO.altaBebida("CocaCola", 600, 40);
        BebidaDAO.altaBebida("Agua", 500, 30);
    }

    @After
    public void tearDown() throws Exception {
        BaseDatos.BorrarTodo("BEBIDA");
    }

    @Test
    public void testCargaInicial() throws Exception{
        List<String> respuesta=new ArrayList<String>();
        respuesta.add("CervezaStella");
        respuesta.add("CervezaStellaPorron");
        respuesta.add("CocaCola");
        respuesta.add("Agua");
        Assert.assertTrue(respuesta==BebidaDAO.devolverBebidas());
    }

    @Test
    public void testAltaBebida() throws Exception {
        BebidaDAO.altaBebida("Jugo", 150, 15);

        Assert.assertTrue(5==BebidaDAO.contar());
    }

    @Test
    public void testBorrarBebida() throws Exception {
        BebidaDAO.borrarBebida("CervezaStellaPorron");
        Assert.assertTrue(4==BebidaDAO.contar());
    }

    @Test
    public void testModificarBebida() throws Exception {
        BebidaDAO.modificarBebida("CervezaStella", "CervezaQuilmes", 1000, 40);
        List<String> bebidas = BebidaDAO.devolverBebidas();
        Assert.assertTrue("CervezaQuilmes"==bebidas.get(0));
    }
}