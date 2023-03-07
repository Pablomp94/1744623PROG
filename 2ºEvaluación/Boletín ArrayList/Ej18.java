//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para probar si un ArrayList está vacío o no.//

import java.util.*;

public class Ej18 {
    public static void main(String[] args) {
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        int cont = 0;
        String prueba;

        for(int i = 0; i < list.size(); i++){
            
            prueba = list.get(i);
            if(prueba != null){
                cont ++;
            }
        }
        if(cont == 0){
            System.out.println("El arraylist está vacio");
        }else{
            System.out.println("El arraylist no esta vacio, tiene un valor o mas");
        }

    }
}
