package ejercicio5;

import ejercicio3.Direccion;
import ejercicio3.Persona;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class RegistroDeLasPersonasTest {
    private RegistroDeLasPersonas registro;
    @Before
    public void setUp() throws Exception {
        registro=new RegistroDeLasPersonas();
        Persona persona1=new Persona("29111999");
        persona1.setNombre("Luciano");
        persona1.setApellido("Perez");
        Direccion direccion1=new Direccion();
        direccion1.setCalle("34");
        direccion1.setNumero(567);
        persona1.setDireccion(direccion1);
        registro.agregarPersona(persona1);
        Persona persona2=new Persona("30333666");
        persona2.setNombre("Maricel");
        persona2.setApellido("Gonzalez");
        Direccion direccion2=new Direccion();
        direccion2.setCalle("34");
        direccion2.setNumero(567);
        persona2.setDireccion(direccion2);
        registro.agregarPersona(persona2);

    }

    @Test
    public void agregarPersona() throws Exception {
        registro.agregarPersona(new Persona("12345678"));
        Assert.assertEquals(3,registro.cantidadPersonas());
            }

    @Test
    public void recuperarPersona() throws Exception {
        Persona pPersona=registro.recuperarPersona("30333666");
        System.out.println(pPersona);
        Assert.assertEquals("Maricel",pPersona.getNombre());
    }

    @Test
    public void cantidadPersonas() throws Exception {
        Persona pPersona =new Persona("29111999"); /**A pesar de agregar una Persona con el mismo documento,
                                                    la lista la agrega igual, el unico problema que traeria es que al
                                                    recuperar la persona con un DNI repetido, por la implementacion del metodo
                                                    traeria la ultima persona de la lista con ese DNI*/
        pPersona.setNombre("Juan Andres");
        pPersona.setApellido("Perez");
        registro.agregarPersona(pPersona);
        registro.imprimirListaDePersonas();
              Assert.assertEquals(3,registro.cantidadPersonas());
    }

}