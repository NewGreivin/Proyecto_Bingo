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
public class VictoriaNormal implements ReglaVictoria {

    @Override
    public boolean esGanador(CartonBingo carton) {
        //Forma horizontal
        boolean[][] marcados = carton.getMarcados();
        
        for (int i = 0; i < 5; i++) {
            boolean filacompleta = true;
            for (int j = 0; j < 5; j++) {
                if(!marcados[i][j]) filacompleta = false;
            }
            if(filacompleta) return true;
        }
        
        //Forma Vertical
        for (int j = 0; j < 5; j++) {
            boolean columnacompleta = true;
            for (int i = 0; i < 5; i++) {
                if(!marcados[i][j]) columnacompleta = false;
            }
            if(columnacompleta) return true;
        }
        
        //Formato Cuatro Esquinas
        boolean esquinaSuperiorIzq = marcados[0][0];
        boolean esquinaSuperiorDer = marcados[0][4];
        boolean esquinaInferiorIzq = marcados[4][0];
        boolean esquinaInferiorDer = marcados[4][4];
        
        // Si las cuatro esquinas están marcadas, gana también
        if (esquinaSuperiorIzq && esquinaSuperiorDer && esquinaInferiorIzq && esquinaInferiorDer) {
        return true;
        }
        
        //Forma Diagonal
        boolean diagonalPrincipal = true, diagonalSecundaria = true;
        for (int i = 0; i < 5; i++) {
            if (!marcados[i][i]) diagonalPrincipal = false;
            if (!marcados[i][4 - i]) diagonalSecundaria = false;
        }
        return diagonalPrincipal || diagonalSecundaria;
 
    }

    @Override
    public String getNombreRegla() {
        return "Has ganado.";
    }
    
        @Override
    public String getTipoVictoriaEspecifico(CartonBingo carton) {
        boolean[][] marcados = carton.getMarcados();
        
        // Verificar Horizontal
        for (int i = 0; i < 5; i++) {
            boolean filacompleta = true;
            for (int j = 0; j < 5; j++) {
                if(!marcados[i][j]) filacompleta = false;
            }
            if(filacompleta) return "Horizontal";
        }
        
        // Verificar Vertical
        for (int j = 0; j < 5; j++) {
            boolean columnacompleta = true;
            for (int i = 0; i < 5; i++) {
                if(!marcados[i][j]) columnacompleta = false;
            }
            if(columnacompleta) return "Vertical";
        }
        
        // Verificar Diagonal Principal
        boolean diagonalPrincipal = true;
        for (int i = 0; i < 5; i++) {
            if (!marcados[i][i]) diagonalPrincipal = false;
        }
        if(diagonalPrincipal) return "Diagonal Principal";
        
        // Verificar Diagonal Secundaria
        boolean diagonalSecundaria = true;
        for (int i = 0; i < 5; i++) {
            if (!marcados[i][4 - i]) diagonalSecundaria = false;
        }
        if(diagonalSecundaria) return "Diagonal Secundaria";
        
        // Verificar Cuatro Esquinas
        boolean esquinaSuperiorIzq = marcados[0][0];
        boolean esquinaSuperiorDer = marcados[0][4];
        boolean esquinaInferiorIzq = marcados[4][0];
        boolean esquinaInferiorDer = marcados[4][4];
        
        if (esquinaSuperiorIzq && esquinaSuperiorDer && esquinaInferiorIzq && esquinaInferiorDer) {
            return "Cuatro Esquinas";
        }
        
        return "Victoria Normal";
    }
}
