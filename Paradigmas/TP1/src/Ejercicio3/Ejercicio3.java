package Ejercicio3;

/**
 * Created by Facu on 1/9/2016.
 */
public class Ejercicio3 {

    public int Factorial(int n) {
        int resultado=1;
        if (n>1){
            resultado = n * (Factorial(n - 1));
        }
        return resultado;
    }
}
