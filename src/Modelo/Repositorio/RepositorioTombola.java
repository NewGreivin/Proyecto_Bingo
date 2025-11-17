/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Repositorio;

import Modelo.Tombolas.Tombola;
import Modelo.Tombolas.TombolaObserver;
import java.util.List;

/**
 *
 * @author Marisol Alfaro
 */
public class RepositorioTombola {
     private Tombola tombola;

    public RepositorioTombola() {
        this.tombola = new Tombola();
    }

    public Tombola obtenerTombola() {
        return tombola;
    }

    public List<int[]> obtenerNumerosDisponibles() {
        return tombola.getNumerosDisponibles();
    }

    public void establecerNumerosDisponibles(List<int[]> numeros) {
        tombola.setNumerosDisponibles(numeros);
    }

    public int obtenerUltimoNumero() {
        return tombola.getUltimoNumero();
    }

    public void establecerUltimoNumero(int numero) {
        tombola.setUltimoNumero(numero);
    }

    public List<TombolaObserver> obtenerObservadores() {
        return tombola.getObservadores();
    }

    public void agregarObserver(TombolaObserver obs) {
        tombola.agregarObserver(obs);
    }

    public void reiniciarTombola() {
        this.tombola.reiniciarTombola();
    }
}
