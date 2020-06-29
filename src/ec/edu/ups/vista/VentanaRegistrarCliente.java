/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VentanaRegistrarCliente extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private List<String> operadoras;
    private Locale localizacion;
    private ResourceBundle recurso;
    
    /**
     * Creates new form VentanaRegistarCliente
     *
     * @param controladorCliente
     */
    public VentanaRegistrarCliente(ControladorCliente controladorCliente) {
        initComponents();
        cargarDatosOperadora();
        formatearNumeroCasa();
        
        this.controladorCliente = controladorCliente;
    }
    
    public Locale getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Locale localizacion) {
        this.localizacion = localizacion;
    }

    public ResourceBundle getRecurso() {
        return recurso;
    }

    public void setRecurso(ResourceBundle recurso) {
        this.recurso = recurso;
    }

    public void cambiarIdioma(String idioma, String localizacion) {
        this.setTitle(recurso.getString("ventanaRegistrarCliente"));
        labelDatos.setText(recurso.getString("panelDatos"));
        labelTelefono.setText(recurso.getString("panelTelefono"));
        labelDireccion.setText(recurso.getString("panelDireccion"));
        labelNombre.setText(recurso.getString("labelNombre"));
        labelApellido.setText(recurso.getString("labelApellido"));
        labelCedula.setText(recurso.getString("labelCedula"));
        labelTipo.setText(recurso.getString("labelTipo"));
        labelNumero.setText(recurso.getString("labelNumero"));
        labelTelefonoOperadora.setText(recurso.getString("labelTelefonoOperadora"));
        labelCallePrincipal.setText(recurso.getString("labelCallePrincipal"));
        labelCalleSecundaria.setText(recurso.getString("labelCalleSecundaria"));
        btnCrear.setText(recurso.getString("btnCrear"));
        btnAtras.setText(recurso.getString("btnAtras"));

    }

    public void cargarDatosOperadora() {
        operadoras = new ArrayList<>();

        //operadoras.add("Seleccione");
        operadoras.add("Movistar");
        operadoras.add("Claro");
        operadoras.add("CNT");
        operadoras.add("Tuenti");
        operadoras.add("Etapa");

        cargarCBXOperadora();

    }

    public void cargarCBXOperadora() {

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbxOperadora.getModel();
        for (String opera : operadoras) {
            modelo.addElement(opera);
        }

    }

    public void formatearNumeroCasa() {
        try {
            txtFormattedNumeroCasa.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(
                            new javax.swing.text.MaskFormatter("##-###")
                    )
            );
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato del número de la casa erroneo");
            ex.printStackTrace();
        }

    }

   /* public void cambiarJOptionPane1() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Llene todos los requerimientos para crear un nuevo cliente");
        } else {
            JOptionPane.showMessageDialog(this, "Fill all the fields to create a new customer");
        }

    }

    public void cambiarJOptionPane2() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Cliente creado con exito");
        } else {
            JOptionPane.showMessageDialog(this, "The new customer has been registered with success");
        }

    }

    public void cambiarJOptionPane3() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "El cliente ya existe");
        } else {
            JOptionPane.showMessageDialog(this, "The customer is already in the sytem");
        }

    }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDatos = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelTelefonoOperadora = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtFormattedNumero = new javax.swing.JFormattedTextField();
        cbxOperadora = new javax.swing.JComboBox<>();
        labelDireccion = new javax.swing.JLabel();
        labelCallePrincipal = new javax.swing.JLabel();
        labelCalleSecundaria = new javax.swing.JLabel();
        labelDireccionNumero = new javax.swing.JLabel();
        txtCallePrincipal = new javax.swing.JTextField();
        txtCalleSecundaria = new javax.swing.JTextField();
        txtFormattedNumeroCasa = new javax.swing.JFormattedTextField();
        btnCrear = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        labelDatos.setText("Datos Cliente");

        labelNombre.setText("Nombre");

        labelApellido.setText("Apellido");

        labelCedula.setText("Cédula");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        labelTelefono.setText("Teléfono");

        labelTipo.setText("Tipo");

        labelNumero.setText("Número");

        labelTelefonoOperadora.setText("Operadora");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Casa", "Celular" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        labelDireccion.setText("Dirección");

        labelCallePrincipal.setText("CallePrincipal");

        labelCalleSecundaria.setText("Calle Secundaria");

        labelDireccionNumero.setText("Número");

        txtCalleSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleSecundariaActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefono)
                            .addComponent(labelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTelefonoOperadora)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelNombre)
                                                .addComponent(labelApellido)
                                                .addComponent(labelCedula))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelTipo)
                                                .addGap(4, 4, 4)))
                                        .addComponent(labelNumero))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccionNumero)
                                    .addComponent(labelCalleSecundaria)
                                    .addComponent(labelCallePrincipal))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCallePrincipal)
                            .addComponent(txtCalleSecundaria)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtCedula)
                                    .addComponent(cbxTipo, 0, 122, Short.MAX_VALUE)
                                    .addComponent(txtFormattedNumero)
                                    .addComponent(cbxOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFormattedNumeroCasa))))
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTelefono)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(txtFormattedNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefonoOperadora)
                    .addComponent(cbxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelDireccion)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCallePrincipal)
                    .addComponent(txtCallePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCalleSecundaria)
                    .addComponent(txtCalleSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionNumero)
                    .addComponent(txtFormattedNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnAtras)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCalleSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleSecundariaActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        try {
            String item = (String) cbxTipo.getSelectedItem();
            if (item.equals("Casa")) {
                txtFormattedNumero.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.MaskFormatter("(593)#-####-###")
                        )
                );

            } else if (item.equals("Celular")) {
                txtFormattedNumero.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.MaskFormatter("(593)###-###-###")
                        )
                );

            } else {
                txtFormattedNumero.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.MaskFormatter("(593)###-###-###")
                        )
                );
            }
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato del número del teléfono erroneo");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String tipo = cbxTipo.getSelectedItem().toString();
        String numeroT = txtFormattedNumero.getText();
        String operadora = cbxOperadora.getSelectedItem().toString();
        String calleP = txtCallePrincipal.getText();
        String calleS = txtCalleSecundaria.getText();
        String numeroC = txtFormattedNumeroCasa.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || tipo.equals("Seleccione") || numeroT.isEmpty()
                || operadora.isEmpty() || calleP.isEmpty() || calleS.isEmpty() || numeroC.isEmpty()) {
          //  cambiarJOptionPane1();
        } else {
            String nombreCompleto = nombre.concat(apellido);
            boolean verdad = controladorCliente.crearCliente(cedula, nombreCompleto,
                    tipo, numeroT, operadora, calleP, calleS, numeroC);
            if (verdad) {
             //   cambiarJOptionPane2();
                this.hide();
                limpiar();
            } else {
              //  cambiarJOptionPane3();
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.hide();
        limpiar();
    }//GEN-LAST:event_btnAtrasActionPerformed
    public void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        cbxTipo.setSelectedIndex(0);
        cbxOperadora.setSelectedIndex(0);
        txtFormattedNumero.setValue("");
        txtCallePrincipal.setText("");
        txtCalleSecundaria.setText("");
        txtFormattedNumeroCasa.setValue("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cbxOperadora;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCallePrincipal;
    private javax.swing.JLabel labelCalleSecundaria;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDireccionNumero;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelefonoOperadora;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCallePrincipal;
    private javax.swing.JTextField txtCalleSecundaria;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JFormattedTextField txtFormattedNumero;
    private javax.swing.JFormattedTextField txtFormattedNumeroCasa;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
