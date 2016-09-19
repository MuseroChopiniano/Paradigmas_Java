package ejercicio1;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio1 {
    private int[] maximos ={Integer.MIN_VALUE, Integer.MIN_VALUE};

    public int[] mayores(int[] array) {
        for (int i=0; i<array.length; i++){
            if (array[i]> maximos[0]) {
                maximos[1] = maximos[0];
                maximos[0] = array[i];
            } else if (array[i]>maximos[1]) {
                maximos[1] = array[i];
            }
        }
        return maximos;
    }
}
