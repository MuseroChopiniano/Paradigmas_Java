package ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 22/10/2016.
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
        for (Cuenta c: listaCuentas) {
            if (numeroCuenta==c.numero){
                cuenta=c;
            }
        }
        return cuenta;
    }

    public void depositar(int numeroCuenta, int pin, int saldo){
        Cuenta cuenta = obtenerCuenta(numeroCuenta);
        if (cuenta.pin==pin){
            cuenta.saldo+=saldo;

        }
    }
}
