import java.util.Scanner;
    public class ParImpar{
    public static void main(String[] args){

        int numero;
        int resuelto;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero :");

        numero = sc.nextInt();

        resuelto = numero % 2 ;

        if(resuelto==0){
            System.out.println(numero+" es par.");
        }
        else{
            System.out.println(numero +" es impar");
        }
    }
    } 
