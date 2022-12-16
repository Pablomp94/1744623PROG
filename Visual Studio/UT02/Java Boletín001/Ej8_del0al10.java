//Pablo Morales Puertas NRE: 1744623//
//Introducir numeros y cuando numero = -1 romper bucle// 
//decir si hay 10//



import java.util.Scanner;

public class Ej8_del0al10 {
    
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    //Introduccion//

    System.out.println("Introduzca numeros desde el 0 al 10 y para finalizar introduzca -1.");
    
    
    //Variables//

    int numero, conteo;

    numero = 0;

    conteo = 0;

    while(numero!=-1){

        numero = sc.nextInt();


        if(numero == 10){
            conteo ++;
        }

    }

    System.out.println("Has introducido " + conteo + " vez/veces el numero 10");






    }
}
