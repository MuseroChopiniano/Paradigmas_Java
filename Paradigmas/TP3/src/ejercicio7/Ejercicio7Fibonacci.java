package ejercicio7;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio7Fibonacci {

    public int Fibonacci(int numero){
        if (numero>1) {
           return Fibonacci(numero-1)+Fibonacci(numero-2);
        } else return 1;
    }
}





























