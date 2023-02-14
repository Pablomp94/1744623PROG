//Pablo Morales Puertas NRE: 1744623
//Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). 
//Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). 
//Un palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.

import java.util.*;


public class Ej6 {
  
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase:");

        String frase = sc.nextLine();

        String minusculafrase = frase.toLowerCase();

        String finalfrase = minusculafrase.replace(" " , "");

        

        StringBuilder reverso = new StringBuilder();

        for (int i = (minusculafrase.length() - 1); i >= 0; i--){
			reverso.append(minusculafrase.charAt(i));

		}
        System.out.println("-------------------------------------------------");
            
        String reversofinal = reverso.toString();

        reversofinal = reversofinal.replace(" ", "");

        System.out.println(finalfrase);
        System.out.println(reversofinal);
        System.out.println("-------------------------------------------------");
        

        if(finalfrase == reversofinal){
            System.out.println("La frase es palindroma");
        }else{
            System.out.println("La frase no es palindroma");
        }


    }
}
