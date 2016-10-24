package ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 22/10/2016.
 */
public class Cliente {
    String nombre;
    String apellido;
    int dni;
    List<Cuenta> listaCuentas = new ArrayList<Cuenta>();

    public String getNombre() {
        return nombre;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void agregarCuenta(Cuenta cuenta){
        listaCuentas.add(cuenta);
    }

    public void eliminarCuenta(int numeroCuenta){
        for (int i=0;i<listaCuentas.size();i++) {
            if (listaCuentas.get(i).numero == numeroCuenta) {
                listaCuentas.remove(i);
            }
        }
    }

    public Cuenta getCuenta(int numeroCuenta, int pin){
        Cuenta cuenta=null;
        for (Cuenta c: this.getListaCuentas()) {
            if (c.getNumero()==numeroCuenta & c.getPin()==pin){
                cuenta=c;
            }
        }
        return cuenta;
    }

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
