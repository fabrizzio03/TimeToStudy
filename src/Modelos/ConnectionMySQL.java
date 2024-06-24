package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

    private String database_name = "time_to_study";
    private String user = "root";
    private String password = "Squishyzz2017";
    private String url = "jdbc:mysql://localhost:3310/" + database_name;
    Connection conn = null;

    public Connection getConnection() {
        try {
            //Obtener valor del Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtener la conexion
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println("Ha ocurrido un ClassNotFoundException" + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un SQLException " + e.getMessage());
        }
        return conn;
    }
}
