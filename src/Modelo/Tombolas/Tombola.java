/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Tombolas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Marisol Alfaro
 */
public class Tombola {
    private Set<Integer> numerosDisponibles;
    private Integer ultimoNumero;
    private List<TombolaObserver> observadores;

    public Tombola() {
        this.observadores = new ArrayList<>();
        reiniciarTombola();
    }
    
    public void reiniciarTombola(){ 
        this.numerosDisponibles = new HashSet<>();
        for(int i=1; i<=75; i++) {
            this.numerosDisponibles.add(i);
        }
        this.ultimoNumero = null;
    }
    
    public boolean ingresarNumeroManual(int numero) {
        if(!esNumeroDisponible(numero)) {
            return false;
        }
        numerosDisponibles.remove(numero);
        this.ultimoNumero = numero;
        notificarNumero(numero);
        return true;
    }
    
    public Optional<Integer> generarNumeroAutom() {
       if(numerosDisponibles.isEmpty()) {
           return Optional.empty();
       }
       List<Integer> lista = new ArrayList<>(numerosDisponibles);
       Random random = new Random();
       int numero = lista.get(random.nextInt(lista.size()));
       
       numerosDisponibles.remove(numero);
       this.ultimoNumero = numero;
       notificarNumero(numero);
       
       return Optional.of(numero);
    }
    
    public Integer obtenerUltNumero() {
        return ultimoNumero;
    }
    
    public boolean esNumeroDisponible(int numero){
        return numerosDisponibles.contains(numero);
    }
    
    public void agregarObserver(TombolaObserver obs){
        if(obs != null){
            this.observadores.add(obs);
        }
    }
    
    public void notificarNumero(int numero){
        for(TombolaObserver obs : observadores){
            obs.actualizarNumero(numero);
        }
    }
}
