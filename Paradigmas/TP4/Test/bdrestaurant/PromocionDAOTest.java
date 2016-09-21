package bdrestaurant;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class PromocionDAOTest {
    private PromocionDAO promocionDAO;
    @Before
    public void setUp() throws Exception {
    promocionDAO = new PromocionDAO();
        promocionDAO.Inicializar();
        List<String> listaPlatosMila= new ArrayList<String>();
        listaPlatosMila.add("Milanesa");
        listaPlatosMila.add("EnsaladaMixta");
        promocionDAO.altaPromocion("MilaconEnsalada","AguasinGas",listaPlatosMila,100);
        List<String> listaPlatosFideos= new ArrayList<String>();
        listaPlatosFideos.add("Fideos");
        promocionDAO.altaPromocion("FideosconBebida","CervezaStellaPorron",listaPlatosFideos,100);
            }

    @After
    public void tearDown() throws Exception {
        promocionDAO.BorrarTodo();
    }

    @Test
    public void cargaInicial() throws Exception{
        Assert.assertTrue(2==promocionDAO.devolverPromociones().size());
    }
    @Test
    public void altaPromocion() throws Exception {
        List<String> listaPlatos = new ArrayList<String>();
        listaPlatos.add("Milanesa");
        listaPlatos.add("PapasFritas");
        promocionDAO.altaPromocion("MilaConFritas","CocaCola",listaPlatos,150);
        Assert.assertTrue(3==promocionDAO.devolverPromociones().size());
        Assert.assertTrue(promocionDAO.devolverPromociones().contains("MilaConFritas"));
    }
    @Test
    public void borrarPromocion() throws  Exception {
        promocionDAO.BorrarPromocion("MilaconEnsalada");
        Assert.assertTrue(1==promocionDAO.devolverPromociones().size());
        Assert.assertFalse(promocionDAO.devolverPromociones().contains("MilaconEnsalada"));
    }
    @Test
    public void modificarPromocion() throws Exception{
        List<String> listaPlatos = new ArrayList<String>();
        listaPlatos.add("Milanesa");
        listaPlatos.add("PapasFritas");
        promocionDAO.modificarPromocion("MilaconEnsalada","MilaconFritas","CocaCola",listaPlatos,153.50);
        Assert.assertTrue(promocionDAO.devolverPromociones().contains("MilaconFritas"));
    }
}