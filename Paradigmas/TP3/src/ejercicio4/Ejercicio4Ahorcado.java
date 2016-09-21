package ejercicio4;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio4Ahorcado {

    static String palabra;
static String[] palabras;

    public static void main(String[] args) throws IOException {
        cargarPalabras();

        Scanner usuarioScanner = new Scanner(System.in);
        int intentos=5;
        int aciertos=0;

        int numeroRandom = new Random().nextInt(palabras.length);
        palabra=palabras[numeroRandom];
        int tamaño=palabra.length();

        String[] respuesta=new String[tamaño];

        for (int i=0;i<tamaño;i++){
            respuesta[i]="_ ";
        }
        String vistaresp = "";
        String opcion;

        while(aciertos<tamaño&&intentos!=0){
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println("");
            vistaresp="";
            for (int i=0;i<tamaño;i++){
                vistaresp= vistaresp+respuesta[i];
            }
            System.out.print("\n"+vistaresp);
            System.out.println("\nIngrese una letra o palabra: ");
            opcion = usuarioScanner.next();

            if (palabra.contains(opcion)){
                int contador=0;
                for (int i=0;i<tamaño;i++){
                    for (int x=0;x<opcion.length();x++){
                        if (palabra.charAt(i)==opcion.charAt(x)){
                            respuesta[i]=String.valueOf(opcion.charAt(x));
                            contador++;
                        }
                    }
                }
                aciertos=aciertos+contador;
            } else intentos--;
        }

        if (intentos==0){
            System.out.println("Perdiste");
        } else {
            vistaresp="";
            for (int i=0;i<tamaño;i++){
                vistaresp= vistaresp+respuesta[i];
            }
            System.out.print("\n"+vistaresp);
            if (aciertos>tamaño){
                System.out.println("\nGanaste");
            }
        }
    }

    public static void cargarPalabras() throws IOException {
        String texto="";
        FileReader lector= new FileReader("C:\\Users\\GastónAlejandro\\Desktop\\Gastón\\UNIVERSIDAD\\UAI\\3er AÑO\\JAVA\\Paradigmas_Java\\Paradigmas\\TP3\\diccionario.txt");
        BufferedReader contenido = new BufferedReader(lector);
        ArrayList<String> aux=new ArrayList<>();

        while ((texto=contenido.readLine())!=null){
            aux.add(texto);
        }
        palabras = new String[aux.size()];
        aux.toArray(palabras);
    }
}
