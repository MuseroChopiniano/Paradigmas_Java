package ejercicio4;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio4 {

    int Z;
    public int Resultado(int x, int y) {
        if (x + y < 1) {
            Z = 5;
        } else if (x + y >= 1) {
            Z = (int) Math.pow(y, 2);
        }
        return Z;
    }
}
