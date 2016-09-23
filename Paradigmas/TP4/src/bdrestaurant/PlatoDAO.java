package bdrestaurant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 19/9/2016.
 */
public class PlatoDAO {

    public static void inicializar()
    {
        BaseDatos.inicializar("CREATE TABLE PLATO(Plato_Id INT,Plato_Nombre VARCHAR(255), Plato_Precio DOUBLE);");
        BaseDatos.inicializar("CREATE TABLE PLATOINGREDIENTE(PlatoIngrediente_Id INT, Plato_Id INT, Ingrediente_Id INT);");
    }

    public static void altaPlato(String nombre, List<String> ingredientes, double precio) throws SQLException {
        int id= 0;
        try {
            id = BaseDatos.obtenerUltimoID("Plato");
        }
        catch (NullPointerException ex){
        }
        finally {
            id+=1;
        }
         String insert = "INSERT INTO PLATO VALUES (" + id + ", '" + nombre + "', " + precio + ");";
        BaseDatos.actualizar(insert);
     insertarPlatoIngrediente(id,ingredientes);

    }
    public static void insertarPlatoIngrediente(int idPlato, List<String> ingredientes) throws SQLException {
        int idTablaIntermedia=0;
        try {
            idTablaIntermedia=BaseDatos.obtenerUltimoID("PlatoIngrediente");
        }
        catch ( NullPointerException ex){}
        finally {
            idTablaIntermedia+=1;
        }
        int idIngrediente=0;
        for (int i=0;i<ingredientes.size();i++)
        {
            ResultSet rs =BaseDatos.consulta("SELECT Ingrediente_Id FROM INGREDIENTE WHERE Ingrediente_Nombre LIKE '" + ingredientes.get(i) + "';");
            rs.next();
            idIngrediente=rs.getInt("Ingrediente_Id");
            BaseDatos.actualizar("INSERT INTO PLATOINGREDIENTE VALUES (" + idTablaIntermedia + ", " + idPlato + ", " + idIngrediente + ");");
            idTablaIntermedia+=1;
        }
    }
    public static void borrarPlatoIngrediente(int Id)
    {
        BaseDatos.actualizar("DELETE FROM PLATOINGREDIENTE WHERE Plato_Id =" + Id +";");
    }


    public static void borrarPlato(String nombre) throws SQLException {
        ResultSet rs =BaseDatos.consulta("SELECT Plato_Id FROM PLATO WHERE Plato_Nombre LIKE '" + nombre + "';");
        rs.next();
        int idPlato=rs.getInt("Plato_Id");
        String delete = "DELETE FROM PLATO WHERE Plato_Id =" + idPlato + ";";
        BaseDatos.actualizar(delete);
        BaseDatos.actualizar("DELETE FROM PLATOINGREDIENTE WHERE Plato_Id =" + idPlato +";");

    }

    public static void modificarPlato(String nombreViejo, String nombreNuevo, List<String> ingredientesNuevos, double precioNuevo) throws SQLException {
        String modificar = "UPDATE PLATO SET Plato_Nombre = '" + nombreNuevo + "', Plato_Precio = " + precioNuevo + " WHERE Plato_Nombre LIKE '" + nombreViejo + "';";
        BaseDatos.actualizar(modificar);
        ResultSet rs =BaseDatos.consulta("SELECT Plato_Id FROM PLATO WHERE Plato_Nombre LIKE '" + nombreNuevo + "';");
        rs.next();
        int idPlato=rs.getInt("Plato_Id");
        borrarPlatoIngrediente(idPlato);
        insertarPlatoIngrediente(idPlato,ingredientesNuevos);
    }

    public static List<String> devolverPlatos() throws SQLException {
        List<String> listaPlatos = new ArrayList<String>();
        String select="SELECT Plato_Nombre FROM PLATO;";

        ResultSet resultSet = BaseDatos.consulta(select);

        while (resultSet.next()){
            listaPlatos.add(resultSet.getString("Plato_Nombre"));
        }
        return listaPlatos;
    }

    public static int contar(){
        int contador=0;
        try {
            ResultSet resultSet = BaseDatos.consulta("SELECT COUNT(*) FROM PLATO;");
            resultSet.next();
            contador = resultSet.getInt(1);
            resultSet.close();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return contador;
    }
}
