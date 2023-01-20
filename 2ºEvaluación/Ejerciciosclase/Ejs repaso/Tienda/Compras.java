public class Compras {
    
    //Primero añadimos las propiedades de cada atributo dentro de la clase "Compras" en las que trabajaremos proximamente//

    public double costeCompras; 

    public int objetosCompras;

    //Queremos una lista de objetos a comprar, que muestre el numero de objetos que hemos comprado y el precio total//

    public void  mesa(int numeroMesa){

        //Mesa ======== 10$ cada una//

        int valorMesa = 10; 

        int costeMesa = valorMesa * numeroMesa;

        costeCompras = costeCompras + costeMesa; 

        System.out.println("Has añadido a la cesta " + numeroMesa + " mesas.");

        System.out.println("De momento la compra te cuesta " + costeCompras);
    }

    public void  silla(int numeroSilla){

        //Mesa ======== 7$ cada una//

        int valorSilla = 7; 

        int costeSilla = valorSilla * numeroSilla;

        costeCompras = costeCompras + costeSilla; 

        System.out.println("Has añadido a la cesta " + numeroSilla + " sillas.");

        System.out.println("De momento la compra te cuesta " + costeCompras);   
    }
}
