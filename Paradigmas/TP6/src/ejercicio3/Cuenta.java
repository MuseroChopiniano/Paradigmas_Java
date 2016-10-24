package ejercicio3;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 22/10/2016.
 */
public class Cuenta {
    int numero;
    double saldo;
    int pin;
    Cliente cliente;

    public Cuenta(int numero, Cliente cliente, int pin,Banco banco) {
        this.numero = numero;
        this.cliente= cliente;
        this.pin = pin;
        cliente.agregarCuenta(this);
        banco.agregarCuenta(this);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
