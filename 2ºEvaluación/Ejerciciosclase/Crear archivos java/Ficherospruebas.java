
import java.io.*;
import java.util.*;

public class Ficherospruebas {


    public static void main(String[] args) {

        escribe();
    }

    public static void crea(){
        try{
        File archivo = new File("pruebasfichero.txt");
        }catch(Exception e ){
            System.out.println("No se creo el archivo debido a un error");
        }
    }

    public static void borra(){
      
        try{
            File archivo = new File("pruebasfichero.txt");
            if(archivo.delete()){
                System.out.println("El archivo " + archivo.getName() + "se elimino correctamente");
            }else{
                System.out.println("El fichero no se elimino");
            }
        }
        catch(Exception e ){
            System.out.println("Ocurrio un error");
        }
    }

    public static void escribe(){
        
        try{
            Scanner sc = new Scanner(System.in);
            FileWriter escribir = new FileWriter("pruebasfichero.txt");
            System.out.println("Introduce lo que quieras escribir:");

            String frase;
            
            do{
            frase = sc.next();
            escribir.write(frase + "\n");
            }while(!frase.equalsIgnoreCase("Fin"));
            escribir.close();

            System.out.println(" ");
            System.out.println("Se escribio correctamente en el archivo");
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }

}
