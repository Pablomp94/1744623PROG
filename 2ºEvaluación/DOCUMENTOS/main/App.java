package main;

import datos.Documentos;

import java.util.*;

import archivos.Archivos;

public class App {
    static Documentos miDocumento = new Documentos();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        miDocumento.nuevaLinea("Hola como estas");
        miDocumento.nuevaLinea("Segunda Linea");

        miDocumento.escribiendo();
        miDocumento.guardar();
        
        
    }        
}
