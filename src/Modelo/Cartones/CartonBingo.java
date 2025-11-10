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
}

