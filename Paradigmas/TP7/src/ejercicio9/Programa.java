package ejercicio9;

import ejercicio8.C;
import ejercicio8.IA;
import ejercicio8.IB;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 06/11/2016.
 */
public class Programa {
    public static void main(String args[])
    {
        E e=new E();  /**Como E hereda de C, es del tipo C, IA e IB y como implementa ID tambien es de tipo ID, por lo que puede asignarse a cualquier variable de esos tipos.*/
        IA ia=e;
        IB ib=e;
        C c=e;
        ID id=e;
        ia.x();
        ib.y();
        c.z();
        id.w();

    }
}
