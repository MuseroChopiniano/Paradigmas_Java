package ejercicio6;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio6 {
    int[] resultado=new int[2];

    public boolean primo(int numero){
        int contador=2;
        boolean primo=true;

        while((primo)&&(contador!=numero)){
            if (numero%contador==0){
                primo=false;
            }
            contador++;
        }
        return primo;
    }

    public int[] gemelos(int numero) {
        int aux=numero;
        while(resultado[0]==0 && resultado[1]==0){
            if(primo(aux)==true && primo(aux+2)==true){
                resultado[0]=aux;
                resultado[1]=aux+2;
            } else {
                aux++;
            }
        }
        return resultado;
    }
}

