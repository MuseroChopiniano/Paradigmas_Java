package ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 31/10/2016.
 */
public class Congreso {

    List<Asistente> listaDeAsistenteCreados = new ArrayList<Asistente>();
    List<Asistente> listaDeAsistentes = new ArrayList<Asistente>();
    String nombre;
    double precioBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asistente> getListaDeAsistentes() {
        return listaDeAsistentes;
    }

    public void setListaDeAsistentes(List<Asistente> listaDeAsistentes) {
        this.listaDeAsistentes = listaDeAsistentes;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public List<Asistente> getListaDeAsistenteCreados() {
        return listaDeAsistenteCreados;
    }

    public void setListaDeAsistenteCreados(List<Asistente> listaDeAsistenteCreados) {
        this.listaDeAsistenteCreados = listaDeAsistenteCreados;
    }

    public void crearAsistente(Asistente asistente){
        getListaDeAsistenteCreados().add(asistente);
    }

    public List<String> mostrarAsistentes(){
        List<String> lista = new ArrayList<String>();

        for (Asistente asistente: getListaDeAsistentes()){
            lista.add(asistente.getNombre() + " " + asistente.getApellido());
        }
        System.out.print("---Lista de asistentes---\n");
        for (String persona: lista){
            System.out.print(persona + "\n");
        }
        return lista;
    }

    public double cobrarEntrada(Asistente asistente){
        return this.getPrecioBase()-asistente.getDescuento();
    }

    public String imprimirCredencial(Asistente asistente) {
        System.out.print("---" + getNombre() + "---\n");
        System.out.print("Asistente: " + asistente.getApellido() + " " + asistente.getNombre() + "\n");
        System.out.print("Institución: " + asistente.getInstitucion() + "\n");
        String credencial = getNombre() + "\n" + asistente.getApellido() + " " + asistente.getNombre() + "\n" + asistente.getInstitucion();
        return credencial;
    }

    public Congreso(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
}
