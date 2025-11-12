/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.Strategy.ReglaVictoria;

/**
 *
 * @author Ricardo Chaves
 */
public class ServicioStrategy {
    private ReglaVictoria estrategiaActual;
    
    public ServicioStrategy(ReglaVictoria estrategiaInicial) {
        this.estrategiaActual = estrategiaInicial;
    }
    
    public void cambiarEstrategia(ReglaVictoria nuevaRegla) {
        this.estrategiaActual = nuevaRegla;
    }
    
    public String obtenerNombreEstrategia() {
        return estrategiaActual.getNombreRegla();
    }
    
    public ReglaVictoria getEstrategiaActual() {
        return estrategiaActual;
    }
}
