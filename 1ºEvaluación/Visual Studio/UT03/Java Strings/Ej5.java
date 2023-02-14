//Pablo Morales Puertas NRE:1844623
//Realiza un programa que muestre por pantalla cuantas vocales de cada tipo hay.
//(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre mayúsculas y minúsculas.

import java.util.*;

public class Ej5 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");

        String frase = sc.nextLine();

        int a , e , i , o , u;

        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        for (int cont = 0; cont < frase.length(); cont++) {
            // check if char[i] is vowel
            if (frase.charAt(cont) == 'a' || frase.charAt(cont) == 'A' ){
                a ++;
            }
            if (frase.charAt(cont) == 'e' || frase.charAt(cont) == 'E'){
                e ++;
            }
            if (frase.charAt(cont) == 'i' || frase.charAt(cont) == 'I'){
                i ++;
            }
            if (frase.charAt(cont) == 'o' || frase.charAt(cont) == 'O'){
                o ++;
            }
            if (frase.charAt(cont) == 'u' || frase.charAt(cont) == 'U'){
                u ++;
            }
        }

        System.out.println("Tiene un total de: ");
        System.out.println("a:" + a);
        System.out.println("e:" + e);
        System.out.println("i:" + i);
        System.out.println("o:" + o);
        System.out.println("u:" + u);
    }
}
