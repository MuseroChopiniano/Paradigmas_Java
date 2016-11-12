package ejercicio2;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class ejercicio2 {

    public static void main(String args[])
    {
        set();
    }
    private static void set(){
        TreeSet<Integer> set= new TreeSet<Integer>();
        set.add(1);
        set.add(1); /** El valor 1 ya fue agregado en un nodo, por lo que no lo volvera a hacer*/
        set.add(3);
        System.out.println(set.size());
        System.out.println(set);

        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);   /** Agrega el valor por mas que lo hayamos agregado previamente */
        arrayList.add(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
