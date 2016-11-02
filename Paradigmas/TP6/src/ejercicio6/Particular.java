package ejercicio6;

/**
 * Created by Facu on 31/10/2016.
 */
public class Particular extends Asistente {

    private boolean viveEnCBA;

    Particular(String nombre, String apellido, String institucion, Congreso congreso, boolean viveEnCBA) {
        super(nombre, apellido, institucion, congreso);
        this.viveEnCBA = viveEnCBA;
        this.setDescuento();
    }

    public boolean isViveEnCBA() {

        return viveEnCBA;
    }

    public void setViveEnCBA(boolean viveEnCBA) {
        this.viveEnCBA = viveEnCBA;
    }


    @Override
    public double setDescuento() {
        descuento = this.getCongreso().getPrecioBase()*0.10;
        return descuento;
    }
}
