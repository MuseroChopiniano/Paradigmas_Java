package Ejercicio6;

/**
 * Created by Facu on 3/9/2016.
 */
public class Ejercicio6 {
    int[] resultado=new int[2];

    public boolean Primo(int a){
        int contador=2;
        boolean primo=true;

        while((primo)&&(contador!=a)){
            if (a%contador==0){
                primo=false;
                contador++;
            }
        }
        return primo;
    }

    public int[] Gemelos(int m) {
       int i=m;
        while(resultado[0]==0 && resultado[1]==0){
           if(Primo(i)==true && Primo(i+2)==true){
               resultado[0]=i;
               resultado[1]=i+2;
            } else {
                i++;
            }
        }
        return resultado;
    }
}
