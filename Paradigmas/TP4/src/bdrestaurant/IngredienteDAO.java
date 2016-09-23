package bdrestaurant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase IngredienteDAO para hacer las operaciones CRUD de los ingredientes en la Base de Datos
 */
public class IngredienteDAO
{

           /**funcion para inicializar para inicializar la tabla en la base de datos*/
        public static void inicializar()
    {
        BaseDatos.inicializar("CREATE TABLE INGREDIENTE(Ingrediente_Id INT,Ingrediente_Nombre VARCHAR(255),Ingrediente_Tipo VARCHAR(250));");
    }

    /**funcion que agrega ingredientes en la tabla de la BD*/
    public static void altaIngrediente(String nombre, String tipo)
    {
        int id= 0;
        try {
            id = BaseDatos.obtenerUltimoID("Ingrediente");                 /**LLama a obtenerUltimoID para poder manejar el Autoincremento de ID desde aca*/
        }
        catch (NullPointerException ex){
        }
        finally {
            id+=1;
        }
        BaseDatos.actualizar("INSERT INTO INGREDIENTE "
                + "VALUES (" + id + ", '" + nombre + "', '" + tipo + "');");
    }

    /**funcion para borrar un ingrediente especifico pasado como String por parametro*/
    public static void borrarIngrediente(String nombre)
    {
        BaseDatos.actualizar("DELETE FROM INGREDIENTE WHERE Ingrediente_Nombre LIKE '"+nombre+"';");
    }
    /**funcion que modifica un ingrediente especifico*/
    public static void modificarIngrediente(String nombreViejo, String nombreNuevo,String tipoNuevo)
    {
        BaseDatos.actualizar("UPDATE INGREDIENTE SET Ingrediente_Nombre='"+nombreNuevo+"', Ingrediente_Tipo='"+tipoNuevo+"' WHERE Ingrediente_Nombre LIKE '"+nombreViejo+"';");
    }
    /**devuelve una lista de todos los ingredientes de la tabla*/
    public static List<String> devolverIngredientes()
    {
        List<String> Lista = new ArrayList<String>();
        ResultSet resultado= BaseDatos.consulta("SELECT Ingrediente_Nombre FROM INGREDIENTE");
        try {
           while(resultado.next()){
            Lista.add(resultado.getString("Ingrediente_Nombre"));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  Lista;
    }
    /**devuelve una lista de todos los ingrediente que tienen el tipo:Verdura*/
    public static List<String> devolverLasVerduras()
    {
        List<String> Lista= new ArrayList<String>();
        ResultSet resultado=BaseDatos.consulta("SELECT Ingrediente_Nombre FROM INGREDIENTE WHERE Ingrediente_Tipo LIKE 'Verdura'");
                try{
            while(resultado.next()){
                Lista.add(resultado.getString("Ingrediente_Nombre"));
            }
                }catch (SQLException EX){
                    EX.printStackTrace();
                }
        return  Lista;
    }
    public static void borrarTodo()
    {
        BaseDatos.borrarTodo("INGREDIENTE");
    }

}
