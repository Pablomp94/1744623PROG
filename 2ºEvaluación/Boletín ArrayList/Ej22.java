//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para imprimir todos los elementos de un ArrayList usando la posición de los elementos.//

import java.util.*;

public class Ej22 {
    public static void main(String[] args) {
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        for(int i = 0; i < list.size(); i ++){

            System.out.println(list.get(i));
        }

    }
}
