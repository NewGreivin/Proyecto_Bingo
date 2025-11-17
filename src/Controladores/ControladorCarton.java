/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import GUI.Vistas.PnlCarton;
import Modelo.Cartones.CartonBingo;
import Modelo.Facate.ServiciosFacate;
import Modelo.Servicios.ServicioStrategy;

import java.util.Collection;

/**
 *
 * @author Ricardo Chaves
 */
public class ControladorCarton {
    private ServiciosFacate servicio;
    private ServicioStrategy servios;
    private PnlCarton vista;

    public ControladorCarton() {
        this.servicio = ServiciosFacate.getInstancia();
    }
    
    public CartonBingo CrearCarton(boolean automatico, int[][] valores){
        CartonBingo nuevo = servicio.getServicioCarton().crearCarton(automatico, valores);
        if (nuevo == null){
            throw new IllegalArgumentException("No se pudo crear el carton");
        } 
        return nuevo;
    }
    
    public void eliminarCarton(String id){
            servicio.getServicioCarton().eliminarCarton(id);
    }
    
    public void marcarNumero(int numero){
        for (CartonBingo carton : servicio.getServicioCarton().obtenerCartones()) {
            if (carton.contieneNumero(numero)) {
                carton.marcarNumero(numero);
                
                if(servios.esGanador(carton)){
                vista.mostrarGanador(carton, servios.obtenerNombreEstrategia());
                }
            }
        }
    }
    
    public Collection<CartonBingo> obtenerCartones() {
        return servicio.getServicioCarton().obtenerCartones();
    }
}
