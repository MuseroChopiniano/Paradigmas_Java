package ejercicio6;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 31/10/2016.
 */
public abstract class Asistente {
    private String nombre;
    private String apellido;
    private String institucion;
    double descuento;
    private Congreso congreso;

    Asistente(String nombre, String apellido, String institucion, Congreso congreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.institucion = institucion;
        this.congreso = congreso;
        this.congreso.crearAsistente(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Congreso getCongreso() {
        return congreso;
    }

    public void setCongreso(Congreso congreso) {
        this.congreso = congreso;
    }

    public void agregarAListaDeAsistentes(){
        this.getCongreso().getListaDeAsistentes().add(this);
    }

    public abstract double setDescuento();
}
