/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.Repositorio.RepositorioTombola;
import Modelo.Tombolas.Tombola;

/**
 *
 * @author Marisol Alfaro
 */
public class ServicioTombola {
    private RepositorioTombola repositorio;

    public ServicioTombola(RepositorioTombola repositorio) {
        this.repositorio = repositorio;
    }
    
    public boolean ingresarManual(int numero) {
        Tombola tombola = repositorio.obtenerTombola();
        return tombola.ingresarNumeroManual(numero);
    }
    
    public int generarAutomatico(){
        Tombola tombola = repositorio.obtenerTombola();
        return tombola.generarNumeroAutom().orElse(-1);
    }
    
    public void reiniciarTombola(){
        repositorio.reiniciarTombola();
    }
}
