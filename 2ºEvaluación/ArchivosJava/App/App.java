package App;

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) {

        int opcion = 3332;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Introduce la opcion:");
            System.out.println(" ");
            System.out.println("1. Crear archivo");
            System.out.println("2.Borrar archivo");
            System.out.println("3.Escribir en el archivo");
            System.out.println("4.Leer archivo");
            System.out.println("0.Salir");
    
            opcion = sc.nextInt();
    
            if(opcion == 1){
                crear();
            }
    
            if(opcion == 2){
                eliminar();
            }
    
            if(opcion == 3){
                escribir();
            }
    
            if(opcion == 4){
                leer();
            }
    
            if(opcion == 0){
                System.out.println("Has salido");
            }
        }while(opcion != 0);
    }
    

    Scanner sc = new Scanner(System.in);

    public static void crear(){
    
        try{
        File archivo = new File("filename.txt");
       
        if (archivo.createNewFile()) {
            System.out.println("File created: " + archivo.getName());
        } else {
            System.out.println("File already exists.");
        }
        }catch(Exception e){
            System.out.println("Hubo un error");
        }
    }


    public static void eliminar(){
        File archivo = new File("filename.txt");
        if (archivo.delete()) {
            System.out.println("Deleted the file: " + archivo.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void escribir(){
        try{
            Scanner sc = new Scanner(System.in);
            String palabra;
            FileWriter myWriter = new FileWriter("filename.txt");
            System.out.println("Escribe lo que quieras, cuando pongas Fin finalizara y se escribira en el archivo");
            do{
                palabra = sc.nextLine();
                myWriter.write(palabra + "\n");
            }while(!palabra.equalsIgnoreCase("Fin"));
            myWriter.close();
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }

    public static void leer(){
        try{
            File archivo = new File("filename.txt");
            Scanner myReader = new Scanner(archivo);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }

}
