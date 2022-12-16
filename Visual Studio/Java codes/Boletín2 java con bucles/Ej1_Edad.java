//AUTOR : Pablo Morales Puertas. NRE : 1744623//
//FECHA : 28/10/22//
//Descripcion = Calculador de años//
//Calcular a base de condicionales los distintos datos introduciodos para sacar la edad dependiendo del dia actual//
//Mostrar resultados//

import java.util.Scanner; 

 public class Ej1_Edad {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("CALCULADOR DE EDAD");
        System.out.println("******************");
        System.out.println("                             ");
        System.out.println("Introduzca el dia en el que nacistes de forma numerica :");

        int dia = sc.nextInt();

        while ((dia > 31) || (dia < 1)){

            System.out.println("Los datos introducidos para dia no son correctos, intentelo de nuevo:");
            dia = sc.nextInt();
        }
        
        System.out.println("A continuacion introduzca el mes en el que nacistes de forma numerica");

        int mes = sc.nextInt();

        while ((mes > 12) || (mes < 1)){

            System.out.println("Los datos introducidos para dia no son correctos, intentelo de nuevo:");
            mes = sc.nextInt();
        }
        
        System.out.println("Para finalizar; deberas de ingresar el año en el que nacistes de forma numerica y entera");

        int year = sc.nextInt();

        while ((year > 2012) || (year < 1922)){

            System.out.println("Los datos introducidos para dia no son correctos, intentelo de nuevo:");
            year = sc.nextInt();
        }
        
        
        System.out.println("Segun los datos introducidos naciste en el " + dia + "/" + mes + "/" + year);




    }
}
