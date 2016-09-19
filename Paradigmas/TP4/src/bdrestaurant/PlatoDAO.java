package bdrestaurant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 19/9/2016.
 */
public class PlatoDAO {

    public static void Inicializar()
    {
        BaseDatos.Inicializar("CREATE TABLE PLATO(Plato_Id INT,Plato_Nombre VARCHAR(255), Plato_Precio DOUBLE);");
    }

    public static void altaPlato(String nombre, List<String> ingredientes, double precio) throws SQLException {
        int id= 0;
        try {
            id = BaseDatos.ObtenerUltimoID("PLATO");
        }
        catch (NullPointerException ex){
        }
        finally {
            id+=1;
        }

        int idIngrediente;

        String insert = "INSERT INTO PLATO VALUES (" + id + ", '" + nombre + "', " + precio + ");";
        BaseDatos.Actualizar(insert);
    }

    public static void borrarPlato(String nombre){
        String delete = "DELETE FROM PLATO WHERE Plato_Nombre = '" + nombre + "';";
        BaseDatos.Actualizar(delete);
    }

    public static void modificarPlato(String nombreViejo, String nombreNuevo, List<String> ingredientesNuevos, double precioNuevo){
        String modificar = "UPDATE PLATO SET Plato_Nombre = '" + nombreNuevo + "', Plato_Precio = " + precioNuevo + " WHERE Plato_Nombre LIKE '" + nombreViejo + "';";
        BaseDatos.Actualizar(modificar);
    }

    public static List<String> devolverPlatos() throws SQLException {
        List<String> listaPlatos = new ArrayList<String>();
        String select="SELECT Plato_Nombre FROM PLATO;";

        ResultSet resultSet = BaseDatos.Consulta(select);

        while (resultSet.next()){
            listaPlatos.add(resultSet.getString("Plato_Nombre"));
        }
        return listaPlatos;
    }

    public static int contar(){
        int contador=0;
        try {
            ResultSet resultSet = BaseDatos.Consulta("SELECT COUNT(*) FROM PLATO;");
            resultSet.next();
            contador = resultSet.getInt(1);
            resultSet.close();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return contador;
    }
}
