package Ejercicio1;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio1 {
    private int[] max ={Integer.MIN_VALUE, Integer.MIN_VALUE};

    public int[] Mayores(int[] x) {
        for (int i=0; i<x.length; i++){
            if (x[i]> max[0]) {
                max[1] = max[0];
                max[0] = x[i];
            } else if (x[i]>max[1]) {
                max[1] = x[i];
            }
        }
        return max;
    }
}
