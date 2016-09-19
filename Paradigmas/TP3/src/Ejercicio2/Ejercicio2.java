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

            String path = "LenguajeDeclarativo.txt";
            AnalizadorTxt(path);

            interaccion();
        }
        public static void interaccion()
        {
            System.out.println("\nIngrese una de las dos posibles preguntas con los siguientes formatos:\nesHermano(nombre1, nombre2)\nesAbuelo(nombreabuelo, nombrenieto)\nIngrese 0 para salir");
            Scanner scan = new Scanner(System.in);
            String pregunta;
           do {
               pregunta = scan.nextLine();
               String[] partes = pregunta.split("[(]");
               String[] partes2 = partes[1].split(", ");
               partes2[1] = partes2[1].substring(0, partes2[1].length() - 1);

               if (partes[0].compareTo("esHermano") == 0 | partes[0].compareTo("esAbuelo") == 0) {
                   System.out.println(evaluar(partes[0], partes2[0], partes2[1]));
               } else {
                   System.out.println("Sentencia incorrecta");
               }
           }while(pregunta.compareTo("0")!=0);
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
                    cadena=bufferread.readLine();
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
            if (tipo.compareTo("padre")==0)
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
            String respuesta="NO";
            if (eval.compareTo("esHermano")==0)
            {
                if (padres.get(nombre1) != null & padres.get(nombre2) != null)
                {
                    if (padres.get(nombre1).compareTo(padres.get(nombre2)) == 0)
                    {
                        respuesta = "SI";
                    }
                }
                if (madres.get(nombre1) != null & madres.get(nombre2) != null)
                {
                    if (madres.get(nombre1).compareTo(madres.get(nombre2)) == 0)
                    {
                        respuesta = "SI";
                    }
                }
            }
            if (eval.compareTo("esAbuelo")==0)
            {
                if (padres.get(nombre2)!=null & padres.get(padres.get(nombre2))!=null)
                {
                    if (padres.get(padres.get(nombre2)).compareTo(nombre1) == 0)
                    {
                        respuesta = "SI";
                    }
                }
                if (padres.get(nombre2)!=null & madres.get(padres.get(nombre2))!=null)
                {
                    if (madres.get(padres.get(nombre2)).compareTo(nombre1)==0)
                    {
                        respuesta="SI";
                    }
                }
                        if (madres.get(nombre2)!=null & padres.get(madres.get(nombre2))!=null)
                        {
                            if (padres.get(madres.get(nombre2)).compareTo(nombre1)==0)
                            {
                                respuesta="SI";
                            }

                        }
                        if (madres.get(nombre2)!=null & madres.get(madres.get(nombre2))!=null)
                        {
                            if (madres.get(madres.get(nombre2)).compareTo(nombre1)==0)
                            {
                                respuesta="SI";
                            }
                        }
            }
            return respuesta;
        }
    }
