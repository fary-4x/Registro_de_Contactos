package Proyecto.Final;

import java.sql.*;

public class DBConnection {

    private static String URL = "jdbc:mysql://localhost:3306/registro";
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    Connection con = null;

    public Connection getConnection() {

        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.print("Conexion Exitosa ");

        } catch (SQLException e) {
            System.out.print("Error de conexion " + e);
        }
        return con;
    }

}
