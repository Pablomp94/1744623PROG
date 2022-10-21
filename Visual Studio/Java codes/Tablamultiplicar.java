//Autor: Pablo Morales Puertas NRE: 1744623
//FECHA: 21/10/22
//Escribir numero para introducir su tabla//
//Dicho numero no puede ser mayor de 20//
//Hacer uso de bucles y condicionales//



import java.util.Scanner;

public class Tablamultiplicar {
    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un numero para la tabla");

    int numero_tabla , numero = 0; 

    numero_tabla = sc.nextInt();

   
    
    while (numero_tabla > 20 || numero_tabla < 0) {

        System.out.println("Introduce un numero menor o igual a 20 y mayor o igual a 0");

        numero_tabla = sc.nextInt();

    }
    
    if (numero_tabla >= 0 && numero_tabla <= 20) {

        System.out.println("Tabla del " + numero_tabla);

    }
    
    while (numero <= 10 && numero_tabla <= 20) {

        int producto = numero_tabla * numero;

        System.out.println(numero_tabla + "x" + numero + "=" + producto);

        numero = numero + 1;
}

    



}

}






























