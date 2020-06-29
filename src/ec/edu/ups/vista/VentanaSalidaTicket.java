/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaSalidaTicket extends javax.swing.JInternalFrame {
    private Calendar fechaSalida;

    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;
    private ControladorCliente controladorCliente;

    private Locale localizacion;
    private ResourceBundle recurso;
    /**
     * Creates new form VentanaSalidaTicket
     */
    public VentanaSalidaTicket(ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo,
            ControladorCliente controladorCliente) {
        initComponents();
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
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
        this.setTitle(recurso.getString("tituloSalidaTicket"));
        labelEscribaNumeroTicked.setText(recurso.getString("labelEscribaNumeroTicked"));
        labelFechaDeEntrada.setText(recurso.getString("labelFechaDeEntrada"));
        labelFechaDeSalida.setText(recurso.getString("labelFechaDeSalida"));
        labelTotalParqueo.setText(recurso.getString("labelTiempoDeParqueo"));
        labelTotalPagar.setText(recurso.getString("labelTotalPagar"));
        btnBuscar.setText(recurso.getString("btnBuscar"));
        btnFactura.setText(recurso.getString("btnFactura"));
        btnLimpiar.setText(recurso.getString("btnLimpiar"));
        btnAtras.setText(recurso.getString("btnAtras"));
    }

    public void ponerFecha() {
        fechaSalida = Calendar.getInstance();
        txtFechaSalida.setText(fechaSalida.getTime().toString());
    }

    public void llenartblInformacion(Cliente cliente, Vehiculo vehiculo) {
        DefaultTableModel modelo = (DefaultTableModel) tblSalidaTicket.getModel();
        modelo.setRowCount(0);

        Object[] rowData = {cliente.getNombre(), cliente.getCedula(), vehiculo.getPlaca(),
            vehiculo.getMarca(), vehiculo.getModelo()};

        modelo.addRow(rowData);

        tblSalidaTicket.setModel(modelo);
    }

  /*  public void cambiarJOptionPane1() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Llene el campo requerido para buscar el ticket");
        } else {
            JOptionPane.showMessageDialog(this, "Fill the required field to search a ticket");
        }

    }

    public void cambiarJOptionPane2() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Ticket no encontrado, intentelo otra vez");
        } else {
            JOptionPane.showMessageDialog(this, "The ticket hasn't been found, try it again");
        }

    }
    
      public void cambiarJOptionPane3() {

        if (localizacion.getLanguage().equals("es")) {
            JOptionPane.showMessageDialog(this, "Factura emitida con exito");
        } else {
            JOptionPane.showMessageDialog(this, "The bill has been issued with success");
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

        labelEscribaNumeroTicked = new javax.swing.JLabel();
        labelFechaDeEntrada = new javax.swing.JLabel();
        labelFechaDeSalida = new javax.swing.JLabel();
        labelTotalParqueo = new javax.swing.JLabel();
        labelTotalPagar = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtFechaEntrada = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalidaTicket = new javax.swing.JTable();

        labelEscribaNumeroTicked.setText("Escriba el número del ticket:");

        labelFechaDeEntrada.setText("Fecha de entrada:");

        labelFechaDeSalida.setText("Fecha de salida:");

        labelTotalParqueo.setText("Tiempo de parqueo:");

        labelTotalPagar.setText("Total a pagar:");

        txtFechaEntrada.setEditable(false);
        txtFechaEntrada.setBackground(new java.awt.Color(153, 153, 153));

        txtFechaSalida.setEditable(false);
        txtFechaSalida.setBackground(new java.awt.Color(153, 153, 153));

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(153, 153, 153));
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });

        txtPago.setEditable(false);
        txtPago.setBackground(new java.awt.Color(153, 153, 153));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnFactura.setText("Emitir Factura");
        btnFactura.setEnabled(false);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblSalidaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Cédula", "Placa", "Marca", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalidaTicket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTotalPagar)
                                    .addComponent(labelTotalParqueo)
                                    .addComponent(labelFechaDeSalida)
                                    .addComponent(labelFechaDeEntrada)
                                    .addComponent(labelEscribaNumeroTicked))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtFechaEntrada)
                                    .addComponent(txtNumero)
                                    .addComponent(txtFechaSalida)
                                    .addComponent(txtTiempo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnBuscar)
                                .addGap(38, 38, 38)
                                .addComponent(btnFactura)
                                .addGap(50, 50, 50)
                                .addComponent(btnLimpiar)))
                        .addGap(105, 165, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscribaNumeroTicked)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaDeEntrada)
                    .addComponent(txtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaDeSalida)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalParqueo)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalPagar)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnFactura))
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String num = txtNumero.getText();

        if (num == null) {
          //  cambiarJOptionPane1();
        } else {
            int num2 = Integer.parseInt(num);
            Ticket t = controladorTicket.encontrarTicket(num2);
            if (t == null) {
             //   cambiarJOptionPane2();
            } else {
                txtFechaEntrada.setText(t.getFechaEntrada().toString());
                ponerFecha();

                Date fechaS = Calendar.getInstance().getTime();
                double tiempo = controladorTicket.calcularTiempo(t.getFechaEntrada(), fechaS);

                String totalTiempo = controladorTicket.calcularHorasMinutos(tiempo);
                txtTiempo.setText(totalTiempo);

                double pago = controladorTicket.calcularPago(tiempo);
                txtPago.setText(String.valueOf(pago));

                Vehiculo ve = controladorVehiculo.buscarPorTicket(t);
                Cliente c = controladorCliente.buscarPorVehiculo(ve.getPlaca());

                llenartblInformacion(c, ve);

                btnFactura.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        int nu = Integer.parseInt(txtNumero.getText());
        Date fechaS = Calendar.getInstance().getTime();
        double pago = Double.parseDouble(txtPago.getText());
        String tiempo = txtTiempo.getText();

        Ticket t = controladorTicket.encontrarTicket(nu);
        Vehiculo ve = controladorVehiculo.buscarPorTicket(t);

        Ticket ticket = controladorTicket.actualizarTicket(t, fechaS, pago, tiempo);

        ve = controladorVehiculo.actualizarVehiculo(ve, ticket);

        Cliente c = controladorCliente.buscarPorVehiculo(ve.getPlaca());

        controladorCliente.actualizarVehiculo(c, ve);

       // cambiarJOptionPane3();
        limpiar();
        this.hide();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        limpiar();
        this.hide();
    }//GEN-LAST:event_btnAtrasActionPerformed
   
    public void limpiar() {
        txtNumero.setText("");
        txtFechaEntrada.setText("");
        txtFechaSalida.setText("");
        txtPago.setText("");
        txtTiempo.setText("");

        DefaultTableModel modelo = (DefaultTableModel) tblSalidaTicket.getModel();
        modelo.setRowCount(0);
        tblSalidaTicket.setModel(modelo);

        btnFactura.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEscribaNumeroTicked;
    private javax.swing.JLabel labelFechaDeEntrada;
    private javax.swing.JLabel labelFechaDeSalida;
    private javax.swing.JLabel labelTotalPagar;
    private javax.swing.JLabel labelTotalParqueo;
    private javax.swing.JTable tblSalidaTicket;
    private javax.swing.JTextField txtFechaEntrada;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
