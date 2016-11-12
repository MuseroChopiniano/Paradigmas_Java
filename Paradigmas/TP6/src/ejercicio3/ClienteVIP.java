package ejercicio3;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 22/10/2016.
 */
public class ClienteVIP extends Cliente {
    boolean viveEnCapital;

    public ClienteVIP(String nombre, String apellido, int dni, boolean viveEnCapital) {
        super(nombre, apellido, dni);
        this.viveEnCapital = viveEnCapital;
    }

    public boolean isViveEnCapital() {
                return viveEnCapital;
    }

    public void setViveEnCapital(boolean viveEnCapital) {
        this.viveEnCapital = viveEnCapital;
    }

    @Override
    public void descuento(Cuenta cuenta){
        if (isViveEnCapital()){
            cuenta.setSaldo(cuenta.getSaldo()-2);
        }
    }
}
