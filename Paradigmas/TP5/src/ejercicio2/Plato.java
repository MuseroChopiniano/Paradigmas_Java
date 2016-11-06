package ejercicio2;

import java.util.ArrayList;

/**
 * Created by GastónAlejandro on 05/11/2016.
 */
public class Plato {

    /**Atributos*/
    private String nombre;
    private int cantidadIngredientes;
    private double precioBase;
    private ArrayList<Integer> puntajeOpiniones=new ArrayList<Integer>();

    /**Getters y setters*/
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String pNombre)
    {
        this.nombre=pNombre;
    }
    public int getCantidadIngredientes()
    {
        return this.cantidadIngredientes;
    }
    public void setCantidadIngredientes(int pCantidadIngredientes)
    {
        this.cantidadIngredientes=pCantidadIngredientes;
    }
    public double getPrecioBase()
    {
        return this.precioBase;
    }
    public  void setPrecioBase(double pPrecioBase)
    {
        this.precioBase=pPrecioBase;
    }

/**Métodos*/

    public double getPrecio()
    {
        if (this.cantidadIngredientes>3)
        {
            return (2*this.cantidadIngredientes);
        }
        else
        {
            return (3*this.cantidadIngredientes);
        }
    }

    public double getOpinionPromedio()
    {
        double retorno=0;
        for (int i=0;i<this.puntajeOpiniones.size();i++)
        {
            retorno+=this.puntajeOpiniones.get(i);
        }

        return retorno/this.puntajeOpiniones.size();
    }
    public void agregarOpinion(int unPuntaje)
    {
        this.puntajeOpiniones.add(unPuntaje);
    }

    /**Constructores*/
    public Plato()
    {
    }
    public Plato(String elNombre, int cantidadDeIngredientes)
    {
        this.setNombre(elNombre);
        this.setCantidadIngredientes(cantidadDeIngredientes);
    }
}
