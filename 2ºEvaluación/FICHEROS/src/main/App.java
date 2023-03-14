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
    static Scanner sc = new Scanner(System.in);
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
                    verDocumento();
                break;
                case 3:
                    reescribir();
                break;
                case 4:
                    modificaLinea();
                break;
                case 5:
                    borraLinea();
                break;
                case 6:
                    //buscaCadena();
                break;
                case 7:
                buscaCadena();
                break;
                

            }
        } while (opcion!=0);
        
    }       
    
    /**
     * Añade lineas al documento
     */
    public static void escribir() {
        String linea = "";
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
     * Muestra por pantalla el documento actual
     */
    public static void verDocumento() {
        // Me copio el documento en mi ArrayList
        // para recorrer las lineas 
        var miDoc = miDocumento.getMiArrayList();
        // recorro la copia y muestro el 
        // numero de linea y el contenido
        for (int i=0; i<miDoc.size(); i++) {
            System.out.print(i+1 + ": "+miDoc.get(i));
        }
    }

    /**
     * Borra el contenido del documento
     * y empeiza a escribir en él
     */
    public static void reescribir() {
        miDocumento.vaciaDocumento();
        escribir();
    }

    /**
     * Borra una linea del documento
     */
    public static void borraLinea() {
        System.out.print("Introduce número de linea a borrar: ");
        int linea = sc.nextInt();
        sc.nextLine();
        if (linea<1 || linea>miDocumento.getNumeroLineas()) {
            System.out.println("No existe esa linea");
        }
        else {
            miDocumento.borraLinea(linea);
            
        }
        verDocumento();
        System.out.println("GUARDAR CAMBIOS? (S/N)");
        String opcion = sc.nextLine();
        if (opcion.equals("S")) {
            miDocumento.guardar();
        }
        else {
            miDocumento = new Documentos();
        }
        verDocumento();
    }


    public static void modificaLinea() {
        System.out.print("Introduce número de linea a borrar: ");        
        int linea = sc.nextInt();
        sc.nextLine(); //para borrar el salto de linea
        if (linea < 1 || linea > miDocumento.getNumeroLineas()) {
            System.out.println("No existe esa linea");
        } else {
            System.out.println("Escribe nuevo contenido:");
            String contenido = sc.nextLine();
            miDocumento.modificaLinea(linea, contenido);

        }
        verDocumento();
        System.out.println("GUARDAR CAMBIOS? (S/N)");
        String opcion = sc.nextLine();
        if (opcion.equals("S")) {
            miDocumento.guardar();
        } else {
            miDocumento = new Documentos();
        }
        verDocumento();
    }

    public static void buscaCadena() {
        System.out.print("Introduce la cadena a buscar: ");
        String cadena = sc.nextLine();
        var lista = miDocumento.buscaCadena(cadena);
        if (lista.size() > 0) {
            for (String elemento : lista) {
                System.out.print(elemento);
            }
        }
        else {
            System.out.println("NO se ha encontrado");
        }
    }

    /**
     * crea el menu con mis opciones
     */
    public static  void crearMenu() {
        ArrayList<String> listaOpciones = new ArrayList<>();
        listaOpciones.add(0,"AÑADIR LINEAS");
        listaOpciones.add(1,"VER DOCUMENTO");
        listaOpciones.add(2,"REESCRIBIR DOCUMENTO (RESET)");
        listaOpciones.add(3,"MODIFICAR UNA LÍNEA");
        listaOpciones.add(4,"BORRAR UNA LINEA");        
        listaOpciones.add(5,"BORRAR DOCUMENTO");
        listaOpciones.add(6,"BUSCAR");
        miMenu = new Menu(listaOpciones, "DOCUMENTOS");
    }
}
