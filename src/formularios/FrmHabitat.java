/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.Habitat;
import implementaciones.DAOSFactory;
import interfaces.IFachada;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class FrmHabitat extends javax.swing.JFrame {

    
    IFachada fachada = DAOSFactory.crearFachada();

    /**
     * Creates new form FrmHabitat
     */
    public FrmHabitat() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Direccion1 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboContinentes = new javax.swing.JComboBox<>();
        comboVegetacion = new javax.swing.JComboBox<>();
        comboClima = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 202, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(142, 202, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo de Vegetacion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 290, -1));

        btnVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Clima:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        Direccion1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Direccion1.setForeground(new java.awt.Color(0, 0, 0));
        Direccion1.setText("REGISTRO");
        jPanel2.add(Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        btnContinuar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel2.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Continente:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        comboContinentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Europa", "Oceanía", "África", "Asia", "América", "Antártida" }));
        comboContinentes.setToolTipText("");
        jPanel2.add(comboContinentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 116, -1));

        comboVegetacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bosque de coníferas", "Selva", "Pastizal" }));
        comboVegetacion.setToolTipText("");
        jPanel2.add(comboVegetacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 116, -1));

        comboClima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cálido ", "Templado", "Frío ", "Seco ", "Húmedo " }));
        jPanel2.add(comboClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 420, 420));

        jLabel1.setBackground(new java.awt.Color(2, 62, 138));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("              HABITAT  ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public void limpiarCampos(){
        txtNombre.setText("");
        comboClima.setSelectedIndex(0);
        comboContinentes.setSelectedIndex(0);
        comboVegetacion.setSelectedIndex(0);
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmPrincipal main = new FrmPrincipal();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public boolean agregarHabitat() {
        Habitat habitat = new Habitat();
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo nombre vacio...");
            return false;
        }
        if(comboContinentes.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Por favor selecciona un continente...");
            return false;
        }
        if(comboVegetacion.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vegetacion...");
            return false;
        }
        if (comboClima.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de clima...");
            return false;
        } else {
            habitat.setNombre(txtNombre.getText());
            habitat.setClima(comboClima.getSelectedItem().toString());
            habitat.setContinente(comboContinentes.getSelectedItem().toString());
            habitat.setTipoVegetacion(comboVegetacion.getSelectedItem().toString());
            fachada.agregarHabitat(habitat);
            return true;
        }
    }

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if(agregarHabitat() == true){
            JOptionPane.showMessageDialog(this, "Habitat Agregado...");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion1;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboClima;
    private javax.swing.JComboBox<String> comboContinentes;
    private javax.swing.JComboBox<String> comboVegetacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
