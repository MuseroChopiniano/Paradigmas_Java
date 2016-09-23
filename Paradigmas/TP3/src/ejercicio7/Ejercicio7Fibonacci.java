package ejercicio7;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio7Fibonacci {

    public int fibonacci(int numero){
        int resultado=0;
        if (numero>1) {
           resultado= fibonacci(numero-1)+ fibonacci(numero-2);
        } else if (numero==1){
            resultado=1;
        }
        return resultado;
    }
}





























