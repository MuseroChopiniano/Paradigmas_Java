package ejercicio8;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio8 {

    public int salir(int p, int s, int r){
        int dias=0;
        if (s>r){
            while (p>0) {
                p = p - s;
                if (p > 0) {
                    p = p + r;
                }
                dias++;
            }
        }
        return dias;
    }
}
