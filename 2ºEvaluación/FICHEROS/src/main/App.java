package main;

import java.util.Scanner;

import java.util.*;

import datos.Documentos;

public class App {
    static Documentos miDocumento = new Documentos();

    static Menu miMenu;
    public static void main(String[] args) {

        int opcion = 99;
        crearMenu();

        do{
            miMenu.verMenu();
            opcion = miMenu.leerOpcion();
            switch (opcion){
                case 1 : 
                    escribir(); 
                break;
                case 2 :
                    miDocumento.guardar();
                break;
            }
        }while(opcion != 0);
        
    }

        public static void escribir(){
        String linea = "*";
        Scanner sc =  new Scanner(System.in);

        System.out.println("Escribe lineas (fin para terminar):");
        do {
            linea = sc.nextLine();

            if(!linea.equalsIgnoreCase("Fin")){
            miDocumento.nuevaLinea(linea);
            }
        } while (!linea.equalsIgnoreCase("fin"));
        
        //System.out.println(miDocumento.getMiArrayList().toString());
    }

        public static void crearMenu(){
            ArrayList<String> listaopciones = new ArrayList<>();
            listaopciones.add("Escribir en el documento");
            listaopciones.add("Guardar");
            miMenu = new Menu(listaopciones, "Documentos");
        }

        public static void borrar(){
            
        }
    }        

