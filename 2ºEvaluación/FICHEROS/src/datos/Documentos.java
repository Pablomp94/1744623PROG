package datos;

import java.util.ArrayList;
import archivos.Archivos;

/**
 * Controlador que gestiona la clase archivos
 * y envia la información a App.java
 * @author Joaquin Rios
 * @version 2023.02.28
 */
public class Documentos {
    private ArrayList<String> miArrayList;
    /**
     * Objeto que gestiona los datos guardados en el archivo
     */
    private Archivos miArchivo;

    /**
     * Constructor que crea el objeto que gestiona
     * los archivos de disco
     * y el ArrayList que se envia a la App
     */
    public Documentos() {
        miArrayList = new ArrayList<>();
        miArchivo = new Archivos();
        miArrayList = miArchivo.lee();
    }


    /**
     * Añade una linea a mi Documento
     * @param linea linea a añadir
     * @return el ArrayList con la linea añadida
     */
    public ArrayList<String> nuevaLinea(String linea) {
        miArrayList.add(linea);    
        return miArrayList;    
    }

    /**
     * Guarda el archivo en disco con el
     * contenido del ArrayList
     */
    public void guardar() {
        miArchivo.escribe(miArrayList);
    }

    /**
     * 
     * @return miArrayList -> la lista e lineas
     */
    public ArrayList<String> getMiArrayList() {
        return miArrayList;
    }

    public void vaciarDocumento(){
        miArrayList.clear();

    }

    public int getNumeroLineas(){
        return miArrayList.size();
    }

    public void borraLinea(int num_linea){
        
        miArrayList.remove(num_linea - 1);
    }
    

    public void modificarLinea(int num_linea, String linea){
        miArrayList.set(num_linea - 1, linea);
    }
}
