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
        listaPlatosMila.add("Ensalada Mixta");
        promocionDAO.altaPromocion("Mila con Ensalada","Agua sin Gas",listaPlatosMila,100);
        List<String> listaPlatosFideos= new ArrayList<String>();
        listaPlatosFideos.add("Fideos");
        promocionDAO.altaPromocion("Fideos con bebida","CervezaStellaPorron",listaPlatosFideos,100);

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

    }

}