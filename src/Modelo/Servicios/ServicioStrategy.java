/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.Cartones.CartonBingo;
import Modelo.Strategy.ReglaVictoria;
import Modelo.Strategy.VictoriaNormal;

/**
 *
 * @author Ricardo Chaves
 */
public class ServicioStrategy {
    private ReglaVictoria estrategiaActual;
    
    public ServicioStrategy() {
        this.estrategiaActual = new VictoriaNormal();
    }
    
    public ServicioStrategy(ReglaVictoria estrategiaInicial) {
        this.estrategiaActual = estrategiaInicial;
    }
    
    public void cambiarEstrategia(ReglaVictoria nuevaRegla) {
        this.estrategiaActual = nuevaRegla;
    }
    
    public String obtenerNombreEstrategia() {
        return estrategiaActual.getNombreRegla();
    }
    public String obtenerTipoVictoriaEspecifico(CartonBingo carton) {
        return estrategiaActual.getTipoVictoriaEspecifico(carton);
    }
    public ReglaVictoria getEstrategiaActual() {
        return estrategiaActual;
    }
    
    public boolean esGanador(CartonBingo carton) {
        return estrategiaActual.esGanador(carton);
    }
}
