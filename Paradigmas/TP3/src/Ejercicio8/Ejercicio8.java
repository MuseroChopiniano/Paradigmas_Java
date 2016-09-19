package Ejercicio8;

/**
 * Created by GastónAlejandro on 18/09/2016.
 */
public class Ejercicio8
{
    private  String[] Arreglo;
    private  int posicion;


    public String[] Combinaciones(int n)
    {
        posicion=0;
        Arreglo=new String[(int)Math.pow(2,n)];
        Combinar(n,"A");
        Combinar(n,"N");
        return Arreglo;
    }
    public  void Combinar(int n,String actualstr)
    {
        if (actualstr.length()==n)
        {
            Arreglo[posicion]=actualstr;
            posicion+=1;
        }
        else
        {
            Combinar(n,actualstr+"A");
            Combinar(n,actualstr+"N");

        }
    }
}
