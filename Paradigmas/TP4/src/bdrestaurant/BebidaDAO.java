package bdrestaurant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 19/9/2016.
 */

public class BebidaDAO {

    public static void Inicializar()
    {
        BaseDatos.Inicializar("CREATE TABLE BEBIDA(Bebida_Id INT,Bebida_Nombre VARCHAR(255),Bebida_Tamaño INT, Bebida_Precio DOUBLE);");
    }

    public static void altaBebida(String nombre, int tamano, double precio) throws SQLException {

        int id= 0;
        try {
            id = BaseDatos.ObtenerUltimoID("BEBIDA");
        }
        catch (NullPointerException ex){
        }
        finally {
            id+=1;
        }

        String insert = "INSERT INTO BEBIDA VALUES (" + id + ", '" + nombre + "', "+ tamano + ", " + precio + ");";
        BaseDatos.Actualizar(insert);
    }

    public static void borrarBebida(String nombre){
        String delete = "DELETE FROM BEBIDA WHERE Bebida_Nombre = '" + nombre + "';";
        BaseDatos.Actualizar(delete);
    }

    public static void modificarBebida(String nombreViejo, String nombreNuevo, int tamanoNuevo, double precioNuevo){
        String modificar = "UPDATE BEBIDA SET Bebida_Nombre = '" + nombreNuevo + "', Bebida_Tamaño = " + tamanoNuevo +
                           ", Bebida_Precio = " + precioNuevo + "WHERE Bebida_Nombre LIKE '" + nombreViejo + "';";
        BaseDatos.Actualizar(modificar);
    }

    public static List<String>  devolverBebidas() throws SQLException {
        List<String> listaBebidas = new ArrayList<String>();
        String select="SELECT Bebida_Nombre FROM BEBIDA;";

        ResultSet resultSet = BaseDatos.Consulta(select);

        while (resultSet.next()){
            listaBebidas.add(resultSet.getString(0));
        }

        return listaBebidas;
    }

    public static int contar(){
        int contador=0;
        try {
            ResultSet resultSet = BaseDatos.Consulta("SELECT COUNT(Bebida_Nombre FROM BEBIDA;");
            resultSet.next();
            contador = resultSet.getInt(0);
            resultSet.close();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return contador;
    }
}
