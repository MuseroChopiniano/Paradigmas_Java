package Ejercicio6;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio6 {
    private int a;
    private int b;
    private int c;

    public int ordenar(int x, int y, int z) {
        if (x<y && x<z) {
            a = x;
            if (y < z) {
                b = y;
                c = z;
            } else {
                b = z;
                c = y;
            }
        } else if (y<x && y<z){
            a=y;
            if (x<z){
                b=x;
                c=z;
            } else {
                b=z;
                c=x;
            }
        } else if (z<x && z<y) {
            a=z;
            if(x<y) {
                b=x;
                c=y;
            } else {
                b=y;
                c=x;
            }
        }
        return a & b & c;
    }
}
