package ejercicio6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 31/10/2016.
 */
public class CongresoTest {
    Congreso congreso;
    Asistente asistente;
    @Before
    public void setUp() throws Exception {
        this.congreso = new Congreso("CIITI", 100);
        this.asistente = new Alumno("Facundo", "Tripelhorn", "UAI", congreso, 3);
    }

    @Test
    public void crearAsistente() throws Exception{
        Particular particular = new Particular("Gastón", "Suarez", "CAETI", congreso, true);
        Presentador presentador = new Presentador("Juan", "Perez", "CAETI", congreso);
        Assert.assertTrue(3==congreso.getListaDeAsistenteCreados().size());
    }

    @Test
    public void agregarAsistente() throws Exception {
        this.asistente.agregarAListaDeAsistentes();
        Assert.assertTrue(1==congreso.getListaDeAsistentes().size());
    }

    @Test
    public void mostrarAsistentes() throws Exception {
        Particular particular = new Particular("Gastón", "Suarez", "CAETI", congreso, true);
        Presentador presentador = new Presentador("Juan", "Perez", "CAETI", congreso);
        this.asistente.agregarAListaDeAsistentes();
        particular.agregarAListaDeAsistentes();
        presentador.agregarAListaDeAsistentes();

        List<String> lista = congreso.mostrarAsistentes();

        Assert.assertEquals("Facundo Tripelhorn",lista.get(0));
    }

    @Test
    public void precioEntrada() throws Exception {
        Assert.assertTrue(75== congreso.cobrarEntrada(asistente));

        Particular particular = new Particular("Gastón", "Suarez", "CAETI", congreso, true);
        particular.agregarAListaDeAsistentes();
        Assert.assertTrue(90==congreso.cobrarEntrada(particular));

        Presentador presentador = new Presentador("Juan", "Perez", "CAETI", congreso);
        presentador.agregarAListaDeAsistentes();
        Assert.assertTrue(25==congreso.cobrarEntrada(presentador));
    }

    @Test
    public void imprimirCredencial() throws Exception {
        String credencialEsperada = congreso.getNombre() + "\n" + asistente.getApellido() + " " + asistente.getNombre() + "\n" + asistente.getInstitucion();
        Assert.assertEquals(credencialEsperada, congreso.imprimirCredencial(asistente));
    }

}