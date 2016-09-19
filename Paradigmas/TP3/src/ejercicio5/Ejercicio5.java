package ejercicio5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        GuardarMatrizTrans(MatrizTranspuesta(Matriz("C:/Users/GastónAlejandro/Desktop/Gastón/UNIVERSIDAD/UAI/3er AÑO/JAVA/Paradigmas_Java/Paradigmas/TP3/src/ejercicio5/Matriz.txt")),"C:/Users/GastónAlejandro/Desktop/Gastón/UNIVERSIDAD/UAI/3er AÑO/JAVA/Paradigmas_Java/Paradigmas/TP3/src/ejercicio5/MatrizTranspuesta.txt");

    }
    public static int[][] Matriz(String Path)
    {
        List<String> Lista=new ArrayList<String>();
                try {
                        String cadena;

            BufferedReader bufferread = new BufferedReader(new FileReader(Path));
            do {
                cadena = bufferread.readLine();
                if (cadena!=null) {
                    Lista.add(cadena);
                }
            }while(cadena!=null);

            }
            catch (FileNotFoundException ex)
            {
                System.out.println(ex.getMessage());
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        int[][] mimatriz = new int[Lista.size()][Lista.get(0).split("\\s").length];
        for (int i=0; i< Lista.size();i++)
        {
            String[] linea=Lista.get(i).split("\\s");
            for (int j=0; j< linea.length;j++)
            {
                mimatriz[i][j]=Integer.parseInt(linea[j]);
            }
        }
        return mimatriz;
    }
    public static int[][] MatrizTranspuesta(int[][] matrizoriginal)
    {
        int[][] matriztrans= new int[matrizoriginal[0].length][matrizoriginal.length];
        for(int i = 0; i < matrizoriginal.length; i++){
            for(int j = 0; j < matrizoriginal[0].length; j++){
                matriztrans[j][i] = matrizoriginal[i][j];
            }
        }
        return matriztrans;
    }
    public static void GuardarMatrizTrans(int[][] matriztrans,String path)
    {
        try{
            BufferedWriter buffwrite = new BufferedWriter(new FileWriter(path));
            String linea;

            for(int i = 0; i < matriztrans.length; i++)
            {
                linea= "";
                for(int j = 0; j < matriztrans[0].length; j++)
                {
                    linea+= matriztrans[i][j] + " ";
                    if(j == matriztrans[0].length - 1)
                    {
                        linea += "\r\n";
                    }
                }
                buffwrite.write(linea);
            }
            buffwrite.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    }

