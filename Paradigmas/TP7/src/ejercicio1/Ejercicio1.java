package ejercicio1;

import java.util.ArrayList;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class Ejercicio1 {

    ArrayList arrayListNoTipado = new ArrayList();
    ArrayList<String> arrayListTipado = new ArrayList<String>();

    /** Compilan perfecto */
    public void intento1()
    {
        arrayListNoTipado.add("unElemento");
        arrayListTipado.add("unElemento");
    }
        String unElemento;
    String otroElemento;
    public void intento2()
    {
       /** String unElemento=arrayListNoTipado.get(0);  No compila porque
        * no sabe que objeto puede llegar a tener la lista, por lo que si queremos
        * que compile debemos castear explícitamente a String el elemento de la lista.*/
         unElemento=(String)arrayListNoTipado.get(0);
         otroElemento=arrayListTipado.get(0);
    }
    public void intento3()
    {
        arrayListNoTipado.add(3);
        /** arrayListTipado.add(3);   Como la lista está tipada con Strings
         * no podemos agregarle un entero, lo que se puede hacer es pasarlo
         * como String y cuando lo querramos utilizar, lo casteamos a entero*/
        arrayListTipado.add("3");
    }
}
