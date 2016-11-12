package ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 23/10/2016.
 */
public class BancoTest {
    Banco banco;
    Cuenta cuenta;
    @Before
    public void setUp() throws Exception {
        banco = new Banco();
        banco.agregarCliente(new Cliente("Facundo", "Tripelhorn", 39507742));
        banco.agregarCliente(new ClienteVIP("Juana", "Perez", 39574821, true));
        banco.agregarCliente(new ClienteVIP("Gaston", "Suarez", 26842359, false));
        cuenta = new Cuenta(123, banco.obtenerCliente(39507742), 0152, banco);
        Cuenta cuenta2 = new Cuenta(214, banco.obtenerCliente(39574821), 1234, banco);
        Cuenta cuenta3 = new Cuenta(111, banco.obtenerCliente(26842359), 3690, banco);
        banco.depositar(banco.obtenerCliente(39574821), 214,1234,20);
        banco.depositar(banco.obtenerCliente(26842359), 111, 3690, 20);
    }

    @Test
    public void obtenerCuenta() throws Exception {
        Cuenta cuentaPedida = banco.obtenerCuenta(123);
        Cliente clienteDueño = banco.obtenerCliente(39507742);
        Assert.assertEquals(clienteDueño, cuentaPedida.cliente);
    }

    @Test
    public void depositar() throws Exception {
        Cliente clienteDueño = banco.obtenerCliente(39507742);
        banco.depositar(clienteDueño, 123, 0152, 20);
        Assert.assertTrue(14==cuenta.getSaldo());
    }

    @Test
    public void extraer() throws Exception {
        Cliente clienteDueño = banco.obtenerCliente(39507742);
        banco.depositar(clienteDueño, 123, 0152, 20);
        banco.extraer(clienteDueño, 123, 0152, 5);
        Assert.assertTrue(3== cuenta.getSaldo());
    }

    @Test
    public void consultarSaldo() throws Exception {
        Cliente clienteDueño = banco.obtenerCliente(39574821);

        double saldo=banco.consultarSaldo(clienteDueño, 214, 1234);
        Assert.assertTrue(16==saldo);
    }

    @Test
    public void cambiarPin() throws Exception {
        Cliente clienteDueño = banco.obtenerCliente(39507742);
        banco.depositar(clienteDueño, 123, 0152, 20);
        banco.cambiarPin(clienteDueño, 123, 0152, 3690);
        Assert.assertTrue(3690==cuenta.getPin());
    }

    @Test
    public void generarInforme() throws Exception {
        Cliente clienteDueño = banco.obtenerCliente(39507742);
        banco.depositar(clienteDueño, 123, 0152, 20);
        double informe = banco.generarInforme();
        Assert.assertTrue(52==informe);
    }

}