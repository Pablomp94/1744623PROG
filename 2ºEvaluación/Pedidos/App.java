import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        String agregar;

        Pedido pedidoUno = new Pedido(1);

        System.out.println("___________________");
        System.out.println("LISTA DE LA COMPRA");
        System.out.println("-------------------");


        System.out.println("Introduce la accion a realizar");

        System.out.println(".....................................");

        do{
            //Pedir opciones a elegir para realizar una accion u otra//
            System.out.println("1.Agregar producto");
            System.out.println("2.Eliminar el ultimo producto");
            System.out.println("3.Ver lista pedidos");
            System.out.println("4.Salir");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            opcion = sc.nextInt();
            System.out.println("....");
            //Dentro de cada opcion introducida realizar dicha accion//

            //Agregar un producto//
            if(opcion == 1){

                System.out.println("Introduce el producto a agregar");

                agregar = sc.nextLine();

                pedidoUno.agregarProducto(agregar);
            }
            //Eliminar el ultimo producto introducido//
            if(opcion == 2){

                System.out.println("Se eliminará el último producto agregado");

                pedidoUno.eliminarultProducto();

            }

        }while(pedidoUno.contadorProductos <= 10);
        

        



    }
    

}

