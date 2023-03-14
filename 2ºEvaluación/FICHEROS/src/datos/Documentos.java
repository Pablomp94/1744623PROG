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
        // BUG resuelto: tengo que pasar los
        // datos del archivo al ArrayList
        // para que se puedan acceder desde la App
        miArrayList = miArchivo.lee();
    }

    /**
     * Borramos el contenido del ArrayList
     */
    public void vaciaDocumento () {
        miArrayList = new ArrayList<>();
    }


    /**
     * Añade una linea a mi Documento
     * @param linea linea a añadir
     * @return el ArrayList con la linea añadida
     */
    public ArrayList<String> nuevaLinea(String linea) {
        miArrayList.add(linea + "\n");    
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
     * @return miArrayList -> la lista de lineas
     */
    public ArrayList<String> getMiArrayList() {
        return miArrayList;
    }

    /**
     * Devuelve el número de líneas del documento
     */
    public int getNumeroLineas() {
        return miArrayList.size();
    }

    /**
     * Borra la linea solicitada
     * @param numLinea El numero de la linea a borrar
     */
    public void borraLinea(int numLinea) {
        //Al empezar en cero, debemos restar 1
        miArrayList.remove(numLinea - 1);
    }

    /**
     * Modifica una linea con un nuevo valor
     * @param numLinea El numero de  la linea a modificar
     * @param linea El nuevo contenido de la linea
     */
    public void modificaLinea(int numLinea , String linea) {
        // Al empezar en cero, debemos restar 1
        miArrayList.set(numLinea - 1 , linea + "/n");
    }

    /**
     * 
     * 
     */
    public ArrayList<String> buscaCadena(String cadena) {
        var devolver = new ArrayList<String>();
        for (String lineaActual : miArrayList) {
            if (lineaActual.contains(cadena)) {
                devolver.add(lineaActual);
            }
        }
        return devolver;
    }

    
    
}
