/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Repositorio;

import Modelo.Tombolas.Tombola;

/**
 *
 * @author Marisol Alfaro
 */
public class RepositorioTombola {
    private Tombola tombolaActual;

    public RepositorioTombola() {
        this.tombolaActual = new Tombola();
    }
    
    public Tombola obtenerTombola() {
        return tombolaActual;
    }
    
    public void reiniciarTombola(){
        this.tombolaActual = new Tombola();
    }
}
