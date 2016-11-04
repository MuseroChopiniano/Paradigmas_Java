package ejercicio7;

import java.util.*;

/**
 * Created by Facu on 4/11/2016.
 */
public class JuegoDeLaSilla {

    int cantDeSillas;
    List<String> listaJugadores = new ArrayList<String>();
    int nroRonda;

    public int getCantDeSillas() {
        return cantDeSillas;
    }

    public void setCantDeSillas(int cantDeSillas) {
        this.cantDeSillas = cantDeSillas;
    }

    public List<String> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<String> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public List<String> agregarJugadores(int cantJugadores){
        List<String> lista = new ArrayList<String>();
        Scanner nombreScanner = new Scanner(System.in);
        String nombre;

        for (int i=1;i<=cantJugadores;i++){
            System.out.print("Ingrese el nombre del jugador: \n");
            nombre=nombreScanner.nextLine();
            lista.add(nombre);
        }
        return lista;
    }

    public void nuevaVuelta(){
        int musica;
        Random tiempo = new Random();
        Random jugador = new Random();
        String perdedor = getListaJugadores().get(jugador.nextInt(getListaJugadores().size()));
        eliminarJugador(perdedor);
        Map<String, Integer> mapaJuego = new HashMap<String, Integer>();
        for (int i = 0;i<=getListaJugadores().size();i++){
            mapaJuego.put(getListaJugadores().get(i),i);

        }
        cantDeSillas--;
        musica=tiempo.nextInt(60);
        try{
            Thread.sleep(musica);
        }catch (Exception e){
            System.out.print("Se rompio el grabador");
        }
        System.out.print("Ronda "+ nroRonda + ": La música sonó "+ musica + " segundos y cuando paró la música perdió");
    }

    public void eliminarJugador(String jugador){
        getListaJugadores().remove(jugador);
    }

    public void jugar(){
        do {
            nuevaVuelta();
        }while (cantDeSillas>1);
    }

}
