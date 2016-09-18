package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by GastónAlejandro on 18/09/2016.
 */
public  class Ejercicio2
    {

        static Map<String, String> padres = new HashMap<String, String>();
        static Map<String, String> madres = new HashMap<String, String>();

        public static void main(String args[])
        {

            String path = "C:\\Users\\GastónAlejandro\\Desktop\\Gastón\\UNIVERSIDAD\\UAI\\3er AÑO\\JAVA\\2016-c2-20160829T164004Z\\2016-c2\\TPs\\Parte1\\javaprueba.txt";
            AnalizadorTxt(path);
            interaccion();

        }


        public static void interaccion()
        {
            System.out.println("\nIngrese una de las dos posibles preguntas con los siguientes formatos:\nesHermano(nombre1, nombre2)\nesAbuelo(nombreabuelo, nombrenieto)");
            Scanner scan = new Scanner(System.in);
            String pregunta = scan.next();
            String[] partes = pregunta.split("[(]");
            String[] partes2=partes[1].split(", ");
            partes2[1]=partes2[1].substring(0,partes2[1].length()-1);

            while (partes[0]!="esHermano" | partes[0]!="esAbuelo");
            {
                System.out.println("\n" + evaluar(partes[0],partes2[0],partes2[1]));
            }
        }

        public static void AnalizadorTxt(String archivo)
        {
            String cadena;
            try
            {
                BufferedReader bufferread= new BufferedReader(new FileReader(archivo));
                cadena = bufferread.readLine();
                while (cadena != null)
                {
                    String[] partes = cadena.split ("[(]");
                    CargarMaps(partes[0],partes[1]);
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("\nSe produjo una FileNotFoundException");
            }
            catch (IOException e)
            {
                System.out.println ("\nSe produjo una IOException");
            }
        }
        public static void CargarMaps(String tipo, String dato)
        {
            dato=dato.substring(0,dato.length()-1);
            String[] partesdato = dato.split(", ");
            if (tipo=="padre")
            {
                padres.put(partesdato[1],partesdato[0]);
            }
            else
            {
                madres.put(partesdato[1],partesdato[0]);
            }
        }

        public static String evaluar(String eval, String nombre1, String nombre2)
        {
            String respuesta="";
            if (eval=="esHermano")
            {
                if (padres.get(nombre1)==padres.get(nombre2) || madres.get(nombre1)==madres.get(nombre2))
                {
                    respuesta = "SI";
                }
                else
                {
                    respuesta="NO";
                }
            }
            if (eval=="esAbuelo")
            {
                if(padres.get(padres.get(nombre2))==nombre1)
                {
                    respuesta="SI";
                }
                else
                {
                    respuesta="NO";
                }
            }
            return respuesta;
        }
    }
