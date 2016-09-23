package ejercicio5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class Ejercicio5Test {
    private  Ejercicio5 Ejercicio5;
    private  int[][] matrizoriginal;
    private  int[][] matriztr;
    private String matrizTransPath="C:/Users/GastónAlejandro/Desktop/Gastón/UNIVERSIDAD/UAI/3er AÑO/JAVA/Paradigmas_Java/Paradigmas/TP3/src/ejercicio5/MatrizTranspuesta.txt";
    @Before
    public void setUp() throws Exception {
        Ejercicio5=new Ejercicio5();
        matrizoriginal=Ejercicio5.leerMatriz("C:/Users/GastónAlejandro/Desktop/Gastón/UNIVERSIDAD/UAI/3er AÑO/JAVA/Paradigmas_Java/Paradigmas/TP3/src/ejercicio5/Matriz.txt");
        matriztr=Ejercicio5.matrizTranspuesta(matrizoriginal);
        Ejercicio5.guardarMatrizTrans(matriztr,matrizTransPath);
    }
    @Test
    public void CantFilas() throws  Exception{
        int [][] matrizTransLeida;
        matrizTransLeida=Ejercicio5.leerMatriz(matrizTransPath);
        Assert.assertTrue(matrizTransLeida.length==matrizoriginal[0].length);
    }
    @Test
    public void CantColumnas() throws  Exception{
        int [][] matrizTransLeida;
        matrizTransLeida=Ejercicio5.leerMatriz(matrizTransPath);
        Assert.assertTrue(matrizTransLeida[0].length==matrizoriginal.length);
    }


}