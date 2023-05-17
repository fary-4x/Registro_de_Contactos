package Proyecto.Final;

import java.sql.*;
import javax.swing.JOptionPane;

public class DatosMannager extends DBConnection {

    public boolean crear(Datos dato) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO datos (clave, nombre, apellido, empresa, telefono1, telefono2, "
                + "correo_eletronico) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            if (dato.getClave().trim().isEmpty() || dato.getNombre().trim().isEmpty() || dato.getApellido().trim().isEmpty()
                    || dato.getEmpresa().trim().isEmpty() || dato.getTel1().trim().isEmpty() || dato.getTel2().trim().isEmpty()
                    || dato.getCorreo().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO HAY DATOS INGRESADOS");
            } else {
                ps = con.prepareStatement(query);
                ps.setString(1, dato.getClave());
                ps.setString(2, dato.getNombre());
                ps.setString(3, dato.getApellido());
                ps.setString(4, dato.getEmpresa());
                ps.setString(5, dato.getTel1());
                ps.setString(6, dato.getTel2());
                ps.setString(7, dato.getCorreo());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Agregado con Exito");
            }
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar contactos " + 2);
            System.err.print(e);
            return false;

        }

    }

    public boolean modificar(Datos dato) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE datos SET  clave = ?, nombre = ?, apellido = ?, empresa = ?, telefono1 = ?, telefono2 = ?, "
                + "correo_eletronico = ? WHERE clave = ?";

        try {

            if (dato.getClave().trim().isEmpty() || dato.getNombre().trim().isEmpty() || dato.getApellido().trim().isEmpty()
                    || dato.getEmpresa().trim().isEmpty() || dato.getEmpresa().trim().isEmpty() || dato.getTel1().trim().isEmpty()
                    || dato.getTel2().trim().isEmpty() || dato.getCorreo().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO HAY DATOS INGRESADOS A MODIFICAR");
            } else {
                ps = con.prepareStatement(query);
                ps.setString(1, dato.getClave());
                ps.setString(2, dato.getNombre());
                ps.setString(3, dato.getApellido());
                ps.setString(4, dato.getEmpresa());
                ps.setString(5, dato.getTel1());
                ps.setString(6, dato.getTel2());
                ps.setString(7, dato.getCorreo());
                ps.setString(8, dato.getClave());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar" + 2);
            System.err.print(e);
            return false;
        }

    }

    public boolean eliminar(Datos dato) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM datos  WHERE clave =?";

        try {

            if (dato.getClave().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "INSERTE LA CLAVE PARA ELIMINAR LOS DATOS");
            } else {

                ps = con.prepareStatement(query);
                ps.setString(1, dato.getClave());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar" + 2);
            System.err.print(e);
            return false;
        }
    }

}
