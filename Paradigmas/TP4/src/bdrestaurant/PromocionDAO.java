package bdrestaurant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase PromocionDAO para hacer las operaciones CRUD de las Promociones en la Base de Datos
 */
public class PromocionDAO
{
    /** Se crean las tablas de Promocion, y PromocionPlato que es la relacion de muchos a muchos entre Promocion y plato*/
    public static void Inicializar()
    {
        BaseDatos.Inicializar("CREATE TABLE PROMOCION(Promocion_Id INT,Promocion_Nombre VARCHAR(255),Promocion_Bebida VARCHAR(255),Promocion_Precio DOUBLE);");
        BaseDatos.Inicializar("CREATE TABLE PROMOCIONPLATO(PromocionPlato_Id INT, Promocion_Nombre VARCHAR(255),Plato_Nombre VARCHAR(255));");
    }
    public static void altaPromocion(String nombre, String bebida, List<String> platos, int precio)
    {
        int idPromo= 0;
        int idPromoPlato=0;
        try {
            idPromo = BaseDatos.ObtenerUltimoID("PROMOCION");                 /**LLama a ObtenerUltimoID para poder manejar el Autoincremento de ID desde aca*/
            idPromoPlato=BaseDatos.ObtenerUltimoID("PROMOCIONPLATO");
        }
        catch (NullPointerException ex){
        }
        finally {
            idPromo+=1;
            idPromoPlato+=1;
        }

        BaseDatos.Actualizar("INSERT INTO PROMOCION VALUES (" + idPromo + ", '" + nombre + "', '" + bebida + "');");
        for (int i=0;i<platos.size();i++) {
            BaseDatos.Actualizar("INSERT INTO PROMOCIONPLATO VALUES (" + idPromoPlato + "," + nombre + ",'" + platos.get(i) + "';");
            idPromoPlato+=1;
        }
    }

    /** FUNCION SIN COMPLETAR*/

    public static void modificarPromocion(String nombreViejo, String nombreNuevo, String bebidanueva, List<String> platosNuevos) {
        BaseDatos.Actualizar("DELETE FROM PROMOCIONPLATO WHERE Promocion_Nombre LIKE '" + nombreViejo + "';");

        for (int i = 0; i < platosNuevos.size(); i++) {
            BaseDatos.Actualizar("INSERT INTO PROMOCIONPLATO ");

        }
        BaseDatos.Actualizar("UPDATE PROMOCION SET Promocion_Nombre='" + nombreNuevo + "', Promocion_Bebida='" + bebidanueva + "' WHERE Promocion_Nombre LIKE '" + nombreViejo + "';");
    }
    public static List<String> devolverPromociones()
    {
        List<String> Lista = new ArrayList<String>();
        ResultSet resultado= BaseDatos.Consulta("SELECT Promocion_Nombre FROM Promocion");
        try {
            while(resultado.next()){
                Lista.add(resultado.getString("Promocion_Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  Lista;
    }
    public static void BorrarTodo()
    {
        BaseDatos.BorrarTodo("PROMOCION");
        BaseDatos.BorrarTodo("PROMOCIONPLATO");
    }
}
