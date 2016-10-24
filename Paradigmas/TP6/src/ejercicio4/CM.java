package ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 23/10/2016.
 */
public class CM {
    List<Contacto> listaDeContactos= new ArrayList<Contacto>();
    List<Grupo> listaDeGrupos= new ArrayList<Grupo>();

    public List<Contacto> getListaDeContactos() {
        return listaDeContactos;
    }

    public void setListaDeContactos(List<Contacto> listaDeContactos) {
        this.listaDeContactos = listaDeContactos;
    }

    public List<Grupo> getListaDeGrupos() {
        return listaDeGrupos;
    }

    public void setListaDeGrupos(List<Grupo> listaDeGrupos) {
        this.listaDeGrupos = listaDeGrupos;
    }

    public Contacto getContacto(int telefono){
        Contacto contacto=null;
        for (Contacto c: getListaDeContactos()){
            if (c.telefono==telefono){
                contacto=c;
            }
        }
        return contacto;
    }

    public Grupo getGrupo(String nombreGrupo){
        Grupo grupo= null;
        for (Grupo g: getListaDeGrupos()){
            if (g.nombre==nombreGrupo){
                grupo=g;
            }
        }
        return grupo;
    }

    public void altaContacto(Contacto contacto){
        boolean flag=false;

        getListaDeContactos().add(contacto);
        if (contacto.grupo!=null){
            for (Grupo g:getListaDeGrupos()) {
                if (g.nombre==contacto.getGrupo().nombre){
                    g.agregarContacto(contacto);
                    flag=true;
                }
            }
            if (!flag) {
                getListaDeGrupos().add(contacto.getGrupo());
            }
        }
    }

    public void bajaContacto(Contacto contacto){
        for (Contacto c: getListaDeContactos()) {
            if (c==contacto){
                if (!(contacto.grupo==null)){
                    contacto.getGrupo().eliminarContacto(contacto);
                }
                getListaDeContactos().remove(c);
            }
        }
    }

    public void modificarContacto(Contacto contactoActual, Contacto contactoNuevo) {
        for (Contacto c : getListaDeContactos()) {
            if (c == contactoActual) {
                c.setNombre(contactoNuevo.nombre);
                c.setApellido(contactoNuevo.apellido);
                c.setTelefono(contactoNuevo.telefono);
                c.setEmail(contactoNuevo.email);
            }
        }
    }

    public void agregarGrupo(Grupo grupo){
        boolean yaExiste=false;
        for (Grupo g: getListaDeGrupos()){
            if (g==grupo){
                yaExiste=true;
            }
        }
        if (yaExiste==false){
            getListaDeGrupos().add(grupo);
        }
    }

    public void eliminarGrupo(Grupo grupo){
        for (Contacto c: grupo.getListaDeContactos()){
            c.grupo=null;
        }
        getListaDeGrupos().remove(grupo);
    }

    public void modificarGrupo(Grupo grupoActual, Grupo grupoNuevo){
        for (Grupo g: getListaDeGrupos()){
            if (g==grupoActual){
                g.nombre=grupoNuevo.nombre;
            }
        }
    }

    public void agregarContactoAGrupo(Contacto contacto, Grupo grupo){
        grupo.agregarContacto(contacto);
    }

    public void eliminarContactoDeGrupo(Contacto contacto,Grupo grupo){
        grupo.eliminarContacto(contacto);
    }
}
