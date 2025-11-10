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
public class CartonLleno implements ReglaVictoria{

    @Override
    public boolean esGanador(CartonBingo carton) {
        boolean[][] marcado = carton.getMarcados();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) continue;
                if(marcado[i][j]==false){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String getNombreRegla() {
        return "Gano con carton lleno";
    }
    
}
