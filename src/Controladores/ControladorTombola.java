/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Servicios.ServicioTombola;
import Modelo.Tombolas.Tombola;
import Modelo.Tombolas.TombolaObserver;

/**
 *
 * @author Marisol Alfaro
 */
public class ControladorTombola {
    private ServicioTombola servicio;

    public ControladorTombola(Tombola tombola) {
        this.servicio = servicio;
    }
    
    public void generarNumero(){
        servicio.generarAutomatico();
    }
    
    public void ingresarNumeroManual(int numero){
        boolean exito = servicio.ingresarManual(numero);
        if(!exito){
            throw new IllegalArgumentException("El numero ingresado ya fue usado");
        }
    }
    
    public int ObtenerUltNumero(){
        return servicio.obtenerUltimoNumero();
    }
    
    public void agregarObserver(TombolaObserver obs){
        servicio.agregarObserver(obs);
    }
    
    public void reiniciarTombola(){
        servicio.reiniciarTombola();
    }
    
    public void agregarObserver(TombolaObserver observer) {
        tombola.agregarObserver(observer);
    }
}
