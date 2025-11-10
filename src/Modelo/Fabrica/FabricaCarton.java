/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Fabrica;

import Modelo.Cartones.CartonBingo;
import Utilidades.Validador;
import java.util.Random;

/**
 *
 * @author Ricardo Chaves
 */
public class FabricaCarton {
    private static final Random generador = new Random();
    
    public static CartonBingo crearCartonManual(String id, int[][] valores) {
        if (!Validador.validarFormatoCarton(valores)) {
            System.out.println("Hay numero repetidos o fuera de rango.");
            return null;
        }

        // Crear el cartón con los valores dados
        CartonBingo carton = new CartonBingo(id);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                carton.setNumero(i,j,valores[i][j]);
            }
        }
        
        System.out.println("Su carton fue creado.");
        return carton;
    }
    
    
    public static CartonBingo crearCartonAutomatico(String id){
        CartonBingo carton = new CartonBingo(id);
        int[][] numeros = new int[5][5];
        
        int[][] rangos = {
            {1, 15},
            {16, 30},
            {31, 45},
            {46, 60},
            {61, 75}
        };
        
        for (int col = 0; col < 5; col++) {
            boolean[] usados = new boolean[76];

            for (int fila = 0; fila < 5; fila++) {
                if (fila == 2 && col == 2) continue;
                int num;
                do {
                    num = generador.nextInt(rangos[col][1] - rangos[col][0] + 1) + rangos[col][0];
                } while (usados[num]);
                usados[num] = true;
                numeros[fila][col] = num;
                carton.setNumero(fila, col, num);
            }
        }

        System.out.println("Su carton fue creado.");
        return carton;
    }
}
