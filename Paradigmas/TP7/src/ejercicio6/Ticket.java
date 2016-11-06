package ejercicio6;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Ticket {
    private tipoLocalidad localidad;

    public void setLocalidad(tipoLocalidad pLocalidad)
    {
        this.localidad=pLocalidad;
    }

    @Override
    public String toString()
    {
        return this.localidad + ": " + this.localidad.getMonto() +  " pesos";
    }

}
