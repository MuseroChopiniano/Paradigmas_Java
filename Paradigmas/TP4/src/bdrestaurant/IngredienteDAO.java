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

    public static void main(String[] args)
    {
        Inicializar();
        altaIngrediente("Papa","Verdura");
        altaIngrediente("CarneParaMilanesa","Carne");
        altaIngrediente("PanRallado","Otros");
        altaIngrediente("Huevo","Otros");
        altaIngrediente("Lechuga","Verdura");
        devolverLasVerduras();

    }
       /**funcion para inicializar para inicializar la tabla en la base de datos*/
        public static void Inicializar()
    {
        BaseDatos.Inicializar("CREATE TABLE INGREDIENTES(ID INT,NOMBRE VARCHAR(255),TIPO VARCHAR(250));");
    }

    /**funcion que agrega ingredientes en la tabla de la BD*/
    public static void altaIngrediente(String nombre, String tipo)
    {
        int id= 0;
        try {
            id = BaseDatos.ObtenerUltimoID("INGREDIENTES");                 /**LLama a ObtenerUltimoID para poder manejar el Autoincremento de ID desde aca*/
        }
        catch (NullPointerException ex){
        }
        finally {
            id+=1;
        }
        BaseDatos.Actualizar("INSERT INTO INGREDIENTES "
                + "VALUES (" + id + ", '" + nombre + "', '" + tipo + "');");
    }

    /**funcion para borrar un ingrediente especifico pasado como String por parametro*/
    public static void borrarIngrediente(String nombre)
    {
        BaseDatos.Actualizar("DELETE FROM INGREDIENTES WHERE NOMBRE LIKE '"+nombre+"';");
    }
    /**funcion que modifica un ingrediente especifico*/
    public static void modificarIngrediente(String nombreViejo, String nombreNuevo,String tipoNuevo)
    {
        BaseDatos.Actualizar("UPDATE INGREDIENTES SET NOMBRE='"+nombreNuevo+"', TIPO='"+tipoNuevo+"' WHERE NOMBRE LIKE '"+nombreViejo+"';");
    }
    /**devuelve una lista de todos los ingredientes de la tabla*/
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
    /**devuelve una lista de todos los ingrediente que tienen el tipo:VERDURA*/
    public static List<String> devolverLasVerduras()
    {
        List<String> Lista= new ArrayList<String>();
        ResultSet resultado=BaseDatos.Consulta("SELECT NOMBRE FROM INGREDIENTES WHERE TIPO LIKE 'Verdura'");
                try{
            while(resultado.next()){
                Lista.add(resultado.getString("NOMBRE"));
            }
                }catch (SQLException EX){
                    EX.printStackTrace();
                }
        return  Lista;
    }
    public static void BorrarTodo()
    {
        BaseDatos.BorrarTodo("INGREDIENTES");
    }

}
