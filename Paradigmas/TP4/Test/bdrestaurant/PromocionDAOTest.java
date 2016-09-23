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
    private  PlatoDAO platoDAO;
    private  IngredienteDAO ingredienteDAO;
    private  BebidaDAO bebidaDAO;
    @Before
    public void setUp() throws Exception {
        platoDAO=new PlatoDAO();
        ingredienteDAO=new IngredienteDAO();
        bebidaDAO=new BebidaDAO();
        promocionDAO = new PromocionDAO();
        promocionDAO.Inicializar();
        platoDAO.inicializar();
        ingredienteDAO.inicializar();
        bebidaDAO.inicializar();

        /**Carga de Ingredientes en la BD */
        ingredienteDAO.altaIngrediente("CarneParaMilanesa", "Carne");
        ingredienteDAO.altaIngrediente("PanRallado", "Otros");
        ingredienteDAO.altaIngrediente("Huevo", "Otros");
        ingredienteDAO.altaIngrediente("Lechuga", "Verdura");
        ingredienteDAO.altaIngrediente("Tomate", "Verdura");
        ingredienteDAO.altaIngrediente("Fideos", "Pasta");
        ingredienteDAO.altaIngrediente("Salsa", "Otros");
        ingredienteDAO.altaIngrediente("Cebolla", "Verdura");

/**Creacion de listas de ingredientes para cada plato */
        List<String> ingredientesMilanesa = new ArrayList<String>();
        ingredientesMilanesa.add("CarneParaMilanesa");
        ingredientesMilanesa.add("PanRallado");
        ingredientesMilanesa.add("Huevo");

        List<String> ingredientesEnsalada = new ArrayList<String>();
        ingredientesEnsalada.add("Lechuga");
        ingredientesEnsalada.add("Tomate");
        ingredientesEnsalada.add("Cebolla");

        List<String> ingredientesFideos = new ArrayList<String>();
        ingredientesFideos.add("Fideos");
        ingredientesEnsalada.add("Salsa");
/**Carga de Platos en la BD */
        platoDAO.altaPlato("Milanesa", ingredientesMilanesa, 70);
        platoDAO.altaPlato("EnsaladaMixta", ingredientesEnsalada, 50);
        platoDAO.altaPlato("FideosConSalsa", ingredientesFideos, 70);

        /** Creacion de listas de platos para cada Promocion */
        List<String> listaPlatosMila= new ArrayList<String>();
        listaPlatosMila.add("Milanesa");
        listaPlatosMila.add("EnsaladaMixta");

        List<String> listaPlatosFideos= new ArrayList<String>();
        listaPlatosFideos.add("FideosConSalsa");

/** Carga de Bebidas en la BD*/

        bebidaDAO.altaBebida("CervezaStella", 1000, 80);
        bebidaDAO.altaBebida("CervezaStellaPorron", 350, 40);
        bebidaDAO.altaBebida("CocaCola", 600, 40);
        bebidaDAO.altaBebida("Agua", 500, 30);

/**Carga de Promociones en la BD*/

        promocionDAO.altaPromocion("MilaconEnsalada","Agua",listaPlatosMila,100);
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
        listaPlatos.add("FideosConSalsa");
        promocionDAO.altaPromocion("MilaConFideos","CocaCola",listaPlatos,150);
        Assert.assertTrue(3==promocionDAO.devolverPromociones().size());
        Assert.assertTrue(promocionDAO.devolverPromociones().contains("MilaConFideos"));
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
        listaPlatos.add("FideosConSalsa");
        promocionDAO.modificarPromocion("MilaconEnsalada","MilaconFideos","CocaCola",listaPlatos,153.50);
        Assert.assertTrue(promocionDAO.devolverPromociones().contains("MilaconFideos"));
    }
}