package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que gestiona el menu de opciones
 * @author Joaquin Rios
 * @version 2023.02.28
 */
public class Menu {
    ArrayList<String> listaOpciones;
    String titulo;

    /**
     * constructor que recibe la lista y el titulo del menú
     * @param listaOpciones ArrayList con las opcciones del menu
     * @param titulo Título de la applicación
     */
    public Menu(ArrayList<String> listaOpciones , String titulo) {
        this.listaOpciones = listaOpciones;
        this.titulo = titulo;   
    }

    /**
     * Muestra el menu por pantalla
     * 
     */
    public void verMenu() {
        System.out.println("***********************************");
        System.out.println("          " + titulo + "         ");
        System.out.println("***********************************");
        int contador = 1;
        for (String opcion : listaOpciones) {
            System.out.println(contador + ": " + opcion);
            contador++;
        }
        System.out.println("0: SALIR");
    }

    /**
     * Lee desde teclado un numero
     * @return int La opcion leida desde teclado
     */
    public int leerOpcion() {
        System.out.println("------------------------------");
        System.out.print("ELIGE TU OPCIÓN: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
    }

    
}