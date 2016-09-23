package ejercicio4;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Facu on 18/9/2016.
 */
public class Ejercicio4 {

    boolean resultado=true;

    public boolean balanceo(String expresion) {
        Stack<String> pila = new Stack<String>();
        for (int i = 0; i < expresion.length(); i++){
            switch (expresion.charAt(i)) {
                case '{':
                    if (pila.isEmpty()){
                    pila.push("{");
                    }
                    break;
                case '[':
                    if(pila.isEmpty()&&pila.lastElement()=="{"){
                        pila.push("[");
                    }
                    break;
                case '(':
                    pila.push("(");
                    break;
            }

            switch (expresion.charAt(i)) {
                case '}':
                    if (pila.lastElement() != "{") {
                        resultado = false;
                    } else pila.pop();
                    break;
                case ']':
                    if (pila.lastElement() != "[") {
                        resultado = false;
                    }else pila.pop();
                    break;
                case ')':
                    if (pila.lastElement() != "(") {
                        resultado = false;
                    }else pila.pop();
                    break;
            }
        }
        if (pila.isEmpty()){
            return resultado;
        } else return false;
    }
}
