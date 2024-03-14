package ejercicio_jhonsonleiva;

import org.mariadb.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author jhons
 */
public class Conexion {
    Connection cx;
    String db = "progra3";
    String url="jdbc:mariadb://localhost:3307/"+db;
    String user = "root";
    String pass = "liebe1890";    
    
    public Connection conectar(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            cx = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Se conecto");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto");
        }
        return cx;
    }   
}
