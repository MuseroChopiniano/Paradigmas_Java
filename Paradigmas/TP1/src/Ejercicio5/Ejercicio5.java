package ejercicio5;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio5 {
    private int r;
    public int Funcion(int x, int y) {
        for (int i=0; i<1001; i++) {
            if (i%x==0) {
                if (i % y == 0) {
                    if (i>r) {
                        r=i;
                    }
                }
            }
        }
        return r;
    }
}
