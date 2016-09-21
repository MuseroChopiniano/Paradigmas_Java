package ejercicio7;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio7Fibonacci {

    public int Fibonacci(int numero){
        int resultado=0;
        if (numero>1) {
           resultado= Fibonacci(numero-1)+Fibonacci(numero-2);
        } else if (numero==1){
            resultado=1;
        }
        return resultado;
    }
}





























