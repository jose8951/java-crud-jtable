package conexion;
//import com.sun.jdi.connect.spi.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/tablasj";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontró el driver de MySQL.");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer conexión con la base de datos.");
            ex.printStackTrace();
        }

        return con;
    }
}
