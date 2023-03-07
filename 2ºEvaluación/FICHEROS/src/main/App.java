package main;

import java.util.ArrayList;
import java.util.Scanner;

import datos.Documentos;

/**
 * Clase principal que muestra los datos por pantalla
 *
 * @author Joaquin Rios
 * @version 2023.02.28
 */
public class App {
    static Documentos miDocumento = new Documentos();
    static Menu miMenu;
    /**
     * Aplicacion principal
     * @param args argumentos de la app
     */
    public static void main(String[] args) {
        int opcion=99;
        crearMenu();

        do {
            miMenu.verMenu();
            opcion = miMenu.leerOpcion();
            switch (opcion) {
                case 1: 
                    escribir();
                break;
                case 2: 
                    miDocumento.guardar();
                break;
                case 3:
                    vaciar();
                break;
                case 4:
                    borraLinea();
                break;
                case 5:
                    modificarLinea();
                break;

            }
        } while (opcion!=0);
        
    }       
    
    /**
     * Añade lineas al documento
     */
    public static void escribir() {
        String linea = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe lineas (fin para terminar):");
        do {
            linea = sc.nextLine();
            if (!linea.equals("fin")) {
                miDocumento.nuevaLinea(linea);
            }
        } while (!linea.equals("fin"));
        miDocumento.guardar();
    }

    /**
     * crea el menu con mis opciones
     */
    public static  void crearMenu() {
        ArrayList<String> listaOpciones = new ArrayList<>();
        listaOpciones.add("Escribir en el documento");
        listaOpciones.add("GUARDAR");
        listaOpciones.add("Vaciar");
        listaOpciones.add("Eliminar linea");
        listaOpciones.add("Modificar linea");
        miMenu = new Menu(listaOpciones, "DOCUMENTOS");

    }

    public static void vaciar(){
        miDocumento.vaciarDocumento();
        
        miDocumento.guardar();
    }

    public static void borraLinea(){
        System.out.println("Introduce numero de linea a borrar:");
        Scanner sc = new Scanner(System.in);
        int num_linea = sc.nextInt();
        miDocumento.borraLinea(num_linea);
        miDocumento.guardar();
    }

    public static void modificarLinea(){
        System.out.println("Introduce la linea a modificar:");
        Scanner sc = new Scanner(System.in);
        int num_linea = sc.nextInt();
        
        System.out.println("Introduce la frase a cambiar:");
        String linea = sc.next();

        miDocumento.modificarLinea(num_linea, linea);
        miDocumento.guardar();
    }
}
