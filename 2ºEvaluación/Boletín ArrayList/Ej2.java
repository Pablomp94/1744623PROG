//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para iterar a través de todos los elementos en una ArrayList.//

import java.util.*;

public class Ej2 {
    public static void main(String[] args) {
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
    }
}
