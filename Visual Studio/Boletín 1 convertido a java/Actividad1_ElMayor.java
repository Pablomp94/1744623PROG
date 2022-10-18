import java.util.Scanner;

    public class Actividad1_ElMayor{
        public static void main (String[] args){
        
        int numero1;
        int numero2;

        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero:");
            numero1 = sc.nextInt();
            System.out.println("Introduce un segundo numero");
            numero2 = sc.nextInt();
        

        if(numero1>numero2){ 
            System.out.println(numero1 + " es mayor que " + numero2);
        }
        if(numero1==numero2){ 
            System.out.println(numero1 + " es igual que  " + numero2);
        }
        else{ 
            System.out.println(numero1 +  " en menor que " + numero2);
        
        }
    }

}