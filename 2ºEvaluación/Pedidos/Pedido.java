public class Pedido {

    public int idPedidos;

    public String listaPedidos[] = new String[10];

    public int contadorProductos = 0; 

    public String producto; 

    public Pedido(int idNuevo){

        idPedidos = idNuevo; 
    }
    
    public void agregarProducto(String producto) {

        if(contadorProductos < 10) {

            listaPedidos[contadorProductos] = producto;
        
            contadorProductos ++;
        }
        
        else{
            System.out.println("Has alcanzado el limite de productos");
        }

    }

    public void verListaProductos() {

        for(String elProducto : listaPedidos) {

           if(elProducto != null) System.out.println(elProducto);


        }

    }

    public void eliminarultProducto(){

        listaPedidos[contadorProductos] = null;

        contadorProductos --;

    }

}
