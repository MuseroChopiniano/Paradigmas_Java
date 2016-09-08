package ejercicio7;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio7 {
    private int tiempo;

    public int CalculoTiempo(int x, int d) {
        tiempo=d/x;
        tiempo*=60;
        return tiempo;
    }
}
