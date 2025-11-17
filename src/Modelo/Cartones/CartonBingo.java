/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cartones;

/**
 *
 * @author Ricardo Chaves
 */
public class CartonBingo {
    private int[][] numero;
    private boolean[][] marcados;
    private String id;

    public int[][] getNumero() {
        return numero;
    }

    public boolean[][] getMarcados() {
        return marcados;
    }

    public String getId() {
        return id;
    }

    public void setNumero(int[][] numero) {
        this.numero = numero;
    }

    public void setMarcados(boolean[][] marcados) {
        this.marcados = marcados;
    }

    public CartonBingo(String id) {
        this.numero = new int[5][5];
        this.marcados = new boolean[5][5];
        this.id = id;
        
        this.marcados[2][2] = true;
    }
    
    public void setNumero(int fila, int columna, int valor){
        numero[fila][columna] = valor;
    }
    
    public void marcarNumero(int numeros){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numero[i][j] == numeros){
                    marcados[i][j] = true;
                }
            }
        }
    }
    
    public void desmarcarNumero(int numeros){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(numero[i][j]==numeros && !(i==2&&j==2)){
                    marcados[i][j]=false;
                }
            }
            
        }
    }
    
    public boolean estaMarcado(int fila, int columna){
        return marcados[fila][columna];
    }
    
    public boolean contieneNumero(int numeros){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(numero[i][j]==numeros){
                    return true;
                }
            }
        }
        return false;
    }
    
    public void reiniciarCarton(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                marcados[i][j] = false;
            }
        }
        marcados[2][2]=true;
    }
    
        public void limpiarNumerosNoGanadores(String tipoVictoria) {
        boolean[][] marcar = new boolean[5][5];
        
        switch (tipoVictoria) {
            case "Has ganado.":
            case "Victoria Normal":
                limpiarPorVictoriaNormal(marcar);
                break;
            case "Ganaste con cuatri esquinas.":
            case "Cuatro Esquinas":
                limpiarPorCuatroEsquinas(marcar);
                break;
            case "Gano con carton lleno":
            case "Carton Lleno":
                limpiarPorCartonLleno(marcar);
                break;
        }
        
        this.marcados = marcar;
    }
    
    private void limpiarPorVictoriaNormal(boolean[][] marcar) {
        // Buscar fila completa
        for (int i = 0; i < 5; i++) {
            boolean filacompleta = true;
            for (int j = 0; j < 5; j++) {
                if (!marcados[i][j]) filacompleta = false;
            }
            if (filacompleta) {
                for (int j = 0; j < 5; j++) {
                    marcar[i][j] = true;
                }
                return;
            }
        }
        
        // Buscar columna completa
        for (int j = 0; j < 5; j++) {
            boolean columnacompleta = true;
            for (int i = 0; i < 5; i++) {
                if (!marcados[i][j]) columnacompleta = false;
            }
            if (columnacompleta) {
                for (int i = 0; i < 5; i++) {
                    marcar[i][j] = true;
                }
                return;
            }
        }
        
        // Buscar diagonal principal
        boolean diagonalPrincipal = true;
        for (int i = 0; i < 5; i++) {
            if (!marcados[i][i]) diagonalPrincipal = false;
        }
        if (diagonalPrincipal) {
            for (int i = 0; i < 5; i++) {
                marcar[i][i] = true;
            }
            return;
        }
        
        // Buscar diagonal secundaria
        boolean diagonalSecundaria = true;
        for (int i = 0; i < 5; i++) {
            if (!marcados[i][4 - i]) diagonalSecundaria = false;
        }
        if (diagonalSecundaria) {
            for (int i = 0; i < 5; i++) {
                marcar[i][4 - i] = true;
            }
            return;
        }
        
        // Buscar cuatro esquinas
        if (marcados[0][0] && marcados[0][4] && marcados[4][0] && marcados[4][4]) {
            marcar[0][0] = true;
            marcar[0][4] = true;
            marcar[4][0] = true;
            marcar[4][4] = true;
            return;
        }
    }
    
    private void limpiarPorCuatroEsquinas(boolean[][] marcar) {
        marcar[0][0] = marcados[0][0];
        marcar[0][4] = marcados[0][4];
        marcar[4][0] = marcados[4][0];
        marcar[4][4] = marcados[4][4];
    }
    
    private void limpiarPorCartonLleno(boolean[][] marcar) {
        // Marcar todos excepto el centro
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    marcar[i][j] = true;
                } else {
                    marcar[i][j] = marcados[i][j];
                }
            }
        }
    }
}

