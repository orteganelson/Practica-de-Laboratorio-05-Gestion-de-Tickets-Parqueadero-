/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.VehiculoDao;
import ec.edu.ups.idao.IVehiculoDao;
import ec.edu.ups.modelo.Vehiculo;
import ec.edu.ups.modelo.Ticket;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ControladorVehiculo {
    private Vehiculo vehiculo;
    private Ticket ticket;

    private IVehiculoDao vehiculoDao;

    public ControladorVehiculo(VehiculoDao vehiculoDao) {
        this.vehiculoDao = vehiculoDao;
    }

    public Vehiculo crearVehiculo(String placa, String marca, String modelo) {
        vehiculo = new Vehiculo(placa, marca, modelo);
        if (vehiculoDao.create(vehiculo)) {
            return vehiculo;
        }
        return null;
    }
    
    public Vehiculo actualizarVehiculo(Vehiculo vehiculo, Ticket ticket) {
        vehiculo.actualizarTicket(ticket);
        return vehiculo;
    }

    public Vehiculo buscarVehiculo(String placa) {

        vehiculo = vehiculoDao.read(placa);
        if (vehiculo == null) {
            return null;
        } else {
            return vehiculo;
        }
    }

    public Vehiculo buscarPorTicket(Ticket ticket) {
        Set<Vehiculo> vehiculos = vehiculoDao.findAll();
        Iterator<Vehiculo> it = vehiculos.iterator();
        while (it.hasNext()) {
            vehiculo = it.next();
            for (Ticket t : vehiculo.getListaTickets()) {
                if (t.getNumero() == ticket.getNumero()) {
                    return vehiculo;
                }
                break;
            }
        }
        return null;

    }
    
}
