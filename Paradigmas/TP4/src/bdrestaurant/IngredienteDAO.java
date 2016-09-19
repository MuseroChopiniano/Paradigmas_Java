package bdrestaurant;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase IngredienteDAO para hacer las operaciones CRUD de los ingredientes en la Base de Datos
 */
public class IngredienteDAO
{
    public static  void main (String[] args)
    {
        Inicializar();
        altaIngrediente("Papa","Verdura");
        altaIngrediente("Batata","Verdura");
        borrarIngrediente("Papa");
        altaIngrediente("Pera","Fruta");
        modificarIngrediente("Pera","Oreos","Galletitas");
        System.out.println(devolverIngredientes());
    }
    public static void Inicializar()
    {
        BaseDatos.Inicializar("CREATE TABLE INGREDIENTES(ID INT,NOMBRE VARCHAR(255),TIPO VARCHAR(250));");
    }
    public static void altaIngrediente(String nombre, String tipo)
    {
        int id= 0;
        try {
            id = BaseDatos.ObtenerUltimoID("INGREDIENTES");
        }
        catch (NullPointerException ex){
        }
        finally {
            id+=1;
        }
        BaseDatos.Actualizar("INSERT INTO INGREDIENTES "
                + "VALUES (" + id + ", '" + nombre + "', '" + tipo + "');");
    }
    public static void borrarIngrediente(String nombre)
    {
        BaseDatos.Actualizar("DELETE FROM INGREDIENTES WHERE NOMBRE LIKE '"+nombre+"';");
    }
    public static void modificarIngrediente(String nombreViejo, String nombreNuevo,String tipoNuevo)
    {
        BaseDatos.Actualizar("UPDATE INGREDIENTES SET NOMBRE='"+nombreNuevo+"', TIPO='"+tipoNuevo+"' WHERE NOMBRE LIKE '"+nombreViejo+"';");
    }
    public static List<String> devolverIngredientes()
    {
        List<String> Lista = new ArrayList<String>();
        ResultSet resultado= BaseDatos.Consulta("SELECT NOMBRE FROM INGREDIENTES");
        try {
           while(resultado.next()){
            Lista.add(resultado.getString("NOMBRE"));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  Lista;
    }
    public static List<String> devolverLasVerduras()
    {
        List<String> Lista= null;
        return  Lista;
    }
}
