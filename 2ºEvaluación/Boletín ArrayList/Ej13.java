//Pablo Morales Puertas NRE:1744623//
//Escribe un programa Java para comparar dos ArrayList.//

import java.util.*;

public class Ej13 {
    public static void main(String[] args) {

        ArrayList<String> list1 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        ArrayList<String> list2 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        
        Collection.compare(list1 , list2);
    }
}
