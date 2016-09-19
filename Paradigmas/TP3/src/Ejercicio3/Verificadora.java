package Ejercicio3;

import sun.font.TrueTypeFont;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by GastónAlejandro on 18/09/2016.
 */
public class Verificadora
{
    public boolean TelNum(String cadena)
    {
        boolean respuesta=false;
        Pattern patron= Pattern.compile("^[+]54+(\\d{10})");
        Matcher match=patron.matcher(cadena);
        if (match.matches())
        {
            respuesta= true;
        }

        return respuesta;
    }
    public boolean mail(String cadena)
    {
        boolean respuesta=false ;
        Pattern patron=Pattern.compile("^[\\w-]+(\\.[\\w]+)*@[\\w]+(\\.[\\w]+)*(\\.[\\w]{2,})");
        Matcher match= patron.matcher(cadena);
        if (match.matches())
        {
            respuesta=true;
        }
        return respuesta;
    }
    public boolean fecha(String cadena)
    {
        boolean respuesta=false;
        Pattern patron=Pattern.compile("^[0-3][\\d]+[/]+[0-1][\\d]+[/]+(\\d{4})");
        Matcher match=patron.matcher(cadena);
        if (match.matches())
        {
            respuesta=true;
        }
        return respuesta;
    }
}
