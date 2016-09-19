package bdrestaurant;

import java.sql.*;
/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class BaseDatos
{
    private static String ConnStr="jdbc:h2:C:/restaurant";
    public static ResultSet Consulta (String Comando)
    {
        ResultSet retorno=null;
        try {
            Class.forName("org.h2.Driver");
                Connection conexion = DriverManager.getConnection(ConnStr,"sa","");
                Statement sentencia = conexion.createStatement();
            retorno=  sentencia.executeQuery(Comando);
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  retorno;
    }

    public static void Actualizar (String comando)
    {
        try
        {
            Class.forName("org.h2.Driver");
            Connection conexion = DriverManager.getConnection(ConnStr,"sa","");
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(comando);
            sentencia.close();
            conexion.close();
        }
        catch (ClassNotFoundException ex){}
        catch (SQLException ex){}

    }
    public static void BorrarTodo(String Tabla)
    {
        try {
            Class.forName("org.h2.Driver");
            Connection conexion = DriverManager.getConnection(ConnStr,"sa","");
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate("DELETE * FROM " + Tabla);
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
