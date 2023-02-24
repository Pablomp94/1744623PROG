import java.util.ArrayList;

//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para eliminar el tercer elemento de una ArrayList.//

import java.util.*;

public class Ej6 {
    public static void main(String[] args) {
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        System.out.println(list);

        System.out.println("Eliminamos el tercer elemento del arraylist con un remove poniendo la tercera posición (2)");

        list.remove(2);

        System.out.println(list);
    }
}
