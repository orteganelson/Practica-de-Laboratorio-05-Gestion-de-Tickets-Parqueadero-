/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDao;
import ec.edu.ups.dao.TicketDao;
import ec.edu.ups.dao.VehiculoDao;
import ec.edu.ups.idao.IClienteDao;
import ec.edu.ups.idao.ITicketDao;
import ec.edu.ups.idao.IVehiculoDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Direccion;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Set;
/**
 *
 * @author Usuario
 */
public class ControladorCliente {
    private Cliente cliente;
    private Vehiculo vehiculo;

    private IClienteDao clienteDao;
    private IVehiculoDao vehiculoDao;
    private ITicketDao ticketDao;
    
    public ControladorCliente(ClienteDao clienteDao, VehiculoDao vehiculoDao, TicketDao ticketDao) {
        this.clienteDao = clienteDao;
        this.vehiculoDao = vehiculoDao;
        this.ticketDao = ticketDao;
    }
    
    public boolean crearCliente(String cedula, String nombre, String tipo, String numeroT, String operadora,
            String calleP, String calleS, String numeroC) {

        Telefono tele = new Telefono(numeroT, tipo, operadora);
        Direccion dir = new Direccion(calleP, calleS, numeroC);

        cliente = new Cliente(cedula, nombre, tele, dir);
        if (clienteDao.create(cliente)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void agregarVehiculo(Vehiculo vehiculo, String cedulas) {
        // vehiculo = new Vehiculo(placa, marca, modelo);
        System.out.println("\n" + vehiculo);
        this.cliente = clienteDao.read(cedulas);
        // vehiculoDAO.create(vehiculo);
        if (cliente == null || vehiculo == null) {
            System.out.println(cliente);
        } else {
            cliente.agregarVehiculo(vehiculo);
            clienteDao.update(cliente);
            System.out.println(cliente);
            // System.out.println(cliente);
        }

    }
    
    public void actualizarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        
        vehiculoDao.update(vehiculo);
        cliente.actualizarVehiculo(vehiculo);
        clienteDao.update(cliente);
        System.out.println("\nactualizado:\n" + cliente);
    }

    public Cliente buscarCliente(String cedula) {
        cliente = clienteDao.read(cedula);
        System.out.println(cliente);
        return cliente;
    }

    public Cliente buscarPorVehiculo(String placa) {
        cliente = clienteDao.buscarPorVehiculo(placa);
        if (cliente == null) {
            return null;
        } else {
            return cliente;
        }
    }

    public Set<Cliente> findAll() {
        return clienteDao.findAll();
    }
    
}
