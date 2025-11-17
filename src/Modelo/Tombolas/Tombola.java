/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Tombolas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Marisol Alfaro
 */
public class Tombola {
    private List<int[]> numerosDisponibles;
    private int ultimoNumero;
    private List<TombolaObserver> observadores;

    public Tombola() {
        this.observadores = new ArrayList<>();
        reiniciarTombola();
    }

    public List<int[]> getNumerosDisponibles() {
        return numerosDisponibles;
    }

    public void setNumerosDisponibles(List<int[]> numerosDisponibles) {
        this.numerosDisponibles = numerosDisponibles;
    }

    public int getUltimoNumero() {
        return ultimoNumero;
    }

    public void setUltimoNumero(int ultimoNumero) {
        this.ultimoNumero = ultimoNumero;
    }

    public List<TombolaObserver> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<TombolaObserver> observadores) {
        this.observadores = observadores;
    }

    public boolean esNumeroDisponible(int numero, List<int[]> numerosDisponibles) {
        for (int[] num : numerosDisponibles) {
            if (num[0] == numero) {
                return true;
            }
        }
        return false;
    }

    public int ingresarNumeroManual(int numero, List<int[]> numerosDisponibles) {
        if (!esNumeroDisponible(numero, numerosDisponibles)) {
            return -1;
        }
        for (int i = 0; i < numerosDisponibles.size(); i++) {
            if (numerosDisponibles.get(i)[0] == numero) {
                numerosDisponibles.remove(i);
                break;
            }
        }
        return numero;
    }

    public int generarNumeroAutom(List<int[]> numerosDisponibles) {
        if (numerosDisponibles.isEmpty()) {
            return -1;
        }
        Random random = new Random();
        int indice = random.nextInt(numerosDisponibles.size());
        int numero = numerosDisponibles.get(indice)[0];
        
        numerosDisponibles.remove(indice);
        return numero;
    }

    public void notificarNumero(int numero, List<TombolaObserver> observadores) {
        for (TombolaObserver obs : observadores) {
            obs.actualizarNumero(numero);
        }
    }

    public List<int[]> inicializarNumeros() {
        List<int[]> numeros = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            numeros.add(new int[]{i});
        }
        return numeros;
    }


    public void reiniciarTombola() {
        this.numerosDisponibles = inicializarNumeros();
        this.ultimoNumero = -1;
    }

    public void agregarObserver(TombolaObserver obs) {
        if (obs != null) {
            this.observadores.add(obs);
        }
    }
}

