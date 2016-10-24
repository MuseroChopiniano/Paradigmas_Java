package ejercicio4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 23/10/2016.
 */
public class CMTest {
    CM cm;
    @Before
    public void setUp() throws Exception {
        cm = new CM();
        cm.altaContacto(new Contacto("Facundo", "Tripelhorn", 1151385486, "facundo.tripelhorn@gmail.com", new Grupo("UAI")));
    }

    @Test
    public void altaContacto() throws Exception {
        cm.altaContacto(new Contacto("Gastón", "Suarez", 1140941369, "gaston.suarez@gmail.com", new Grupo("UAI")));
        Assert.assertTrue(2==cm.getListaDeContactos().size());
        Assert.assertTrue(1==cm.getListaDeGrupos().size());
    }

    @Test
    public void bajaContacto() throws Exception {
        Contacto contacto = new Contacto("Gastón", "Suarez", 1140941369, "gaston.suarez@gmail.com", new Grupo("UAI"));
        cm.altaContacto(contacto);
        cm.bajaContacto(cm.getListaDeContactos().get(0));
        Assert.assertEquals(1, cm.getListaDeContactos().size());
        Assert.assertEquals(1, cm.getGrupo("UAI").getListaDeContactos().size());
    }

    @Test
    public void modificarContacto() throws Exception {
        Contacto contacto = new Contacto("Gastón", "Suarez", 1140941369, "gaston.suarez@gmail.com", new Grupo("UAI"));
        cm.modificarContacto(cm.getListaDeContactos().get(0), contacto);
        Assert.assertEquals("Gastón", cm.getContacto(1140941369).nombre);
    }

    @Test
    public void agregarGrupo() throws Exception {
        cm.agregarGrupo(new Grupo("Paradigmas"));
        Assert.assertTrue(2==cm.getListaDeGrupos().size());
    }

    @Test
    public void eliminarGrupo() throws Exception {
        cm.agregarGrupo(new Grupo("Paradigmas"));
        cm.eliminarGrupo(cm.getListaDeGrupos().get(0));
        Assert.assertTrue(1==cm.getListaDeGrupos().size());
        Assert.assertTrue(null==cm.getListaDeContactos().get(0).getGrupo());
    }

    @Test
    public void modificarGrupo() throws Exception {
        cm.modificarGrupo(cm.getListaDeGrupos().get(0), new Grupo("Universidad"));
        Assert.assertTrue("Universidad"==cm.getListaDeGrupos().get(0).nombre);
    }

    @Test
    public void agregarContactoAGrupo() throws Exception {
        cm.altaContacto(new Contacto("Juan", "Perez", 1146631281, "juan.perez@gmail.com"));
        cm.agregarContactoAGrupo(cm.getContacto(1146631281), cm.getGrupo("UAI"));
        Assert.assertTrue(2==cm.getGrupo("UAI").getListaDeContactos().size());
    }

    @Test
    public void eliminarContactoDeGrupo() throws Exception {
        cm.eliminarContactoDeGrupo(cm.getContacto(1151385486), cm.getGrupo("UAI"));
        Assert.assertTrue(0==cm.getGrupo("UAI").getListaDeContactos().size());
    }

}