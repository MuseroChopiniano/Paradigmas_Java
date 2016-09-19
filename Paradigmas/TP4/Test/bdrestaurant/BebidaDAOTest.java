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
        BebidaDAO.Inicializar();
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
        Assert.assertTrue(BebidaDAO.devolverBebidas().contains("CervezaStella"));
        Assert.assertTrue(BebidaDAO.devolverBebidas().contains("CervezaStellaPorron"));
        Assert.assertTrue(BebidaDAO.devolverBebidas().contains("CocaCola"));
        Assert.assertTrue(BebidaDAO.devolverBebidas().contains("Agua"));
    }

    @Test
    public void testAltaBebida() throws Exception {
        BebidaDAO.altaBebida("Jugo", 150, 15);
        Assert.assertTrue(5==BebidaDAO.contar());
    }

    @Test
    public void testBorrarBebida() throws Exception {
        BebidaDAO.borrarBebida("CervezaStellaPorron");
        Assert.assertTrue(3==BebidaDAO.contar());
    }

    @Test
    public void testModificarBebida() throws Exception {
        BebidaDAO.modificarBebida("CervezaStella", "CervezaQuilmes", 1000, 40);
      Assert.assertTrue(BebidaDAO.devolverBebidas().contains("CervezaQuilmes"));
    }
}