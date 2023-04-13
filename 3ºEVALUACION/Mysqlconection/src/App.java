
import java.io.*;
import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        // detalles de la conexión (servidor y base de datos)
        String url = "jdbc:mysql://localhost:3306/apressBooks";
        // Credenciales MySQL
        String username = "usuario3PAW";
        String password = "P@ssw0rd";
        // Consulta que vamos a ejecutar
        String query = "select * from publication";
        // Driver que vamos a usar
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Conexión Establecida con éxito");
        Statement st = con.createStatement();
        // Ejecutamos la consulta
        ResultSet rs = st.executeQuery(query);
        rs.next();
        // Recuperamos los datos de la tabla
        String name = rs.getString("book_title");
        // Mostramos los resultados por consola
        System.out.println(name);
        // Cerramos la consulta
        st.close();
        // Cerramos la conexión
        con.close();
        System.out.println("Conexión Cerrada....");
    }
}
