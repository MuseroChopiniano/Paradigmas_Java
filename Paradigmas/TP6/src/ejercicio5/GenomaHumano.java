package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 27/10/2016.
 */
public class GenomaHumano {

    List<Gen> listaGenes = new ArrayList<Gen>();
    private static GenomaHumano instancia = null;

    public static synchronized GenomaHumano getInstancia(){
        if (instancia==null){
            instancia=new GenomaHumano();
        }
        return instancia;
    }

    public List<Gen> getListaGenes() {
        return listaGenes;
    }

    public void setListaGenes(List<Gen> listaGenes) {
        this.listaGenes = listaGenes;
    }

    public GenomaHumano() {
        for (int i=0;i<25000;i++){
            nuevoGen(i+1);
        }
    }

    public void nuevoGen(int idGen){
        int random = new Random().nextInt(6)+5;

        Gen gen = new Gen(idGen, random);
        getListaGenes().add(gen);
    }
}
