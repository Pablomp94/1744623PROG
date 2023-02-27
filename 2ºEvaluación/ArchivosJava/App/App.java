package App;

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        
    }


    public void crear(){
    
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


    public void eliminar(){
        File archivo = new File("filename.txt");
        if (archivo.delete()) {
            System.out.println("Deleted the file: " + archivo.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public void escribir(){
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            System.out.println("Escribe lo que quieras, cuando pongas fin finalizara y se escribira en el archivo");
            do{
                
            }
        }
    }
}
