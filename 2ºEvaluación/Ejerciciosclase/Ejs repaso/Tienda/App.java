//Creamos la aplicación en la que el cliente interactuará//
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        Compras miCompra = new Compras(); 

        Scanner sc = new Scanner(System.in);

        //Definimos variables//
        int opcion, numeroMesa, numeroSilla, opcion2, x;

        numeroMesa = 0;

        numeroSilla = 0;

            //CODIGO//
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("*****************************************");
        System.out.println("BIENVENIDO A LA TIENDA DE MESAS Y SILLAS");
        System.out.println("*****************************************");
        System.out.println("___________________________________________");
        System.out.println("Precios ===> Mesas = 10$ || Sillas = 7$");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("                                                        ");
        System.out.println("                                                           ");        
        System.out.println("Que desea hacer?");
        System.out.println("");

        do{    
            System.out.println("1.Comprar MESAS");
            System.out.println("2.Comprar SILLAS");
            System.out.println("3.Salir");

            opcion = sc.nextInt();

            if(opcion == 1){

                System.out.println("Cuantas mesas deseas comprar?");

                numeroMesa = sc.nextInt();

                miCompra.mesa(numeroMesa);

                System.out.println("");
            }

            if(opcion == 2){
                System.out.println("");
                System.out.println("Cuantas sillas deseas comprar?");

                numeroSilla = sc.nextInt();

                miCompra.silla(numeroSilla);


            }
        }while(opcion != 3); 

        //Añadir que a la hora de salir te deje elegir entre salir o pagar, si elije salir sin pagar habiendo comprado algo se le pondrá en un bucle hasta que pague//
        //Para q te deje salir sin pagar =====> numeroMesa y numeroSilla = 0, si no pagar// 

        if(numeroMesa == 0 && numeroSilla == 0){
            System.out.println("________________");
            System.out.println("HASTA PRONTO");
        }
        else{
            System.out.println("1. PAGAR Y SALIR");
            System.out.println("2. SALIR SIN PAGAR");

            opcion2 = sc.nextInt();

            if(opcion2 == 2){

                for(x = 0; x <2; x++){

                    if(opcion2 == 2){
                    System.out.println("1. PAGAR ");
                    System.out.println("2. INTENTAR SALIR SIN PAGAR");
                    
                    opcion2 = sc.nextInt(); 
                    System.out.println("_____________");
                    System.out.println("");                   
                    }
                    else{
                        x = 3; 
                    }
                }
            }
            else{
                x = 3;
            }

            if(x == 3){
                System.out.println("_______________________________"); 
                System.out.println("PAGAS LA COMPRA Y HAS SALIDO");                
            }
            else{
                System.out.println("____________________________________________"); 
                System.out.println("HAN LLAMADO A LA POLICIA Y TE HAN ARRESTADO");
            }
        }
    }
}