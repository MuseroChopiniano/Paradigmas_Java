package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Facundo Tripelhorn y Gastón Suarez on 22/10/2016.
 */
public class PilaDeCaracteres {
    List<Character> pila= new ArrayList<Character>();
    int tamañoMax = 0;

    public PilaDeCaracteres() {
    }

    public PilaDeCaracteres(int max) {
        setTamañoMax(max);
    }

    public int getTamañoMax() {
        return tamañoMax;
    }

    public void setTamañoMax(int max) {
        this.tamañoMax = max;
    }

    public int length(){
        return pila.size();
    }

    public void push(Character caracter){
        if (tamañoMax==0) {
            pila.add(caracter);
        }else{
            if (length()<tamañoMax){
                pila.add(caracter);
            } else if (length()==tamañoMax) {
                System.out.print("Se alcanzó el tamaño máximo de elementos en la pila");
            }
        }

    }

    public Character pop(){
        Character ultimoCaracter = pila.get(length()-1);
        pila.remove(length()-1);
        return ultimoCaracter;
    }

    public boolean isEmpty(){
        if (pila.size()==0){
            return true;
        } else{
            return false;
        }
    }


}
