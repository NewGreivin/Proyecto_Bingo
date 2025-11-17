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
    private ServicioCarton servicioCarton;

    public ServicioTombola() {
        this.repositorio = new RepositorioTombola();
        this.servicioCarton = null;
    }

    public void setServicioCarton(ServicioCarton servicioCarton) {
        this.servicioCarton = servicioCarton;
    }

    public boolean ingresarManual(int numero) {
        Tombola tombola = repositorio.obtenerTombola();
        int resultado = tombola.ingresarNumeroManual(numero, tombola.getNumerosDisponibles());
        if (resultado != -1) {
            tombola.setUltimoNumero(resultado);
            marcarNumeroEnCartones(resultado);
            tombola.notificarNumero(resultado, tombola.getObservadores());
            return true;
        }
        return false;
    }

    public int generarAutomatico() {
        Tombola tombola = repositorio.obtenerTombola();
        int numero = tombola.generarNumeroAutom(tombola.getNumerosDisponibles());
        if (numero != -1) {
            tombola.setUltimoNumero(numero);
            marcarNumeroEnCartones(numero);
            tombola.notificarNumero(numero, tombola.getObservadores());
            return numero;
        }
        return -1;
    }
    private void marcarNumeroEnCartones(int numero) {
        if (servicioCarton != null) {
            servicioCarton.marcarNumero(numero);
        }
    }
    public void reiniciarTombola() {
        repositorio.reiniciarTombola();
    }

    public int obtenerUltimoNumero() {
        Tombola tombola = repositorio.obtenerTombola();
        return tombola.getUltimoNumero();
    }

    public void agregarObserver(TombolaObserver observer) {
        Tombola tombola = repositorio.obtenerTombola();
        tombola.agregarObserver(observer);
    }
}

