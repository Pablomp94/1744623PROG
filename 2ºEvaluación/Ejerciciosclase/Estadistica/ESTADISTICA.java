import java.util.*;

public class ESTADISTICA {

    int numeromayor, numeromenor, suma;

    double media, i;



    private List<Integer> listaNumeros;

    public ESTADISTICA() {

        listaNumeros = List.of(1, 2, 3, 4, 5, 4, 2, 8, 3, 4);

    }

    public int mayor() {
        
        for(Integer numero: listaNumeros){

            if(numero > numeromayor){
                numeromayor = numero; 
            }
        }
        return numeromayor;
    }

    public int menor() {

        numeromenor = 999999999;
        
        for(Integer numero: listaNumeros){
            
            if(numero < numeromenor){
                numeromenor = numero;
            }        
        } 
        return numeromenor;
    }

    public double media() {

        i = 0;
        
        for(Integer numero: listaNumeros){

            i = numero + i;
        }
        
        media = i / listaNumeros.size();
        
        return media;
    }

}
