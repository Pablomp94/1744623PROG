package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Archivos
 * Implementa la gestion de ficheros en disco
 * @author Pablo Morales Puertas
 * @version 2023.02.29
 * 
 */
public class Archivos {
    /**
     * nombreFichero almacena el nombre del archivo a leers
     */
    private String nombreFichero;

    /**
     * <b>Este metodo crea un archivo nuevo</b>
     * @see <a href="https://www.w3schools.com/files">W3SCHOOLS</a>
     */
    public  Archivos(String nombreFichero) {
        this.nombreFichero = nombreFichero;
        try {
            File miFichero = new File(nombreFichero);
            miFichero.createNewFile();            
        } catch (IOException e) {
            //System.out.println("Hay un error.");
            e.printStackTrace();
        }
    }

    /**
     * lee el archivo y lo almacena en un arraylist
     * @return ArrayList con las lineas del archivo
     */
    public ArrayList<String> lee() { 
        File miFichero = new File(nombreFichero);       
        ArrayList<String> documento = new ArrayList<>();
        try {
            
            Scanner myReader = new Scanner(miFichero);
            // Este bucle var leyendo el archivo
            // linea por linea
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // Añado el /n para que incluya
                // los saltos de linea
                documento.add(data + "\n");
            }            
            myReader.close();            
        } catch (FileNotFoundException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return documento;        
    }

    /**
     * lee del arraylist y lo almacena en el archivo
     * 
     * @param documento - ArrayList con las lineas del archivo
     */
    public void escribe(ArrayList<String> documento) {
        try {
            FileWriter myWriter = new FileWriter(nombreFichero);
            for (String linea : documento) {
                myWriter.write(linea);
            }            
            myWriter.close();            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metodo que borra el archivo del disco
     * @return el resultado de la operación de borrado
     */
    public boolean borra() {
        File myObj = new File(nombreFichero);
        return myObj.delete();
    }
}
