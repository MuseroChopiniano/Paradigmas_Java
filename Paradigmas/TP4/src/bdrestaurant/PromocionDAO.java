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
        BaseDatos.inicializar("CREATE TABLE PROMOCION(Promocion_Id INT,Promocion_Nombre VARCHAR(255),Bebida_Id INT,Promocion_Precio DOUBLE);");
        BaseDatos.inicializar("CREATE TABLE PROMOCIONPLATO(PromocionPlato_Id INT, Promocion_Id INT,Plato_Id INT);");
    }
    public static void altaPromocion(String nombre, String bebida, List<String> platos, double precio) throws SQLException {
        int idPromo= 0;
        int idPromoPlato=0;
        try {
            idPromo = BaseDatos.obtenerUltimoID("Promocion");                 /**LLama a obtenerUltimoID para poder manejar el Autoincremento de ID desde aca*/
                 }
        catch (NullPointerException ex){
        }
        finally {
            idPromo=idPromo+1;
        }

        BaseDatos.actualizar("INSERT INTO PROMOCION VALUES (" + idPromo + ", '" + nombre + "', " + obtenerIdBebida(bebida) + ", " + precio + ");");
        insertarPromocionPlato(idPromo,platos);
    }

    public static int obtenerIdBebida(String bebida) throws SQLException {
        ResultSet rs= BaseDatos.consulta("SELECT Bebida_Id FROM BEBIDA WHERE Bebida_Nombre LIKE '" + bebida + "';");
        rs.next();
        return rs.getInt("Bebida_Id");
    }
    public static void insertarPromocionPlato(int idPromocion, List<String> platos) throws SQLException {
        int idTablaIntermedia=0;
        try {
            idTablaIntermedia=BaseDatos.obtenerUltimoID("PromocionPlato");
        }
        catch ( NullPointerException ex){}
        finally {
            idTablaIntermedia+=1;
        }
        int idPlato=0;
        for (int i=0;i<platos.size();i++)
        {
            ResultSet rs =BaseDatos.consulta("SELECT Plato_Id FROM PLATO WHERE Plato_Nombre LIKE '" + platos.get(i) + "';");
            rs.next();
            idPlato=rs.getInt("Plato_Id");
            BaseDatos.actualizar("INSERT INTO PROMOCIONPLATO VALUES (" + idTablaIntermedia + ", " + idPromocion + ", " + idPlato + ");");
            idTablaIntermedia+=1;
        }
    }

    public static void modificarPromocion(String nombreViejo, String nombreNuevo, String bebidanueva, List<String> platosNuevos, double precioNuevo) throws SQLException {
        BaseDatos.actualizar("UPDATE PROMOCION SET Promocion_Nombre='" + nombreNuevo + "', Bebida_Id=" + obtenerIdBebida(bebidanueva) + ", Promocion_Precio = " + precioNuevo + "  WHERE Promocion_Nombre LIKE '" + nombreViejo + "';");
        ResultSet rs = BaseDatos.consulta(("SELECT Promocion_Id FROM PROMOCION WHERE Promocion_Nombre LIKE '" + nombreNuevo + "';"));
        rs.next();
        int idPromocion=rs.getInt("Promocion_Id");
        borrarPromocionPlato(idPromocion);
        insertarPromocionPlato(idPromocion,platosNuevos);
    }
    public static void borrarPromocionPlato(int Id)
    {
        BaseDatos.actualizar("DELETE FROM PROMOCIONPLATO WHERE Promocion_Id =" + Id +";");
    }
    public static List<String> devolverPromociones()
    {
        List<String> Lista = new ArrayList<String>();
        ResultSet resultado= BaseDatos.consulta("SELECT Promocion_Nombre FROM Promocion");
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
        BaseDatos.borrarTodo("PROMOCION");
        BaseDatos.borrarTodo("PROMOCIONPLATO");
    }
    public static void BorrarPromocion(String nombre) throws SQLException {
        ResultSet rs = BaseDatos.consulta(("SELECT Promocion_Id FROM PROMOCION WHERE Promocion_Nombre LIKE '" + nombre + "';"));
        rs.next();
        int idPromocion=rs.getInt("Promocion_Id");
        BaseDatos.actualizar("DELETE FROM PROMOCION WHERE Promocion_Id =" + idPromocion + ";");
        BaseDatos.actualizar("DELETE FROM PROMOCIONPLATO WHERE Promocion_Id =" + idPromocion + ";" );

    }

}
