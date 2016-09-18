package Ejercicio1;

/**
 * Created by Facu on 30/8/2016.
 */
public class Ejercicio1 {
    boolean resultado;
    public boolean Pertenece(int x,int y) {
        if (y == 7 * x + 3){
            resultado= true;
        }
        else if (y!=7* x+3) {
            resultado=false;
        }
        return resultado;
    }
}
