package ejercicio6;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 31/10/2016.
 */
public class Presentador extends Asistente {

    Presentador(String nombre, String apellido, String institucion, Congreso congreso) {
        super(nombre, apellido, institucion, congreso);
        this.setDescuento();
    }

    @Override
    public double setDescuento() {
        descuento = this.getCongreso().getPrecioBase()*0.75;
        return descuento;
    }
}
