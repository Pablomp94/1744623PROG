//Pablo Morales Puertas NRE:1744623//
//Escribe un programa Java para vaciar un ArrayList.//

import java.util.*;

public class Ej17 {
    public static void main(String[] args) {
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        System.out.println(list);

        int limit = list.size();

        //Bucle que se realiza en numero de veces igual a la longitud del array, por cada ves que se realiza elimina la primera posición del array//

        for(int i = 0; i < limit; i++){
            list.remove(0);
        }

        System.out.println(list);
    }
}
