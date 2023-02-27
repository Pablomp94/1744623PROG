package datos;

import java.util.ArrayList;
import archivos.Archivos;
import java.util.*;

public class Documentos {
    private ArrayList<String> miArrayList;
    private Archivos miArchivo;


    public Documentos() {
        miArrayList = new ArrayList<>();
        miArchivo = new Archivos();
    }

    public void nuevaLinea(String linea) {
        miArrayList.add(linea + "\n");
        miArchivo.escribe(miArrayList);
    }

    public ArrayList<String> getMiArrayList() {
        return miArrayList;
    }

    public void guardar(){
        miArchivo.escribe(miArrayList);
    }

    public void escribiendo(){

        Scanner sc = new Scanner(System.in);

        String palabra = " ";

        System.out.println("Introduce lineas hasta poner fin");
        do{
            palabra = sc.nextLine();
            miArrayList.add(palabra + "\n");
            
        }while(!palabra.equalsIgnoreCase("Fin"));
    }
    
}
