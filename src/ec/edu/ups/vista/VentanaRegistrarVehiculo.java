/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaRegistrarVehiculo extends javax.swing.JInternalFrame {
    
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private VentanaRegistrarCliente ventanaRegistarCliente;

    private Locale localizacion;
    private ResourceBundle recurso;
    /**
     * Creates new form VentanaRegistrarVehiculo
     */
    public VentanaRegistrarVehiculo(ControladorCliente controladorCliente, ControladorVehiculo controladorVehiculo,
            VentanaRegistrarCliente ventanaRegistarCliente) {
        initComponents();
        this.controladorCliente = controladorCliente;
        this.controladorVehiculo = controladorVehiculo;

        this.ventanaRegistarCliente = ventanaRegistarCliente;
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
        this.setTitle(recurso.getString("ventanaRegistrarVehiculo"));
        labelDatosVehiculo.setText(recurso.getString("panelVehiculo"));
        labelCliente.setText(recurso.getString("panelCliente"));
        labelPlaca.setText(recurso.getString("labelPlaca"));
        labelMarca.setText(recurso.getString("labelMarca"));
        labelModelo.setText(recurso.getString("labelModelo"));
        labelCedula.setText(recurso.getString("labelCedula"));
        labelNombre.setText(recurso.getString("labelNombre"));
        labelTelefono.setText(recurso.getString("labelTelefono"));
        labelDireccion.setText(recurso.getString("labelDireccion"));
        btnAgregar.setText(recurso.getString("btnAgregar"));
        btnBuscar.setText(recurso.getString("btnBuscar"));
        btnAtras.setText(recurso.getString("btnAtras"));
    }

    public int cambiarJOption(String idioma, String localizacion) {

        int opcion = 0;
        if (idioma.equals("es")) {
            Object[] botones = {"Si", "No", "Cancelar"};
            opcion = JOptionPane.showOptionDialog(this, "Cliente no encontrado, "
                    + "¿Desea crear un nuevo cliente?", "Mensaje", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        } else {
            opcion = JOptionPane.showConfirmDialog(this, "Do you want to create a new customer?");
        }

        return opcion;
    }

    public void llenarTBLClientes() {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0);

        Set<Cliente> clientes = controladorCliente.findAll();
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            Object[] objeto = {c.getNombre(), c.getCedula(), c.getTelefono().getNumero(),
                c.getDireccion().toString()};
            modelo.addRow(objeto);
        }
        tblClientes.setModel(modelo);
    }

    public void llenartblClientesCliente(Cliente cliente) {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0);

        Object[] objeto = {cliente.getNombre(), cliente.getCedula(), cliente.getTelefono().getNumero(),
            cliente.getDireccion().toString()};
        modelo.addRow(objeto);
        tblClientes.setModel(modelo);
    }

 /*   public void cambiarJOptionPane1() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Llene el campo cedula para buscar un cliente");
        } else {
            JOptionPane.showMessageDialog(this, "Fill the field ID to search a customer");
        }

    }

    public void cambiarJOptionPane2() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Llene todos los requerimientos para crear un nuevo vehiculo");
        } else {
            JOptionPane.showMessageDialog(this, "Fill all the fields to create a new car");
        }

    }

    public void cambiarJOptionPane3() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "El vehiculo ya existe");
        } else {
            JOptionPane.showMessageDialog(this, "The car is already in the system");
        }

    }

    public void cambiarJOptionPane4() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Vehiculo creado con exito");
        } else {
            JOptionPane.showMessageDialog(this, "The car has been created with success");
        }

    }
    
      public void cambiarJOptionPane5() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para añadir el vehiculo");
        } else {
            JOptionPane.showMessageDialog(this, "Choose a customer to add the new car");
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

        labelDatosVehiculo = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        txtFormatedPlaca = new javax.swing.JFormattedTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        labelCliente = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        labelDatosVehiculo.setText("Información del Vehículo");

        labelPlaca.setText("Placa");

        labelMarca.setText("Marca");

        labelModelo.setText("Modelo");

        labelCliente.setText("Añadir a");

        labelCedula.setText("Cédula:");

        labelNombre.setText("Nombre:");

        labelTelefono.setText("Teléfono:");

        labelDireccion.setText("Dirección:");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(153, 153, 153));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(153, 153, 153));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(153, 153, 153));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cédula", "Teléfono", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelModelo)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(labelPlaca)
                                                    .addComponent(labelDatosVehiculo))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(82, 82, 82)
                                                    .addComponent(labelMarca))
                                                .addComponent(labelCliente))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelNombre)
                                            .addComponent(labelCedula)
                                            .addComponent(labelTelefono)
                                            .addComponent(labelDireccion))))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFormatedPlaca)
                                        .addComponent(txtMarca)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(txtCedula)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefono)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))))
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDatosVehiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPlaca)
                                    .addComponent(txtFormatedPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMarca)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelModelo)))
                        .addGap(24, 24, 24)
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String cedulas = txtCedula.getText();

        if (cedulas.isEmpty()) {
        //    cambiarJOptionPane1();
        } else {
            Cliente c = controladorCliente.buscarCliente(cedulas);
            if (c == null) {
                System.out.println(localizacion.getLanguage() + localizacion.getCountry());
                int opcion = cambiarJOption(localizacion.getLanguage(), localizacion.getCountry());
                /* if (localizacion.getDisplayLanguage().equals("es")) {
                    Object[] botones = {"Si", "No", "Cancelar"};
                    opcion = JOptionPane.showOptionDialog(this, "Cliente no encontrado, "
                            + "¿Desea crear un nuevo cliente?", "Mensaje", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                } else {
                    opcion = JOptionPane.showConfirmDialog(this, "Do you want to create a new customer?");
                }*/

                if (opcion == JOptionPane.YES_OPTION) {
                    ventanaRegistarCliente.setVisible(true);
                    this.hide();
                    //llenarTBLClientes();
                }
            } else if (c != null) {
                txtNombre.setText(c.getNombre());
                txtTelefono.setText(c.getTelefono().getNumero());
                txtDireccion.setText(c.getDireccion().toString());
                // llenartblClientesCliente(c);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String placas = txtFormatedPlaca.getText();
        String marcas = txtMarca.getText();
        String modelos = txtModelo.getText();
        String cedulas = txtCedula.getText();

        if (placas.isEmpty() || marcas.isEmpty() || modelos.isEmpty() || cedulas.isEmpty()) {
         //   cambiarJOptionPane2();
        } else {
            Cliente c = controladorCliente.buscarCliente(cedulas);
            if (c != null) {
                Vehiculo ve = controladorVehiculo.crearVehiculo(placas, marcas, modelos);
                System.out.println(ve);

                if (ve == null) {
                  //  cambiarJOptionPane3();
                } else {
                    controladorCliente.agregarVehiculo(ve, cedulas);
                  //  cambiarJOptionPane4();
                    limpiar();
                    this.hide();
                }
            } else {
                //cambiarJOptionPane5();
            }
            /*
            controladorCliente.agregarVehiculo(ve, cedulas);
            JOptionPane.showMessageDialog(this, "Vehículo creado con exito");
            this.hide();
            limpiar();*/
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        limpiar();
        this.hide();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        llenarTBLClientes();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");

        int index = tblClientes.getSelectedRow();

        String ced = tblClientes.getValueAt(index, 1).toString();

        Cliente c = controladorCliente.buscarCliente(ced);
        txtCedula.setText("");

        txtCedula.setText(tblClientes.getValueAt(index, 1).toString());
        txtNombre.setText(tblClientes.getValueAt(index, 0).toString());
        txtTelefono.setText(tblClientes.getValueAt(index, 2).toString());
        txtDireccion.setText(tblClientes.getValueAt(index, 3).toString());
    }//GEN-LAST:event_tblClientesMouseClicked
    public void limpiar() {

        txtFormatedPlaca.setValue("");
        txtMarca.setText("");
        txtModelo.setText("");

        txtCedula.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelDatosVehiculo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtFormatedPlaca;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
