package ejercicio6;

/**
 * Created by GastónAlejandro and Facundo Tripelhorn on 05/11/2016.
 */
public enum tipoLocalidad {
    adelante(5),
    medio(15),
    atras(30);
    int precio;
    public int getMonto(){
        return precio;
    }
    public int precioEnDolares(){
        return precio*15;
    }
    public int precioEnEuros(){
        return precio*18;
    }
    tipoLocalidad(int pPrecio){
        precio=pPrecio;
    }

}
