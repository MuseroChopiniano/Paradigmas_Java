package Ejercicio3;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Facu on 1/9/2016.
 */
public class Ejercicio3 {
    public static String resultado;
    public static String opcionConsola;
    public static int usuario;

    public static String Juego(int x, int y) {

        if (x==y) {
            resultado = "Empate";
        } else{
            if (x == 0 && y == 1) {
                resultado = "Ganó la consola con Papel";
            } else if (x == 0 && y == 2) {
                resultado = "Ganó el usuario con Piedra";
            }
            if (x == 1 && y==2) {
                resultado =  "Ganó la consola con Tijeras";
            } else if (x==1 && y==0) {
                resultado = "Ganó el usuario con Papel";
            }
            if (x==2 && y==0) {
                resultado = "Ganó la consola con Piedra";
            } else if (x==2 && y==1) {
                resultado = "Ganó el usuario con Tijeras";
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println("Ingrese una opción: ");
        String opcionUsuario = "";
        Scanner usuarioScanner = new Scanner(System.in);
        opcionUsuario = usuarioScanner.nextLine();

        int consola = new Random().nextInt(3);

        switch (opcionUsuario) {
            case "Piedra":
                usuario = 0;
                break;
            case "Papel":
                usuario = 1;
                break;
            case "Tijeras":
                usuario = 2;
                break;
        }

        switch (consola) {
            case 0:
                opcionConsola = "Piedra";
                break;
            case 1:
                opcionConsola = "Papel";
                break;
            case 2:
                opcionConsola = "Tijeras";
                break;
        }
        System.out.println("La consola eligió \"" + opcionConsola + "\"");

        System.out.println(Juego(usuario, consola));

    }
}
