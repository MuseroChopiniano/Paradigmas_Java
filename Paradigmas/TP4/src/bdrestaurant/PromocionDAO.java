package bdrestaurant;

/**
 * Clase PromocionDAO para hacer las operaciones CRUD de las Promociones en la Base de Datos
 */
public class PromocionDAO
{
    public static void Inicializar()
    {
        BaseDatos.Inicializar("CREATE TABLE PROMOCION(Promocion_Id INT,Promocion_Nombre VARCHAR(255),Bebida_Id INT;");
        BaseDatos.Inicializar("CREATE TABLE PROMOCIONPLATO(PromocionPlato_Id INT, Promocion_Id INT,Plato_Id INT");
    }
    public static void altaPromocion(){}
}
