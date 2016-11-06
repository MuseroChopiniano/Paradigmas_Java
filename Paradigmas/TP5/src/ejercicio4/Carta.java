package ejercicio4;

import ejercicio3.Plato;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Carta {

    /**Atributos*/
    private List<Plato> listaPlatos= new ArrayList<Plato>();

    /**Métodos*/

    public void agregarPlato(Plato unPlato)
    {
        this.listaPlatos.add(unPlato);
    }
    public void removerPlato(Plato unPlato)
    {
        this.listaPlatos.remove(unPlato);
    }
    public double precioPromedio()
    {
        double mprecioPromedio=0;
        for (int i=0;i<listaPlatos.size();i++)
        {
            mprecioPromedio+=listaPlatos.get(i).getPrecio();
        }
        return mprecioPromedio/listaPlatos.size();
    }
    public Plato platoConMejorOpinion()
    {
        Plato platoConMejorOpinion=listaPlatos.get(0);
        for (int i=1;i<listaPlatos.size();i++)
        {
            if (listaPlatos.get(i).getOpinionPromedio()> platoConMejorOpinion.getOpinionPromedio())
            {
                platoConMejorOpinion=listaPlatos.get(i);
            }

        }
        return platoConMejorOpinion;
    }


}
