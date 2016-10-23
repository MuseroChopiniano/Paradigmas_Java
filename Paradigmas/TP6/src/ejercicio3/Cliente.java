package ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 22/10/2016.
 */
public abstract class Cliente {
    String nombre;
    String apellido;
    int dni;
    List<Cuenta> listaCuentas = new ArrayList<Cuenta>();

    public String getNombre() {
        return nombre;
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
}
