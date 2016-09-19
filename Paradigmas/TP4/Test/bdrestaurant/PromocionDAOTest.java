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
        List<String> listaPlatos= new ArrayList<String>();
        listaPlatos.add("Milanesa");
        listaPlatos.add("Ensalada Mixta");
        listaPlatos.add("Fideos");
        promocionDAO.altaPromocion("Mila con Ensalada","Agua sin Gas",listaPlatos,100);
            }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void cargaInicial() throws Exception{

    }
    @Test
    public void altaPromocion() throws Exception {

    }

}