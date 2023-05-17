package Proyecto.Final;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana3 extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    Connection con = null;
    ResultSet rs = null;

    public Ventana3() {
        initComponents();
        mostrarDatos(0, null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void mostrarDatos(int buscar, String valor) {
        con = db.getConnection();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Clave");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Empresa");
        model.addColumn("Celular");
        model.addColumn("Telefono Empresa");
        model.addColumn("Correo Eletronico");
        tabla.setModel(model);

        String query;

        if (buscar == 0 && valor == null) {
            query = "SELECT * FROM datos";
        } else if (buscar == 1 && valor != null) {
            query = "SELECT * FROM datos WHERE clave = '" + valor + "' ";
        } else if (buscar == 2 && valor != null) {
            query = "SELECT * FROM datos WHERE nombre = '" + valor + "' ";
        } else if (buscar == 3 && valor != null) {
            query = "SELECT * FROM datos WHERE apellido = '" + valor + "' ";
        } else if (buscar == 4 && valor != null) {
            query = "SELECT * FROM datos WHERE empresa = '" + valor + "' ";
        } else if (buscar == 5 && valor != null) {
            query = "SELECT * FROM datos WHERE correo_eletronico = '" + valor + "' ";
        } else {
            query = "SELECT * FROM datos";
        }

        String[] datos = new String[8];

        try {
            Statement consulta = con.createStatement();
            ResultSet rs = consulta.executeQuery(query);

            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
                datos[3] = rs.getString(5);
                datos[4] = rs.getString(6);
                datos[5] = rs.getString(7);
                datos[6] = rs.getString(8);
                model.addRow(datos);
            }
            tabla.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar " + 0);
            System.err.print(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnVolverAVentana2 = new javax.swing.JButton();
        Filtro = new javax.swing.JComboBox<>();
        BuscarXFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Apellido", "Empresa", "Celular", "Telefono Empresa", "Correo eletronico"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnVolverAVentana2.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverAVentana2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolverAVentana2.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\limpiar1.png")); // NOI18N
        btnVolverAVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAVentana2ActionPerformed(evt);
            }
        });

        Filtro.setBackground(new java.awt.Color(255, 255, 255));
        Filtro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Filtro.setForeground(new java.awt.Color(153, 153, 153));
        Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos", "Clave", "Nombre", "Apellido", "Empresa", "Correo Eletronico", " " }));
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });

        BuscarXFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarXFiltroActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\buscar.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverAVentana2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(311, 311, 311)
                                .addComponent(BuscarXFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuscarXFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnVolverAVentana2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverAVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAVentana2ActionPerformed
        volverAVentana2();
    }//GEN-LAST:event_btnVolverAVentana2ActionPerformed
    private void volverAVentana2() {
        Ventana2 ir = new Ventana2();
        ir.setVisible(true);
        this.setVisible(false);
    }

    private void BuscarXFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarXFiltroActionPerformed

    }//GEN-LAST:event_BuscarXFiltroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        btnBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroActionPerformed
    private void btnBuscar() {

        if (BuscarXFiltro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INSERTE DATOS A BUSCAR");
        } else {
            int buscarF = Filtro.getSelectedIndex();
            String valorB = BuscarXFiltro.getText();
            mostrarDatos(buscarF, valorB);
        }
        limpiar();

    }

    private void limpiar() {
        BuscarXFiltro.setText(null);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarXFiltro;
    private javax.swing.JComboBox<String> Filtro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolverAVentana2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
