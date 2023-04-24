import java.io.*;
import java.sql.*;
import java.util.Scanner;

import controlador.Publicaciones;

class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Iniciando aplicación...");

        Publicaciones biblioteca = new Publicaciones();
        Scanner sc = new Scanner(System.in);
        int opcion = 4;

        do {
            System.out.println(metodos.Menu());

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Escribe el id a buscar: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println(biblioteca.buscarPorId(id));
            }

            if (opcion == 2) {
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

            if (opcion == 3) {

                int id;
                String bookTitle, publishCo, publishDate;

                System.out.println("AÑADIR NUEVO LIBRO:");
                System.out.println("Id:");
                id = sc.nextInt();
                System.out.println(" ");

                System.out.println("Titulo del libro:");
                bookTitle = sc.nextLine();
                System.out.println(" ");

                System.out.println("Fecha de publicacion:");
                publishDate = sc.nextLine();
                System.out.println(" ");

                System.out.println("Editorial:");
                publishCo = sc.nextLine();
                System.out.println(" ");

                biblioteca.insertaLibro(id, bookTitle, publishDate, publishCo);

            }
        } while (opcion != 0);
    }
}