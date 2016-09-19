package bdrestaurant;

import java.sql.*;
/**
 * Created by GastónAlejandro on 19/09/2016.
 */
public class BaseDatos
{

    public  static void Inicializar(String comando)
    {
        try {
            Class.forName("org.h2.Driver");
            Connection conexion = DriverManager.getConnection(ConnStr,"sa","");
            Statement sentencia = conexion.createStatement();
            sentencia.execute(comando);
          /**  System.out.println("Se creo la tabla correctamente");*/
            sentencia.close();
        } catch (ClassNotFoundException e) {
            /**e.printStackTrace();*/
        } catch (SQLException e) {
            /**e.printStackTrace();*/
        }
    }
    private static String ConnStr="jdbc:h2:C:/Users/GastónAlejandro/Desktop/Restaurant/restaurantDB";
    public static ResultSet Consulta (String Comando)
    {
        ResultSet retorno=null;
        try {
            Class.forName("org.h2.Driver");
                Connection conexion = DriverManager.getConnection(ConnStr,"sa","");
                Statement sentencia = conexion.createStatement();
            retorno=  sentencia.executeQuery(Comando);
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
                  }
        catch (ClassNotFoundException ex){
            System.out.print(ex.getMessage());
        }
        catch (SQLException ex){
            System.out.print(ex.getMessage());
        }

    }
        public  static int ObtenerUltimoID(String tabla)
        {
            try {
                Class.forName("org.h2.Driver");
                Connection conexion=DriverManager.getConnection(ConnStr,"sa","");
                Statement sentencia=conexion.createStatement();
                ResultSet resultado=sentencia.executeQuery("SELECT MAX(ID) FROM "+tabla);
                resultado.next();
                return resultado.getInt(1);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return 0;
            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
                return 0;
            }

        }
    public static void BorrarTodo(String Tabla)
    {
        try {
            Class.forName("org.h2.Driver");
            Connection conexion = DriverManager.getConnection(ConnStr,"sa","");
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate("DROP TABLE " + Tabla);
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static int ultimoID (String Tabla)
    {
     return 0;
    }

}
