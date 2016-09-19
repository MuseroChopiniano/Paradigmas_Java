package bdrestaurant;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class IngredienteDAOTest {
    private IngredienteDAO ingredienteDAO;

    @org.junit.Before
    public void setUp() throws Exception {
        ingredienteDAO=new IngredienteDAO();
        ingredienteDAO.Inicializar();
        ingredienteDAO.altaIngrediente("Papa","Verdura");
        ingredienteDAO.altaIngrediente("CarneParaMilanesa","Carne");
        ingredienteDAO.altaIngrediente("PanRallado","Otros");
        ingredienteDAO.altaIngrediente("Huevo","Otros");
        ingredienteDAO.altaIngrediente("Lechuga","Verdura");
        ingredienteDAO.altaIngrediente("Tomate","Verdura");
        ingredienteDAO.altaIngrediente("Fideos","Pasta");
        ingredienteDAO.altaIngrediente("Salsa","Otros");
        ingredienteDAO.altaIngrediente("Cebolla","Verdura");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        ingredienteDAO.BorrarTodo();
    }

    @Test
    public void CargaInicial() throws Exception{
        Assert.assertEquals(9,ingredienteDAO.devolverIngredientes().size());
    }
    @org.junit.Test
    public void altaIngrediente() throws Exception {
    ingredienteDAO.altaIngrediente("Batata","Verdura");
        Assert.assertTrue(ingredienteDAO.devolverIngredientes().contains("Batata"));
        Assert.assertEquals(10,ingredienteDAO.devolverIngredientes().size());
    }

    @org.junit.Test
    public void borrarIngrediente() throws Exception {
        ingredienteDAO.borrarIngrediente("PanRallado");
        Assert.assertFalse(ingredienteDAO.devolverIngredientes().contains("PanRallado"));
    }

    @org.junit.Test
    public void modificarIngrediente() throws Exception {
        ingredienteDAO.modificarIngrediente("Huevo","Oreo","Galletita");
        Assert.assertFalse(ingredienteDAO.devolverIngredientes().contains("Huevo"));
        Assert.assertTrue(ingredienteDAO.devolverIngredientes().contains(("Oreo")));

    }

    @org.junit.Test
    public void devolverLasVerduras() throws Exception {
        Assert.assertTrue(ingredienteDAO.devolverLasVerduras().contains("Papa"));
        Assert.assertTrue(ingredienteDAO.devolverLasVerduras().contains("Lechuga"));
        Assert.assertTrue(ingredienteDAO.devolverLasVerduras().contains("Tomate"));
        Assert.assertTrue(ingredienteDAO.devolverLasVerduras().contains("Cebolla"));
        Assert.assertEquals(4,ingredienteDAO.devolverLasVerduras().size());

    }

}