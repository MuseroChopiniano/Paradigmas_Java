package ejercicio4;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 23/10/2016.
 */
public class Contacto {
    String nombre;
    String apellido;
    int telefono;
    String email;
    Grupo grupo;

    public Contacto(String nombre, String apellido, int telefono, String email, Grupo grupo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.grupo = grupo;
        this.getGrupo().agregarContacto(this);
    }

    public Contacto(String nombre, String apellido, int telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;

    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
