//Pablo Morales Puertas NRE:1744623
//Realiza un programa que le pida al usuario una cadena y haga y muestro por pantalla las siguientes operaciones:
//Reemplazar todas las A minúsculas por A mayúsculas, excepto si van precedidas de un espacio.



import java.util.*;


public class Ej7 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        
        String frase = sc.nextLine();

        //Reemplazar todas las A minúsculas por A mayúsculas, excepto si van precedidas de un espacio.

        String mayusculas = frase.replace (%"a" , "A");

        System.out.println(mayusculas);


    }

   
}
