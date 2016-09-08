package ejercicio2;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio2 {
    private int numero;
    private int contadornumero=0;

    public int maxPares(int[] enteros) {
        for (int i=0; i<enteros.length; i++) {
            int aux=enteros[i];
            int contador=0;
            do{
                int resto=aux%10;
                if (resto%2==0){
                    contador++;
                }
                aux=aux/10;
            }while (aux!=0);
            if (contador>contadornumero) {
                contadornumero=contador;
                numero= enteros[i];
            }
        }
        return numero;
    }
}

