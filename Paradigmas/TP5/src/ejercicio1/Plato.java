package ejercicio1;

/**
 * Created by GastónAlejandro on 17/10/2016.
 */
public class Plato {
   /**Atributos*/
    private String nombre;
    private int cantidadIngredientes;
    private double precioBase;
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
