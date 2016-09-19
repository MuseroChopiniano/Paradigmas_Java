package bdrestaurant;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class IngredienteDAO
{
    public static  void main (String[] args)
    {
        BaseDatos.Inicializar();
        altaIngrediente("Papa","Verdura");
    }
    public static void altaIngrediente(String nombre, String tipo)
    {
        int id= 0;
        try {
            id = BaseDatos.Consulta("SELECT COUNT(*) FROM INGREDIENTES").getInt(0);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (NullPointerException ex){
            id=1;
        }
        BaseDatos.Actualizar("INSERT INTO INGREDIENTES "
                + "VALUES (" + id + ", '" + nombre + "', '" + tipo + "');");


    }
    public static void borrarIngrediente(String nombre)
    {

    }
    public static void modificarIngrediente(String nombreViejo, String nombreNuevo,String tipoNuevo)
    {

    }
    public static List<String> devolverIngredientes()
    {
        List<String> Lista = null;
        return  Lista;
    }
    public static List<String> devolverLasVerduras()
    {
        List<String> Lista= null;
        return  Lista;
    }
}
