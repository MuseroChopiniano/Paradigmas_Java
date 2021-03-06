package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 22/10/2016.
 */
public class Banco {
    List<Cliente> listaClientes = new ArrayList<Cliente>();
    List<Cuenta> listaCuentas = new ArrayList<Cuenta>();

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public Cuenta obtenerCuenta(int numeroCuenta){
        Cuenta cuenta=null;
        for (Cuenta c: getListaCuentas()) {
            if (numeroCuenta==c.getNumero()){
                cuenta=c;
            }
        }
        return cuenta;
    }

    public Cliente obtenerCliente(int dniCliente){
        Cliente cliente=null;
        for (Cliente cl: getListaClientes()) {
            if (dniCliente==cl.getDni()){
                cliente=cl;
            }
        }
        return cliente;
    }

    public void depositar(Cliente cliente, int numeroCuenta, int pin, int deposito){
        Cuenta cuenta = obtenerCuenta(numeroCuenta);
        if (cuenta.getPin()==pin){
            cuenta.setSaldo(cuenta.getSaldo() + deposito);
            cobrar(cliente, cuenta);
            System.out.print("La operación se realizó con éxito\n");
        }
    }

    public void extraer(Cliente cliente, int numeroCuenta, int pin, int extraccion){
        Cuenta cuenta = obtenerCuenta(numeroCuenta);
        if (cuenta.getPin()==pin){
            if (cuenta.getSaldo()>extraccion) {
                cuenta.setSaldo(cuenta.getSaldo() - extraccion);
                cobrar(cliente, cuenta);
                System.out.print("La operación se realizó con éxito\n");
                System.out.print("Se extrajo $" + extraccion + "\n");
            } else {
                System.out.print("No hay saldo suficiente para realizar la operación\n");
            }
        }
    }

    public double consultarSaldo(Cliente cliente, int numeroCuenta, int pin){
        Cuenta cuenta=obtenerCuenta(numeroCuenta);
        cobrar(cliente,cuenta);
        System.out.print("La operación se realizó con éxito\n");
        return cuenta.getSaldo();
    }

    public void cambiarPin(Cliente cliente, int numeroCuenta, int pinActual, int pinNuevo){
        Cuenta cuenta=obtenerCuenta(numeroCuenta);
        if (cuenta.getPin()==pinActual) {
            cuenta.setPin(pinNuevo);
            cobrar(cliente, cuenta);
            System.out.print("La operación se realizó con éxito\n");
        }
    }

    public void cobrar(Cliente cliente, Cuenta cuenta){
        Cuenta c=cliente.getCuenta(cuenta.getNumero(), cuenta.getPin());
        cliente.descuento(c);
    }

    public double generarInforme(){
        double saldo=0;
        for (Cuenta c:getListaCuentas()) {
            saldo+=c.getSaldo();
        }
        System.out.print("El saldo total del banco el día de hoy es de: $" + saldo + "\n");
        return saldo;
    }

    public void agregarCliente(Cliente cliente){
        getListaClientes().add(cliente);
    }

public void agregarCuenta(Cuenta cuenta){
    getListaCuentas().add(cuenta);
}
}
