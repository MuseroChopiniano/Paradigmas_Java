package ejercicio5;

import Ejercicio8.Ejercicio8;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class Ejercicio5Test {
    private  Ejercicio5 Ejercicio5;
    private  int[][] matrizoriginal;
    private  int[][] matriztr;

    @Before
    public void setUp() throws Exception {
        Ejercicio5=new Ejercicio5();
        matrizoriginal=Ejercicio5.Matriz("C:/Users/GastónAlejandro/Desktop/Gastón/UNIVERSIDAD/UAI/3er AÑO/JAVA/Paradigmas_Java/Paradigmas/TP3/src/ejercicio5/Matriz.txt");
        matriztr=Ejercicio5.MatrizTranspuesta(matrizoriginal);
        Ejercicio5.GuardarMatrizTrans(matriztr,"C:/Users/GastónAlejandro/Desktop/Gastón/UNIVERSIDAD/UAI/3er AÑO/JAVA/Paradigmas_Java/Paradigmas/TP3/src/ejercicio5/MatrizTranspuesta.txt");
    }
    @Test
    public void CantFilas() throws  Exception{
        Assert.assertTrue(matriztr.length==matrizoriginal[0].length);
    }
    @Test
    public void CantColumnas() throws  Exception{
        Assert.assertTrue(matriztr[0].length==matrizoriginal.length);
    }


}