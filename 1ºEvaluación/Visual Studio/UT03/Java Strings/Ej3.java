//Pablo Morales Puertas NRE: 1744623//
//Realiza un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.//

import java.util.*;

public class Ej3 {
 
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera frase");

        String primera = sc.nextLine();

        System.out.println("Introduce la segunda frase");

        String segunda = sc.nextLine();

        String primeracomp = primera.toUpperCase();
        String segundacomp = segunda.toUpperCase();

        boolean comparacion = primeracomp.equals(segundacomp);

        if(comparacion == true){
            System.out.println("Las frases coinciden, por lo que son iguales");
        }else{
            System.out.println("No son iguales");
        }


    }
}
