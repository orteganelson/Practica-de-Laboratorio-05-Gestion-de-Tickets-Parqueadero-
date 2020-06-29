/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.ClienteDao;
import ec.edu.ups.dao.TicketDao;
import ec.edu.ups.dao.VehiculoDao;
import java.util.Locale;
import java.util.ResourceBundle;
import sun.security.tools.keytool.Resources;
/**
 *
 * @author Usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Locale localizacion;
    private ResourceBundle recurso;

    private ClienteDao clienteDao;
    private VehiculoDao vehiculoDao;
    private TicketDao ticketDao;

    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;

    private VentanaRegistrarCliente ventanaRegistrarCliente;
    private VentanaRegistrarVehiculo ventanaRegistrarVehiculo;
    private VentanaRegistrarTicket ventanaRegistrarTicket;
    private VentanaSalidaTicket ventanaSalidaTicket;

    private VentanaListarTickets ventanaListarTickets;
    private VentanaListarClientes ventanaListarClientes;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        clienteDao = new ClienteDao();
        vehiculoDao = new VehiculoDao();
        ticketDao = new TicketDao();

        controladorCliente = new ControladorCliente(clienteDao, vehiculoDao, ticketDao);
        controladorVehiculo = new ControladorVehiculo(vehiculoDao);
        controladorTicket = new ControladorTicket(clienteDao, vehiculoDao, ticketDao);

        ventanaRegistrarCliente = new VentanaRegistrarCliente(controladorCliente);
        ventanaRegistrarVehiculo = new VentanaRegistrarVehiculo(controladorCliente, controladorVehiculo,
                ventanaRegistrarCliente);
        ventanaRegistrarTicket = new VentanaRegistrarTicket(controladorTicket, controladorCliente,
                controladorVehiculo, ventanaRegistrarVehiculo, ventanaRegistrarCliente);
        ventanaSalidaTicket = new VentanaSalidaTicket(controladorTicket, controladorVehiculo,
                controladorCliente);

        ventanaListarTickets = new VentanaListarTickets(controladorCliente, controladorVehiculo,
                controladorTicket);
        ventanaListarClientes = new VentanaListarClientes(controladorCliente);

        desktopPane.add(ventanaRegistrarCliente);
        desktopPane.add(ventanaRegistrarTicket);
        desktopPane.add(ventanaRegistrarVehiculo);
        desktopPane.add(ventanaSalidaTicket);
        desktopPane.add(ventanaListarTickets);
        desktopPane.add(ventanaListarClientes);
        
    }
    
    public void cerrarVentanas() {
        ventanaRegistrarCliente.setVisible(false);
        ventanaRegistrarTicket.setVisible(false);
        ventanaRegistrarVehiculo.setVisible(false);
        ventanaSalidaTicket.setVisible(false);
        ventanaListarTickets.setVisible(false);
        ventanaListarClientes.setVisible(false);

    }

    public void cambiarIdioma(String idioma, String localidad) {
        //
        localizacion = new Locale(idioma, localidad);
        recurso = ResourceBundle.getBundle("ec.ups.edu.idioma.mensaje", localizacion);

        this.setTitle(recurso.getString("ventanaPrincipal"));
        //JmenuInicio
        menuInicio.setText(recurso.getString("menuInicio"));
        //JmenuItems de el JmenuInicio
        menuItemRegistrarCliente.setText(recurso.getString("registrarCliente"));
        menuItemRegistrarVehiculo.setText(recurso.getString("registrarVehiculo"));
        menuItemEmitirTicket.setText(recurso.getString("emitirTicket"));
        menuItemSalidaTicket.setText(recurso.getString("salidaTicket"));
        menuItemExit.setText(recurso.getString("salida"));

        //JmenuListar
        menuListar.setText(recurso.getString("menuListar"));
        //JmenuItems de el JmenuListar
        menuItemListarClientes.setText(recurso.getString("listarClientes"));
       // menuItemListarVehiculos.setText(recurso.getString("listarVehiculos"));
        menuItemListarTickets.setText(recurso.getString("listarTickets"));

        //JmenuIdiomas
        menuIdiomas.setText(recurso.getString("menuIdiomas"));
        //JmenusItem de el JmenuIdiomas
        menuItemIdiomasEspañol.setText(recurso.getString("español"));
        menuItemIdiomasIngles.setText(recurso.getString("ingles"));
        ventanaRegistrarVehiculo.setTitle(recurso.getString("tituloCliente"));

        //ventana listar clientes
        if (ventanaListarClientes != null) {
            ventanaListarClientes.setRecurso(recurso);
            ventanaListarClientes.setLocalizacion(localizacion);
            ventanaListarClientes.cambiarIdioma(idioma, localidad);
        }

        //ventanan listar Ticket
        if (ventanaListarTickets != null) {
            ventanaListarTickets.setRecurso(recurso);
            ventanaListarTickets.setLocalizacion(localizacion);
            ventanaListarTickets.cambiarIdioma(idioma, localidad);
        }

        // ventana registrar cliente
        if (ventanaRegistrarCliente != null) {
            ventanaRegistrarCliente.setRecurso(recurso);
            ventanaRegistrarCliente.setLocalizacion(localizacion);
            ventanaRegistrarCliente.cambiarIdioma(idioma, localidad);
        }

         //ventana registrar Ticket
        if (ventanaRegistrarTicket != null) {
            ventanaRegistrarTicket.setRecurso(recurso);
            ventanaRegistrarTicket.setLocalizacion(localizacion);
            ventanaRegistrarTicket.cambiarIdioma(idioma, localidad);
        }

        //Ventana Registrar Vehiculo
        if (ventanaRegistrarVehiculo != null) {
            ventanaRegistrarVehiculo.setRecurso(recurso);
            ventanaRegistrarVehiculo.setLocalizacion(localizacion);
            ventanaRegistrarVehiculo.cambiarIdioma(idioma, localidad);
        }

        //ventana  salida de ticket
        if (ventanaSalidaTicket != null) {
            ventanaSalidaTicket.setRecurso(recurso);
            ventanaSalidaTicket.setLocalizacion(localizacion);
            ventanaSalidaTicket.cambiarIdioma(idioma, localidad);
        }

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuItemRegistrarCliente = new javax.swing.JMenuItem();
        menuItemRegistrarVehiculo = new javax.swing.JMenuItem();
        menuItemEmitirTicket = new javax.swing.JMenuItem();
        menuItemSalidaTicket = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenu();
        menuItemListarClientes = new javax.swing.JMenuItem();
        menuItemListarTickets = new javax.swing.JMenuItem();
        menuIdiomas = new javax.swing.JMenu();
        menuItemIdiomasEspañol = new javax.swing.JMenuItem();
        menuItemIdiomasIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuInicio.setText("Inicio");

        menuItemRegistrarCliente.setText("RegistrarCliente");
        menuItemRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarClienteActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemRegistrarCliente);

        menuItemRegistrarVehiculo.setText("RegistrarVehículo");
        menuItemRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarVehiculoActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemRegistrarVehiculo);

        menuItemEmitirTicket.setText("EmitirTicket");
        menuItemEmitirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmitirTicketActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemEmitirTicket);

        menuItemSalidaTicket.setText("SalidaTicket");
        menuItemSalidaTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalidaTicketActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemSalidaTicket);

        menuItemExit.setText("Salir");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemExit);

        menuBar.add(menuInicio);

        menuListar.setText("Listar");

        menuItemListarClientes.setText("Clientes");
        menuItemListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarClientesActionPerformed(evt);
            }
        });
        menuListar.add(menuItemListarClientes);

        menuItemListarTickets.setText("Tickets");
        menuItemListarTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarTicketsActionPerformed(evt);
            }
        });
        menuListar.add(menuItemListarTickets);

        menuBar.add(menuListar);

        menuIdiomas.setText("Idioma");

        menuItemIdiomasEspañol.setText("Español");
        menuItemIdiomasEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomasEspañolActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemIdiomasEspañol);

        menuItemIdiomasIngles.setText("Inglés");
        menuItemIdiomasIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomasInglesActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemIdiomasIngles);

        menuBar.add(menuIdiomas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarVehiculoActionPerformed
       cerrarVentanas();
        ventanaRegistrarVehiculo.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarVehiculoActionPerformed

    private void menuItemRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarClienteActionPerformed
        cerrarVentanas();
        ventanaRegistrarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarClienteActionPerformed

    private void menuItemEmitirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmitirTicketActionPerformed
        cerrarVentanas();
        ventanaRegistrarTicket.setVisible(true);
    }//GEN-LAST:event_menuItemEmitirTicketActionPerformed

    private void menuItemSalidaTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalidaTicketActionPerformed
        cerrarVentanas();
        ventanaSalidaTicket.setVisible(true);
    }//GEN-LAST:event_menuItemSalidaTicketActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarClientesActionPerformed
        cerrarVentanas();
        ventanaListarClientes.setVisible(true);
    }//GEN-LAST:event_menuItemListarClientesActionPerformed

    private void menuItemListarTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarTicketsActionPerformed
        cerrarVentanas();
        ventanaListarTickets.setVisible(true);
    }//GEN-LAST:event_menuItemListarTicketsActionPerformed

    private void menuItemIdiomasEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomasEspañolActionPerformed
       this.cambiarIdioma("es", "EC");
    }//GEN-LAST:event_menuItemIdiomasEspañolActionPerformed

    private void menuItemIdiomasInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomasInglesActionPerformed
        this.cambiarIdioma("en", "UK");
    }//GEN-LAST:event_menuItemIdiomasInglesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuIdiomas;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuItemEmitirTicket;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemIdiomasEspañol;
    private javax.swing.JMenuItem menuItemIdiomasIngles;
    private javax.swing.JMenuItem menuItemListarClientes;
    private javax.swing.JMenuItem menuItemListarTickets;
    private javax.swing.JMenuItem menuItemRegistrarCliente;
    private javax.swing.JMenuItem menuItemRegistrarVehiculo;
    private javax.swing.JMenuItem menuItemSalidaTicket;
    private javax.swing.JMenu menuListar;
    // End of variables declaration//GEN-END:variables
}
