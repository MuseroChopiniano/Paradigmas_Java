package ejercicio4;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio4 {

    public int errorDesapercibido(){
        boolean salir=false;
        int resultado=0;

            for (int i=1111;i<=9999;i++){
               int aux=i;
                 int w=aux%10;
                aux=aux/10;
                int z=aux%10;
                aux=aux/10;
                int y=aux%10;
                aux=aux/10;
                int x=aux%10;

                int operacion=(int)Math.pow(x,y)*(int)Math.pow(z,w);
                resultado=x*1000+y*100+z*10+w;
                if (operacion==resultado){
                   return resultado;

                }
            }
return 0;
    }
}
