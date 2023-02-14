//Pablo Morales Puertas NRE:1744623
//Realiza un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. 
//Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres primeras letras de cada uno de ellos.

import java.util.*;

public class Ej4 {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escribe el nombre");

            String nombre = sc.nextLine();

            String subnombre = nombre.substring(0,3);

            System.out.println("Escribe el primer apellido");

            String primerapellido = sc.nextLine();

            String subprimerapellido = primerapellido.substring(0,3);

            System.out.println("Escribe el segundo apellido");

            String segundoapellido = sc.nextLine();

            String subsegundoapellido = segundoapellido.substring(0,3);

            System.out.println("Nombre modificado: ");

            String completo = (subnombre + subprimerapellido + subsegundoapellido);

            completo = completo.toUpperCase();
            
            System.out.println(completo);
        }

    }
}
