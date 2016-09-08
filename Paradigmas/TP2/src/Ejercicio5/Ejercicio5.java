package ejercicio5;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio5 {

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

    public void archivos(int[] array) {
        try {
            File primos = new File("primos.txt");
            FileWriter escribirprimos = new FileWriter(primos, true);
            File divisores3000 = new File("divisores de 3000.txt");
            FileWriter escribirdivisores = new FileWriter(divisores3000, true);
            File promedios = new File("promedios.txt");
            FileWriter escribirpromedios = new FileWriter(promedios, true);

            int contadorpar=0;
            int contadorimpar=0;

            for (int i = 0; i < array.length; i++) {
                if (primo(array[i]) == true) {
                    escribirprimos.write(array[i] + "\n");
                }
                if (3000%array[i]==0){
                    escribirdivisores.write(array[i] + "\n");
                }

                if (array[i]%2==0){
                    contadorpar++;
                }else if(array[i]!=0){
                    contadorimpar++;
                }
            }

            double promediopar=(double)contadorpar/array.length;
            double promedioimpar=(double)contadorimpar/array.length;
            escribirpromedios.write("Promedio números pares: " + promediopar + "\n");
            escribirpromedios.write("Promedio números impares: " + promedioimpar);
            escribirprimos.close();
            escribirdivisores.close();
            escribirpromedios.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
