/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Strategy;

import Modelo.Cartones.CartonBingo;

/**
 *
 * @author Ricardo Chaves
 */
public interface ReglaVictoria {
    public boolean esGanador(CartonBingo carton);
    public String getNombreRegla();
    public String getTipoVictoriaEspecifico(CartonBingo carton);
}
