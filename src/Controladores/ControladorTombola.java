/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Tombolas.Tombola;

/**
 *
 * @author Marisol Alfaro
 */
public class ControladorTombola {
    private Tombola tombola;

    public ControladorTombola(Tombola tombola) {
        this.tombola = tombola;
    }
    
    public void generarNumero(){
        tombola.generarNumeroAutom();
    }
    
    public void ingresarNumeroManual(int numero){
        boolean exito = tombola.ingresarNumeroManual(numero);
        if(!exito){
            throw new IllegalArgumentException("El numero ingresado ya fue usado");
        }
    }
    
    public int ObtenerUltNumero(){
        Integer ultimo = tombola.obtenerUltNumero();
        if(ultimo == null) {
            return -1;
        }
        return ultimo;
    }
}
