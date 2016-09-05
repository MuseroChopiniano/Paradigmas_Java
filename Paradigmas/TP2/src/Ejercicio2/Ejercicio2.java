package Ejercicio2;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio2 {
    private int numero;
    private int contnumero=0;
    public int MaxPares(int[] enteros) {
        for (int i=0; i<enteros.length; i++) {
            int x=i;
            int contador=0;
            do{
                int resto=x%10;
                if (resto%2==0){
                    contador++;
                }
            }while (x!=0);
            if (contador>contnumero) {
                numero= i;
            }
        }
        return numero;
    }
}
