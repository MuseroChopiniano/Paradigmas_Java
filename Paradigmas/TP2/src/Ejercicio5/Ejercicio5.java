package Ejercicio5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Facu on 3/9/2016.
 */

public class Ejercicio5 {


    public static boolean Primo(int a){
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

    public static void Archivos(int[] x) {
        try {
            File primos = new File("primos.txt");
            FileWriter escribirprimos = new FileWriter(primos, true);
            File divisores3000 = new File("divisores de 3000.txt");
            FileWriter escribirdivisores = new FileWriter(divisores3000, true);
            File promedios = new File("promedios.txt");
            FileWriter escribirpromedios = new FileWriter(promedios, true);

            int contadorpar=0;
            int contadorimpar=0;

            for (int i = 0; i < x.length; i++) {
                if (Primo(x[i]) == true) {
                    escribirprimos.write(x[i] + "\n");
                    escribirprimos.close();
                }
                if (x[i]%3000==0){
                    escribirdivisores.write(x[i] + "\n");
                    escribirdivisores.close();
                }

                if (x[i]%2==0){
                   contadorpar++;
                }else if(x[i]!=0){
                    contadorimpar++;
                }
            }
            escribirpromedios.write("Promedio números pares: " +contadorpar/x.length + "\n");
            escribirpromedios.write("Promedio números impares: " +contadorimpar/x.length);
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
}
