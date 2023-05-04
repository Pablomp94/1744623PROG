import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import controlador.Publicaciones;
import modelo.Publication;
import modelo.PublicationRepository;

class App {
    static Scanner sc = new Scanner(System.in);

    static Publicaciones biblioteca = new Publicaciones();

    public static void main(String[] args) throws Exception {

        System.out.println("Iniciando aplicación...");

        insertar();

        buscarporId();

    }

    public static void buscarporId() {
        System.out.print("Escribe el id a buscar: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println(biblioteca.buscarPorId(id));
    }

    public static void buscarPorTitulo() {
        System.out.print("Escribe el titulo a buscar: ");
        String titulo = sc.nextLine();

        var resultado = biblioteca.buscarPorTitulo(titulo);

        if (resultado.size() > 0) {
            System.out.println("Encontrados " +
                    resultado.size() +
                    " resultados:");
            for (String libro : resultado) {
                System.out.println(libro);
            }
        } else {
            System.out.println("No se encontró ningún resultado");
        }
    }

    public static void insertar() {
        System.out.print("Escribe el titulo a insertar: ");
        String tituloL = sc.nextLine();

        System.out.print("Escribe la fecha: ");
        String fechaL = sc.nextLine();

        System.out.print("Escribe la editorial: ");
        String editorialL = sc.nextLine();

        biblioteca.insertaLibro(tituloL, fechaL, editorialL);
    }

    public static void modificar() {

        ArrayList<Publication> repositorio = new ArrayList<Publication>();

        System.out.print("Escribe el id del libro a modificar: ");
        Integer id = sc.nextInt();

        String titulo = "";
        String fecha = "";
        

        int opcion;

        System.out.println("¿Quieres modificar el titulo?");
        System.out.println("1. Si");
        System.out.println("2. No");

        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Escribe nuevo titulo: ");
            titulo = sc.nextLine();
        } else {
            System.out.println("No se modifico el titulo");
        }

        opcion = 3;

        System.out.println("¿Quieres modificar la fecha?");
        System.out.println("1. Si");
        System.out.println("2. No");

        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Escribe la fecha a modificar: ");
            fecha = sc.nextLine();
        } else {
            System.out.println("No se modidico la fecha");
        }

        System.out.print("Escribe la editorial a modificar: ");
        String editorial = sc.nextLine();

        biblioteca.modificaLibro(id, titulo, fecha, editorial);
    }
}
