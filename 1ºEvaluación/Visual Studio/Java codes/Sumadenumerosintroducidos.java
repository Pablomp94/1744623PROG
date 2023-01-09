import java.util.Scanner;

public class Sumadenumerosintroducidos {
    
    public static void main(String[] args){

        System.out.println("Introduzca numeros a sumar");

        Scanner sc = new Scanner(System.in);

        int sumafinal = 0 ;

        int numero1;


       do {

        numero1 = sc.nextInt();
        
        sumafinal = sumafinal + numero1;

        } while (numero1 != 0); 

        System.out.println(sumafinal);
        
}
}