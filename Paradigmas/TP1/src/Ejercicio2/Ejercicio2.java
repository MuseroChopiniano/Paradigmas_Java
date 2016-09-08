package ejercicio2;

import java.util.Scanner;

/**
 * Created by Facu on 30/8/2016.
 */
public class Ejercicio2 {

    public int Mayor(int x){
        int Numero=0;
        int Divisor = 10;
        do{
            int Resto = x % Divisor;
            if (Resto > Numero)
            {
                Numero = Resto;
            }
            x = x / Divisor;
        } while (x!=0);
        return Numero;
    }

    public void Main(String[] args){
        int Valor;
        System.out.print("Ingrese un entero: ");
        Scanner nuevoValor = new Scanner (System.in);
        Valor = nuevoValor.nextInt();
        System.out.print("El dígito más alto del número ingresado es: \"" + Valor + "\"");
    }
}
