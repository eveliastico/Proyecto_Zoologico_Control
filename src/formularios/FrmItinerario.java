/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.Empleado;
import Entidades.Guia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import interfaces.IFachada;
import Entidades.Itinerario;
import Entidades.Zona;
import implementaciones.DAOSFactory;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;
import validores.Validadores;
/**
 *
 * @author Jorge
 */
public class FrmItinerario extends javax.swing.JFrame {

    IFachada fachada = DAOSFactory.crearFachada();
    
    List<String> listaZonasAgregadas = new ArrayList<>();
    List<Empleado> listaGuiasAgregados = new ArrayList<>();
    List<ObjectId> listaGuiasIds = new ArrayList<>();
    Validadores validador = new Validadores();
    
    /**
     * Creates new form FrmEmpleado
     */
    public FrmItinerario() {
        initComponents();
        llenarTablaZonas();
        llenarTablaGuias();
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
        txtDuracion = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        Direccion = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumEspeciesVisitadas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumVisitantes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreItinerario = new javax.swing.JTextField();
        btnLimpiarCampos = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnA??adirZona = new javax.swing.JButton();
        btnRemoverZona = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblZonasAgregadas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblGuiasAgregados = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblZonasRegistradas = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblGuiasRegistrados = new javax.swing.JTable();
        btnA??adirGuia = new javax.swing.JButton();
        btnRemoverGuia = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 202, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(142, 202, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Duracion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        jPanel2.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 221, -1));

        btnVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Direccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Direccion.setText("Longitud:");
        jPanel2.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 221, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("# Especies visitadas:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel2.add(txtNumEspeciesVisitadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 221, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("# de visitantes:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel2.add(txtNumVisitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 221, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Guias Registrados:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 180, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre itinerario:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel2.add(txtNombreItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 220, -1));

        btnLimpiarCampos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        btnContinuar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnContinuar.setText("Registrar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel2.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 330, -1, -1));

        btnA??adirZona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnA??adirZona.setText("A??adir");
        btnA??adirZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA??adirZonaActionPerformed(evt);
            }
        });
        jPanel2.add(btnA??adirZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        btnRemoverZona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemoverZona.setText("Remover");
        btnRemoverZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverZonaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemoverZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        tblZonasAgregadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itinerario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblZonasAgregadas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 170, 210));

        tblGuiasAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Guia", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblGuiasAgregados);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, 260, 210));

        tblZonasRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Zonas Registradas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblZonasRegistradas);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 170, 210));

        tblGuiasRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Guia", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblGuiasRegistrados);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 260, 210));

        btnA??adirGuia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnA??adirGuia.setText("A??adir");
        btnA??adirGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA??adirGuiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnA??adirGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, -1, -1));

        btnRemoverGuia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemoverGuia.setText("Remover");
        btnRemoverGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverGuiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemoverGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Zonas");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 60, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Guias A??adido:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1370, 370));

        jLabel1.setBackground(new java.awt.Color(2, 62, 138));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("              ITINERARIO  ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public boolean registrarItinerario(){
        Itinerario itinerario = new Itinerario();
        if(validacionFloat() == false ||validacionInt() == false){
            JOptionPane.showMessageDialog(this, "Por favor ingresa el tipo de dato correcto...");
            return false;
        }
        if(tblGuiasAgregados.getRowCount() == 0 || tblZonasAgregadas.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Selecciona un campo de la tabla porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            if(txtDuracion.getText().isEmpty()||txtLongitud.getText().isEmpty()||
                txtNombreItinerario.getText().isEmpty()||
                txtNumEspeciesVisitadas.getText().isEmpty()||txtNumVisitantes.getText().isEmpty())   
        {
            JOptionPane.showMessageDialog(this, "Por favor llena todos los campos...");
            return false;
        }else{
            itinerario.setDuracion(Float.parseFloat(txtDuracion.getText()));
            itinerario.setLongitud(Float.parseFloat(txtLongitud.getText()));
            itinerario.setNombreItinerario(txtNombreItinerario.getText());
            itinerario.setNumEspecies(Integer.parseInt(txtNumEspeciesVisitadas.getText()));
            itinerario.setZonas(listaZonasAgregadas);
                for (int i = 0; i < listaGuiasAgregados.size(); i++) {
                    System.out.println("GUIAS: "+listaGuiasAgregados.get(i).getId()+"  Nombre"+listaGuiasAgregados.get(i).getNombre());
                }
            listaGuiasAgregados.forEach(guia -> {
                listaGuiasIds.add(guia.getId());
            }); 
            itinerario.setIdsGuias(listaGuiasIds);
            fachada.agregarItinerario(itinerario);
            return true;
            }
        }
    }
    
    public boolean validaFloat(String dato)throws NumberFormatException{
        try {
            Float.parseFloat(dato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validacionInt(){
        if(validador.validaEntero(txtNumVisitantes.getText())== false || validador.validaEntero(txtNumEspeciesVisitadas.getText()) == false){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validacionFloat(){
        if(validaFloat(txtDuracion.getText()) == false || validaFloat(txtLongitud.getText()) == false){
            JOptionPane.showMessageDialog(this, "Por favor ingresa el tipo de dato correcto...");
            return false;
        }else{
            return true;
        }
    }
    
    public void limpiarCampos(){
        txtDuracion.setText("");
        txtLongitud.setText("");
        txtNombreItinerario.setText("");
        txtNumEspeciesVisitadas.setText("");
        txtNumVisitantes.setText("");
        DefaultTableModel modelo1 = (DefaultTableModel) this.tblGuiasAgregados.getModel();
        modelo1.setColumnCount(2);
        modelo1.setRowCount(0);
        DefaultTableModel modelo2 = (DefaultTableModel) this.tblZonasAgregadas.getModel();
        modelo2.setColumnCount(1);
        modelo2.setRowCount(0);
        listaGuiasAgregados.clear();
        listaGuiasIds.clear();
        listaZonasAgregadas.clear();
        llenarTablaGuias();
        llenarTablaZonas();
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmPrincipal main = new FrmPrincipal();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void llenarTablaGuias(){
        List<Empleado> listaGuias = fachada.consultarGuias();
        DefaultTableModel modelo = (DefaultTableModel) this.tblGuiasRegistrados.getModel();
        modelo.setRowCount(0);
            listaGuias.forEach(guia -> {
            Object[] fila = new Object[2];
            fila[0] = guia.getId();
            fila[1] = guia.getNombre();
            modelo.addRow(fila);
        }); 
    }
    
    public void llenarTablaGuiasItinerario(){
        DefaultTableModel modelo = (DefaultTableModel) this.tblGuiasAgregados.getModel();
        modelo.setRowCount(0);
        listaGuiasAgregados.forEach(guias -> {
            Object[] fila = new Object[2];
            fila[0] = guias.getId();
            fila[1] = guias.getNombre();
            modelo.addRow(fila);
        }); 
    }
    
    public void llenarTablaZonas(){
        List<Zona> listaZonas = fachada.consultarZonas();
        DefaultTableModel modelo = (DefaultTableModel) this.tblZonasRegistradas.getModel();
        modelo.setRowCount(0);
        listaZonas.forEach(zonas -> {
            Object[] fila = new Object[1];
            fila[0] = zonas.getNombre();
            modelo.addRow(fila);
        }); 
    }
    
    public void llenarTablaZonasItinerario(){
        DefaultTableModel modelo = (DefaultTableModel) this.tblZonasAgregadas.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < listaZonasAgregadas.size(); i++) {
            String[] fila = new String[1];
            fila[0] = listaZonasAgregadas.get(i);
            modelo.addRow(fila);
        }
    }
    
    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if(registrarItinerario() == true){
//            fachada.agregarItinerario(itinerario);
            JOptionPane.showMessageDialog(this, "Itinerario Agregado");
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnA??adirZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA??adirZonaActionPerformed
        if(tblZonasRegistradas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecciona un campo de la tabla porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            DefaultTableModel modelo = (DefaultTableModel) this.tblZonasRegistradas.getModel();
            listaZonasAgregadas.add((String)tblZonasRegistradas.getValueAt(tblZonasRegistradas.getSelectedRow(), 0));
            modelo.removeRow(tblZonasRegistradas.getSelectedRow());
            llenarTablaZonasItinerario();
        }
        
    }//GEN-LAST:event_btnA??adirZonaActionPerformed

    private void btnRemoverZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverZonaActionPerformed
        if(tblZonasAgregadas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecciona un campo de la tabla Itinerario porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            DefaultTableModel modelo = (DefaultTableModel) this.tblZonasAgregadas.getModel();
            DefaultTableModel modelo2 = (DefaultTableModel) this.tblZonasRegistradas.getModel();
            Object[] fila = new Object[1];
            fila[0] = tblZonasAgregadas.getValueAt(tblZonasAgregadas.getSelectedRow(), 0);
            listaZonasAgregadas.remove((String)tblZonasAgregadas.getValueAt(tblZonasAgregadas.getSelectedRow(), 0));
            modelo.removeRow(tblZonasAgregadas.getSelectedRow());
            modelo2.addRow(fila);
            llenarTablaZonasItinerario(); 
        }
    }//GEN-LAST:event_btnRemoverZonaActionPerformed

    //METODO QUE AGREGA GUIAS A UNA LISTA DONDE SERAN A??ADIDOS A LA COLECCION.
    private void btnA??adirGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA??adirGuiaActionPerformed
        if(tblGuiasRegistrados.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecciona un campo de la tabla porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            DefaultTableModel modelo = (DefaultTableModel) this.tblGuiasRegistrados.getModel();
            Empleado empleado = new Empleado();
            empleado.setId((ObjectId)tblGuiasRegistrados.getValueAt(tblGuiasRegistrados.getSelectedRow(), 0));
            empleado.setNombre((String)tblGuiasRegistrados.getValueAt(tblGuiasRegistrados.getSelectedRow(), 1));
            listaGuiasAgregados.add(empleado);
            modelo.removeRow(tblGuiasRegistrados.getSelectedRow());
            llenarTablaGuiasItinerario();
        }
    }//GEN-LAST:event_btnA??adirGuiaActionPerformed

    private void btnRemoverGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverGuiaActionPerformed
        Empleado empleado = new Empleado();
        if(tblGuiasAgregados.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecciona un campo de la tabla Itinerario porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            DefaultTableModel modelo = (DefaultTableModel) this.tblGuiasAgregados.getModel();
            DefaultTableModel modelo2 = (DefaultTableModel) this.tblGuiasRegistrados.getModel();
            Object[] fila = new Object[2];
            empleado.setId((ObjectId)tblGuiasAgregados.getValueAt(tblGuiasAgregados.getSelectedRow(), 0));
            empleado.setNombre((String)tblGuiasAgregados.getValueAt(tblGuiasAgregados.getSelectedRow(), 1));
            listaGuiasAgregados.remove(empleado);
            System.out.println(listaGuiasAgregados.size());
            fila[0] = tblGuiasAgregados.getValueAt(tblGuiasAgregados.getSelectedRow(), 0);
            fila[1] = tblGuiasAgregados.getValueAt(tblGuiasAgregados.getSelectedRow(), 1);
            modelo.removeRow(tblGuiasAgregados.getSelectedRow());
            modelo2.addRow(fila);
            llenarTablaZonasItinerario(); 
        }
    }//GEN-LAST:event_btnRemoverGuiaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmItinerario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JButton btnA??adirGuia;
    private javax.swing.JButton btnA??adirZona;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnRemoverGuia;
    private javax.swing.JButton btnRemoverZona;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblGuiasAgregados;
    private javax.swing.JTable tblGuiasRegistrados;
    private javax.swing.JTable tblZonasAgregadas;
    private javax.swing.JTable tblZonasRegistradas;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtNombreItinerario;
    private javax.swing.JTextField txtNumEspeciesVisitadas;
    private javax.swing.JTextField txtNumVisitantes;
    // End of variables declaration//GEN-END:variables
}
