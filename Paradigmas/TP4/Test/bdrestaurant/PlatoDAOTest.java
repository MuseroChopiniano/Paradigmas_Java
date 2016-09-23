package bdrestaurant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 19/9/2016.
 */
public class PlatoDAOTest {
    @Before
    public void setUp() throws Exception {
        IngredienteDAO.inicializar();
        PlatoDAO.inicializar();
        IngredienteDAO.altaIngrediente("CarneParaMilanesa", "Carne");
        IngredienteDAO.altaIngrediente("PanRallado", "Otros");
        IngredienteDAO.altaIngrediente("Huevo", "Otros");
        IngredienteDAO.altaIngrediente("Lechuga", "Verdura");
        IngredienteDAO.altaIngrediente("Tomate", "Verdura");
        IngredienteDAO.altaIngrediente("Fideos", "Pasta");
        IngredienteDAO.altaIngrediente("Salsa", "Otros");
        IngredienteDAO.altaIngrediente("Cebolla", "Verdura");

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

        PlatoDAO.altaPlato("Milanesa", ingredientesMilanesa, 70);
        PlatoDAO.altaPlato("EnsaladaMixta", ingredientesEnsalada, 50);
        PlatoDAO.altaPlato("FideosConSalsa", ingredientesFideos, 70);
    }

    @After
    public void tearDown() throws Exception {
        BaseDatos.borrarTodo("PLATO");
        BaseDatos.borrarTodo("INGREDIENTE");
    }

    @Test
    public void testCargaInicial() throws Exception{
        Assert.assertTrue(3==PlatoDAO.contar());
    }

    @Test
    public void testAltaPlato() throws Exception {
        List<String> ingredientesAlta = new ArrayList<String>();
        ingredientesAlta.add("Cebolla");
        ingredientesAlta.add("Tomate");
        ingredientesAlta.add("Lechuga");
        ingredientesAlta.add("Huevo");

        PlatoDAO.altaPlato("EnsaladaCompleta", ingredientesAlta, 85);
Assert.assertTrue(4==PlatoDAO.contar());
    }

    @Test
    public void testBorrarPlato() throws Exception {
        PlatoDAO.borrarPlato("EnsaladaMixta");
        Assert.assertTrue(2== PlatoDAO.contar());
    }

    @Test
    public void testModificarPlato() throws Exception {
        List<String> ingredientesEnsalada = new ArrayList<String>();
        ingredientesEnsalada.add("Lechuga");
        ingredientesEnsalada.add("Tomate");
        PlatoDAO.modificarPlato("EnsaladaMixta", "Ensalada", ingredientesEnsalada, 50);
        Assert.assertTrue(PlatoDAO.devolverPlatos().contains("Ensalada"));
    }
}