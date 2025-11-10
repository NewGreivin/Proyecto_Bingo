/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Cartones.CartonBingo;
import Modelo.Servicios.ServicioCarton;

/**
 *
 * @author Ricardo Chaves
 */
public class ControladorCarton {
    private ServicioCarton servicio;

    public ControladorCarton() {
        this.servicio = new ServicioCarton();
    }
    
    public void CrearCarton(boolean automatico, int[][] valores){
        CartonBingo nuevo = servicio.crearCarton(automatico, valores);
        if (nuevo != null){

        } else {
            throw new IllegalArgumentException("No se pudo crear el carton");
        }
    }
    
    public void ingresarNumeroManual(String id){
            servicio.eliminarCarton(id);
    }
    
    public void marcarNumero(int numero){
        for (CartonBingo carton : servicio.obtenerCartones()) {
            if (carton.contieneNumero(numero)) {
                carton.marcarNumero(numero);
            }
        }
    }
}
