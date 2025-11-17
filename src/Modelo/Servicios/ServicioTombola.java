/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.Repositorio.RepositorioTombola;
import Modelo.Tombolas.Tombola;
import Modelo.Tombolas.TombolaObserver;

/**
 *
 * @author Marisol Alfaro
 */
public class ServicioTombola {
    private final RepositorioTombola repositorio;

    public ServicioTombola() {
        this.repositorio = new RepositorioTombola();
    }
    
    public boolean ingresarManual(int numero) {
        return repositorio.obtenerTombola().ingresarNumeroManual(numero);
    }
    
    public int generarAutomatico(){
        return repositorio.obtenerTombola().generarNumeroAutom().orElse(-1);
    }
    
    public void reiniciarTombola(){
        repositorio.reiniciarTombola();
    }
    
    public int obtenerUltimoNumero() {
        return repositorio.obtenerTombola().obtenerUltNumero();
    }

    public void agregarObserver(TombolaObserver obs) {
        repositorio.obtenerTombola().agregarObserver(obs);
    }
}
