package ejercicio4;

import ejercicio3.Persona;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public class ProgramaEj4 {
    public static void main(String args[])
    {
        testIgualdad();
    }
    private static void testIgualdad(){

        System.out.println(new Persona("30999111")== new Persona("30999111"));
        System.out.println(new Persona("30999111").equals(new Persona("30999111")));

    }
}
