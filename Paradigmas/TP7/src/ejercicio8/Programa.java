package ejercicio8;

/**
 * Created by GastónAlejandro on 06/11/2016.
 */
public class Programa {

    public static void main(String args[])
    {
        C c=new C();
        IA a=c;
        IB b=c;         /** como C implementa tanto la interfaz IA como la IB (simulando herencia multiple), puede
                        ser asignada a una variable del tipo IA o del tipo IB*/
        a.x();
        b.y();
    }
}
