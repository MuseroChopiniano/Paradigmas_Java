package ejercicio5;

import ejercicio7.Ejercicio7;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio5Test {
    private Ejercicio5 ejercicio5;

    @Before
    public void setUp() throws Exception {
        this.ejercicio5 = new Ejercicio5();
    }

    @Test
    public void archivos() throws Exception {
        ArrayList<String> primosList = new ArrayList<String>();
        ArrayList<String> divisoresList = new ArrayList<String>();
        ArrayList<String> promediosList = new ArrayList<String>();
        String texto="";
        int[] array={2,10,1500, 300, 45, 63, 9, 11};
        String[] resultadoprimos = {"2", "11"};
        String[] resultadodivisores = {"2", "10", "1500", "300"};
        String[] resultadospromedios = {"Promedio números pares: 0.5", "Promedio números impares: 0.5"};
ejercicio5.archivos(array);
        try{
            FileReader lectorprimos = new FileReader("primos.txt");
            BufferedReader contenidoprimos = new BufferedReader(lectorprimos);
            while ((texto=contenidoprimos.readLine())!=null){
                primosList.add(texto);
            }

            FileReader lectordivisores = new FileReader("divisores de 3000.txt");
            BufferedReader contenidodivisores = new BufferedReader(lectordivisores);
            while ((texto=contenidodivisores.readLine())!=null){
                divisoresList.add(texto);
            }

            FileReader lectorpromedios = new FileReader("promedios.txt");
            BufferedReader contenidopromedios = new BufferedReader(lectorpromedios);
            while ((texto=contenidopromedios.readLine())!=null){
                promediosList.add(texto);
            }
        } catch (Exception e){
            System.out.println("Error");
        }
        String[] primos = new String[primosList.size()];
        primosList.toArray(primos);
        Assert.assertArrayEquals(resultadoprimos, primos);

        String[] divisores = new String[divisoresList.size()];
        divisoresList.toArray(divisores);
        Assert.assertArrayEquals(resultadodivisores, divisores);

        String[] promedios = new String[promediosList.size()];
        promediosList.toArray(promedios);
        Assert.assertArrayEquals(resultadospromedios, promedios);
    }

}