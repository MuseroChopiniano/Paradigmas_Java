package ejercicio1;

/**
 * Created by Facu on 22/10/2016.
 */
public class NumeroComplejo {
    String valor;
    int parteReal;
    String parteImaginaria;
    int numeroImaginario;

    public NumeroComplejo(String valor) {
        this.valor = valor;
        setPartes();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setPartes() {
        String[] partes = valor.split("\\s");
        this.parteReal= Integer.parseInt(partes[0]);
        this.parteImaginaria= partes[1]+partes[2];
        String[] imaginario = parteImaginaria.split("i");
        this.numeroImaginario = Integer.parseInt(imaginario[0]);
    }

    public int getParteReal() {
        return parteReal;
    }

    public String getParteImaginaria() {
        return parteImaginaria;
    }

    public String suma(NumeroComplejo numero){
        String respuesta;
        int sumaReal;
        int sumaImaginaria;

        sumaReal= this.parteReal+numero.parteReal;
        sumaImaginaria=this.numeroImaginario+numero.numeroImaginario;

        if (sumaImaginaria>=0) {
            respuesta = sumaReal + " + " + sumaImaginaria + "i";
        }else  {
            respuesta = sumaReal + " - " + sumaImaginaria*-1 + "i";
        }
       return  respuesta;
    }

    public String resta(NumeroComplejo numero){
        String respuesta;
        int restaReal;
        int restaImaginaria;

        restaReal =  this.parteReal - numero.parteReal;
        restaImaginaria = this.numeroImaginario - numero.numeroImaginario;

        if (restaImaginaria>=0){
            respuesta = restaReal + " + " + restaImaginaria + "i";
        } else{
            respuesta = restaReal + " - " + restaImaginaria*-1 + "i";
        }
        return respuesta;
    }
}
