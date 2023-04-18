import java.io.*;
import java.sql.*;

import modelo.CrearConexion;
import modelo.Publication;
import modelo.PublicationRepository;

import controlador.Publicaciones;

import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Iniciando aplicación...");
        
        Publicaciones biblioteca = new Publicaciones();

        System.out.println("Escribe el id a buscar: ");

        Scanner sc = new Scanner(System.in);

        int id = Integer.parseInt(sc.nextLine());

        System.out.println(biblioteca.buscarPorId(id));


        System.out.println("Escribe el titulo a buscar: ");

        String titulo = sc.nextLine();

        System.out.println(biblioteca.buscarPorTitulo(titulo));

    }
}