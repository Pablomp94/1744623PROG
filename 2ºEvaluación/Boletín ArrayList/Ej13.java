//Pablo Morales Puertas NRE:1744623//
//Escribe un programa Java para comparar dos ArrayList.//

import java.util.*;

public class Ej13 {
    public static void main(String[] args) {

        ArrayList<String> list1 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        ArrayList<String> list2 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        
        //Con este comando comparamos automaticamente los dos arraylists, devolviendo un buleano si estrue son iguales, false si no lo son//
        
        boolean prueba = list1.equals(list2);

        if(prueba == true){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        

    }
}
