package tablaCrud;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jtable extends javax.swing.JFrame {

    private Connection conet;
    DefaultTableModel modelo;
    private Statement st;
    private ResultSet rs;
    int idc;

    public Jtable() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("JTable");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("ID");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Edad;");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(txtApellido)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminiar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addGap(79, 79, 79)
                .addComponent(btnModificar)
                .addGap(92, 92, 92)
                .addComponent(btnEliminar)
                .addGap(96, 96, 96)
                .addComponent(btnNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
        consultar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono fila");
        } else {
            int idc = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());
            String nom = (String) Tabla.getValueAt(fila, 1);
            String ape = (String) Tabla.getValueAt(fila, 2);
            int edad = Integer.parseInt(Tabla.getValueAt(fila, 3).toString());

            txtId.setText(String.valueOf(idc));
            txtNombre.setText(nom);
            txtApellido.setText(ape);
            txtEdad.setText(String.valueOf(edad));
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        consultar();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        consultar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable().setVisible(true);
            }
        });
    }

    private void consultar() {
        String sql = "Select * from clientes";

        try (Connection conet = Conexion.getConnection();
                Statement st = conet.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            this.modelo = (DefaultTableModel) Tabla.getModel();
            // Limpiar la tabla antes de agregar nuevas filas
            this.modelo.setRowCount(0);
            while (rs.next()) {
                ArrayList<Object> cliente = new ArrayList<>();
                cliente.add(rs.getInt("id"));
                cliente.add(rs.getString("nombre"));
                cliente.add(rs.getString("apellido"));
                cliente.add(rs.getInt("edad"));
                this.modelo.addRow(cliente.toArray());
            }
            Tabla.setModel(modelo);
        } catch (Exception ex) {
            System.out.println("Error al consultar los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void Agregar() {
        String nom = txtNombre.getText();
        String ape = txtApellido.getText();
        String edad = txtEdad.getText();

        if (nom.equals("") || ape.equals("") || edad.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            limpiarTable();
            return;
        }

        // Verificar si el campo Edad es un número válido
        int comprobadoEdad;
        try {
            comprobadoEdad = Integer.parseInt(edad);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El campo Edad debe ser un número entero.");
            limpiarTable();
            return;
        }

        Connection conet = null;
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO clientes(nombre, apellido, edad) VALUES (?, ?, ?)";

            conet = Conexion.getConnection();
            if (conet == null) {
                throw new SQLException("No se pudo obtener la conexión.");
            }
            pst = conet.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, ape);
            pst.setInt(3, comprobadoEdad);
            int a = pst.executeUpdate();
            System.out.println("valor executeUpdate " + a);
            JOptionPane.showMessageDialog(null, "nuevo cliente agregado.");
            limpiarTable();
            limpiarCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conet != null) {
                    conet.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void Modificar() {
        // Validar que el campo ID no esté vacío
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo ID está vacío.");
            limpiarTable();
            return;
        }

        int idc;
        try {
            idc = Integer.parseInt(txtId.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El campo ID debe ser un número entero.");
            limpiarTable();
            return;
        }
        // Obtener y validar los demás campos
        String nom = txtNombre.getText();
        String ape = txtApellido.getText();
        String edad = txtEdad.getText();

        if (nom.equals("") || ape.equals("") || edad.equals("")) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            limpiarTable();
            return;
        }

        Connection conet = null;
        PreparedStatement pst = null;

        try {
            String sql = "update clientes set nombre=?,apellido=?,edad=? where id=?";
            conet = Conexion.getConnection();
            if (conet == null) {
                throw new SQLException("No se pudo obtener la conexion");
            }
            pst = conet.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, ape);
            pst.setInt(3, Integer.parseInt(edad));
            pst.setInt(4, idc);

            int a = pst.executeUpdate();
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con el ID especificado.");
            }
            limpiarTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conet != null) {
                    conet.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void eliminar() {
        int fila = Tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Cliente no seleccionado.");
            limpiarTable();
            return;
        }

        int valorId;
        try {
            valorId = Integer.parseInt(txtId.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El ID del cliente debe ser un número entero.");
            limpiarTable();
            return;
        }

        Connection conet = null;
        PreparedStatement pst = null;

        try {
            String sql = "delete from clientes where id=?";
            conet = Conexion.getConnection();
            if (conet == null) {
                throw new SQLException("No se pudo obtener la conexión.");
            }
            pst = conet.prepareStatement(sql);
            pst.setInt(1, valorId);
            int a = pst.executeUpdate();
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                 limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con el ID especificado.");
            }
            limpiarTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conet != null) {
                    conet.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
    
      private void nuevo() {
       txtId.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    txtEdad.setText("");
    txtApellido.requestFocus();
    }

    private void limpiarCampos() {
        txtId.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    txtEdad.setText("");
    }

    private void limpiarTable() {
        if (modelo != null) {
            int rowCount = modelo.getRowCount();
            if (rowCount > 0) {
                for (int i = rowCount - 1; i >= 0; i--) {
                    modelo.removeRow(i);
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

  

}
