//Pablo Morales Puertas//
//REalizar multiplicacion con excepciones//

import java.util.*;

public class Multiplicacionexcepciones {

    static int numero;

    static int num;
    static int mult;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Introduce el primer numero a multiplicar");

            numero = sc.nextInt();

            System.out.println("Introduce el segundo numero a multiplicar");

            num = sc.nextInt();

            mult = numero * num;

            System.out.println(mult);

        } catch (Exception excepcion) {

            System.out.println("El tipo de variable introducido no es valido, introduzca un numero entero");

        }

    }
}
