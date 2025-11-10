/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Strategy;

import Modelo.Cartones.CartonBingo;

/**
 *
 * @author Ricardo Chaves
 */
public class CuatroEsquinas implements ReglaVictoria{

    @Override
    public boolean esGanador(CartonBingo carton) {
        boolean[][] marcados = carton.getMarcados();

        if(marcados[0][0] && marcados[0][4] && marcados[4][0] && marcados[4][4]){
            return true;
        }
        return false;
    }

    @Override
    public String getNombreRegla() {
        return "Ganaste con cuatri esquinas.";
    }
    
}
