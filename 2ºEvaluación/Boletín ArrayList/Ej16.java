//Pablo Morales Puertas NRE:1744623//
//Escribe un programa Java para clonar un ArrayList en otro ArrayList.//

import java.util.*;

public class Ej16 {
    public static void main(String[] args) {
     
        ArrayList<String> list1 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        ArrayList<String> list2 = new ArrayList<> ();

        //Con el metodo .clone() se clona el arraylist//

        list2 = (ArrayList) list1.clone();

        System.out.println(list2);

    }
}
