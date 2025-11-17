/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Facate.ServiciosFacate;
import Modelo.Tombolas.TombolaObserver;

/**
 *
 * @author Marisol Alfaro
 */
public class ControladorTombola {
    private final ServiciosFacate facate;

    public ControladorTombola() {
        this.facate = ServiciosFacate.getInstancia();
    }
    
    public void generarNumero(){
        facate.getServicioTombola().generarAutomatico();
    }
    
    public void ingresarNumeroManual(int numero){
        boolean exito = facate.getServicioTombola().ingresarManual(numero);
        if(!exito){
            throw new IllegalArgumentException("El numero ingresado ya fue usado");
        }
    }
    
    public int ObtenerUltNumero(){
        Integer ultimo = facate.getServicioTombola().obtenerUltimoNumero();
        if(ultimo == null) {
            return -1;
        }
        return ultimo;
    }
    
    public void agregarObserver(TombolaObserver observer) {
        facate.getServicioTombola().agregarObserver(observer);
    }
}
