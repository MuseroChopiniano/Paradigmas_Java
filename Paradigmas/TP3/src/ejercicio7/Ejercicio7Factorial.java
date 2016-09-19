package ejercicio7;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio7Factorial {

    public int Factorial(int n) {
        int resultado=1;
        if (n>1){
            resultado = n * (Factorial(n - 1));
        }
        return resultado;
    }
}
