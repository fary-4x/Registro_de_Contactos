package Proyecto.Final;

import java.sql.*;
import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTel1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscarClave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnIrAVentana3 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolverAVentana1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("REGISTRAR CONTACTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\Gmail.png")); // NOI18N
        jLabel8.setText("Correo Eletronico");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 160, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\telEmpresa.png")); // NOI18N
        jLabel7.setText("Telefono Empresarial");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, -1));

        txtTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 200, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\tel.png")); // NOI18N
        jLabel6.setText("Celular");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, -1));
        jPanel1.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 201, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\empresa.png")); // NOI18N
        jLabel5.setText("Empresa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, -1));
        jPanel1.add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 201, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\nombreyapellido.png")); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\nombreyapellido.png")); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 201, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 201, 30));

        btnBuscarClave.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarClave.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBuscarClave.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\buscar.png")); // NOI18N
        btnBuscarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 60, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\clave.png")); // NOI18N
        jLabel2.setText("Clave");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, -1));

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 40, 20));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(153, 153, 153));
        btnCrear.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\guardar2.png")); // NOI18N
        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 150, 40));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(153, 153, 153));
        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\modificar1.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 150, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(153, 153, 153));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 150, -1));

        btnIrAVentana3.setBackground(new java.awt.Color(255, 255, 255));
        btnIrAVentana3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnIrAVentana3.setForeground(new java.awt.Color(153, 153, 153));
        btnIrAVentana3.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\verConctacto.png")); // NOI18N
        btnIrAVentana3.setText("Ver contactos");
        btnIrAVentana3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAVentana3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIrAVentana3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 150, -1));

        btnVolverAVentana1.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverAVentana1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolverAVentana1.setForeground(new java.awt.Color(153, 153, 153));
        btnVolverAVentana1.setIcon(new javax.swing.ImageIcon("C:\\Users\\farin\\OneDrive\\Desktop\\carpetaImgIconos\\limpiar1.png")); // NOI18N
        btnVolverAVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAVentana1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolverAVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrAVentana3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAVentana3ActionPerformed
        irAVentana3();
    }//GEN-LAST:event_btnIrAVentana3ActionPerformed
    private void irAVentana3() {
        Ventana3 ir = new Ventana3();
        ir.setVisible(true);
        this.setVisible(false);

    }
    private void btnVolverAVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAVentana1ActionPerformed
        volverAVentana1();
    }//GEN-LAST:event_btnVolverAVentana1ActionPerformed
    private void volverAVentana1() {
        Ventana1 ir = new Ventana1();
        ir.setVisible(true);
        this.setVisible(false);
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void limpiar() {

        txtClave.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtEmpresa.setText(null);
        txtTel1.setText(null);
        txtTel2.setText(null);
        txtCorreo.setText(null);

    }

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        btnCrear();

    }//GEN-LAST:event_btnCrearActionPerformed
    private void btnCrear() {
        Datos dt = new Datos();
        DatosMannager dm = new DatosMannager();

        dt.setClave(txtClave.getText());
        dt.setNombre(txtNombre.getText());
        dt.setApellido(txtApellido.getText());
        dt.setEmpresa(txtEmpresa.getText());
        dt.setTel1(txtTel1.getText());
        dt.setTel2(txtTel2.getText());
        dt.setCorreo(txtCorreo.getText());
        dm.crear(dt);
        limpiar();
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        btnModificar();
    }//GEN-LAST:event_btnModificarActionPerformed
    private void btnModificar() {

        Datos dt = new Datos();
        DatosMannager dm = new DatosMannager();

        dt.setClave(txtClave.getText());
        dt.setNombre(txtNombre.getText());
        dt.setApellido(txtApellido.getText());
        dt.setEmpresa(txtEmpresa.getText());
        dt.setTel1(txtTel1.getText());
        dt.setTel2(txtTel2.getText());
        dt.setCorreo(txtCorreo.getText());
        dm.modificar(dt);
        limpiar();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        btnEliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void btnEliminar() {

        Datos dt = new Datos();
        DatosMannager dm = new DatosMannager();

        dt.setClave(txtClave.getText());
        dm.eliminar(dt);
        limpiar();
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTel2ActionPerformed

    private void btnBuscarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClaveActionPerformed
        btnBuscar();
    }//GEN-LAST:event_btnBuscarClaveActionPerformed

    DBConnection db = new DBConnection();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private void btnBuscar() {

        try {
            con = db.getConnection();
            ps = db.con.prepareStatement("SELECT * FROM datos WHERE clave=?");
            ps.setString(1, txtClave.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                txtId.setText(rs.getString("id"));
                txtNombre.setText(rs.getString("nombre"));
                txtApellido.setText(rs.getString("apellido"));
                txtEmpresa.setText(rs.getString("empresa"));
                txtTel1.setText(rs.getString("telefono1"));
                txtTel2.setText(rs.getString("telefono2"));
                txtCorreo.setText(rs.getString("correo_eletronico"));
            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE ESTA CLAVE");
            }

        } catch (SQLException e) {
            System.err.print(e);
        }
    }

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarClave;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIrAVentana3;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolverAVentana1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel1;
    private javax.swing.JTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}
