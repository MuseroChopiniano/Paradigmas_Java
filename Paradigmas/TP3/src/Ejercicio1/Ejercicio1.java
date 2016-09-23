package ejercicio1;

/**
 * Created by GastónAlejandro on 06/09/2016.
 */
public class Ejercicio1 {
    public double retornaResultado(String pString)
    {
        double mResultado = 0;
        String operandos [];
        operandos= new String[3];
        operandos=pString.split(" ");
        int operando1 = Integer.parseInt(operandos[0]);
        int operando2 =Integer.parseInt (operandos[2]);
        if (operandos[1].compareTo("+")==0)
        {
            mResultado=operando1+operando2;
        }
        if (operandos[1].compareTo("-")==0) {
            mResultado=operando1-operando2;
        }
        if (operandos[1].compareTo("*")==0){
            mResultado=operando1*operando2;
        }
        if (operandos[1].compareTo("/")==0) {
            mResultado=operando1/operando2;
        }
        return mResultado;

    }
}
