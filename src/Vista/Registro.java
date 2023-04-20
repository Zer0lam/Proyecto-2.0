/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;


/**
 *
 * @author betty
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        TextPrompt nombre = new TextPrompt("Ingrese su nombre", txtNombreR);
        TextPrompt apellido = new TextPrompt("Ingrese su apellido", txtApellidoR);
        TextPrompt contraseña = new TextPrompt("Ingrese su contraseña", txtContrasenaR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContrasenaR = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtArea = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 168, 155));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(219, 238, 235));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setText("¡Bienvenido!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        txtNombreR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombreR.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 404, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        txtApellidoR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtApellidoR.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoRActionPerformed(evt);
            }
        });
        jPanel3.add(txtApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 404, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Área");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        txtContrasenaR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContrasenaR.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasenaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaRActionPerformed(evt);
            }
        });
        jPanel3.add(txtContrasenaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 404, 30));

        btnContinuar.setBackground(new java.awt.Color(76, 168, 155));
        btnContinuar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Registrar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel3.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 260, 40));

        btnVolver.setBackground(new java.awt.Color(76, 168, 155));
        btnVolver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel3.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 90, 30));

        txtArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Gerente", "Cajero", "Limpieza", "Vendedor" }));
        jPanel3.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 400, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 46, 670, 460));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRActionPerformed

    private void txtApellidoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoRActionPerformed

    private void txtContrasenaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaRActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        FRMMenu menu = new FRMMenu();
        this.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnContinuar;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtApellidoR;
    public javax.swing.JComboBox<String> txtArea;
    public javax.swing.JTextField txtContrasenaR;
    public javax.swing.JTextField txtNombreR;
    // End of variables declaration//GEN-END:variables
}
