package ejercicio3;

/**
 * Created by Facu on 1/9/2016.
 */
public class Ejercicio3 {

    public int factorial(int n) {
        int resultado=1;
        if (n>1){
            resultado = n * (factorial(n - 1));
        }
        return resultado;
    }
}
