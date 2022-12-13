package EJEMPLO01;

import java.util.Scanner;

public class programaPrincipal {
    public static void main(String[] args) {
 
        int opcion, kil;

        Scanner sc = new Scanner(System.in);

        coche miToyota = new coche();
        
        do{
            System.out.println("Que quieres hacer con el coche?");
            System.out.println("1. Conducir");
            System.out.println(("2. Echar gasolina"));
            System.out.println("0. Nada, salir del garaje");
            System.out.println("Introduce la opcion a realizar");
            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("Cuantos kilometros quieres conducir?");
                kil = sc.nextInt();
                miToyota.conducir(kil);
            }

            
            if(opcion == 2){
                System.out.println("Introduce cuantos litros quieres repostar");
                miToyota.repostar(sc.nextInt());
            }

            
            if(opcion == 0){
                System.out.println("Has salido del garaje");
            }
        }while(opcion != 0);
        
        
        //miToyota.repostar(30);
        //miToyota.conducir(300);
    }
}