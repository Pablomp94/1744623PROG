//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para buscar un elemento en una ArrayList.//

import java.util.*;

public class Ej7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        System.out.println("Escribe la palabra a buscar");

        String palabra = sc.next();

        boolean contiene = list.contains(palabra);

        if(contiene = true){
            System.out.println("La palabra se encuentra en el arraylist");
        }else{
            System.out.println("La palabra no se encuentra en el arraylist");
        }


    }
}
