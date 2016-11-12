package ejercicio5;

import ejercicio3.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class RegistroDeLasPersonas {

    private List<Persona> listaPersonas = new ArrayList<Persona>();

    /**Metodos*/

    public void agregarPersona(Persona pPersona)
    {
        this.listaPersonas.add(pPersona);
    }
    public Persona recuperarPersona(String pDNI)
    {
        Persona pPersona=new Persona("00000000");
        for (int i=0;i<listaPersonas.size();i++)
        {
            if (listaPersonas.get(i).getDNI()==pDNI)
            {
                pPersona=listaPersonas.get(i);
            }
        }
        return  pPersona;
    }

    public int cantidadPersonas()
    {
        return this.listaPersonas.size();
    }

    public void imprimirListaDePersonas()
    {
        System.out.println(listaPersonas);
    }

    public void retornarPersonasOrdenadasDeMenorAMayor() {
    this.listaPersonas.sort(Persona::compareTo);
        imprimirListaDePersonas();
    }

}
