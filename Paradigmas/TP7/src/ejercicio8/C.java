package ejercicio8;

/**
 * Created by GastónAlejandro on 06/11/2016.
 */
public class C implements IA,IB {
    @Override
    public void x() {
        System.out.println("Se ejecuta el metodo \" x \" de la clase C" );
    }

    @Override
    public void y() {
        System.out.println("Se ejecuta el metodo \" y \" de la clase C" );
    }

    public void z()
    {
        System.out.println("Se ejecuta el metodo \" z \" de la clase C" );
    }
}
