/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Ricardo Chaves
 */
public class Validador {
    // 1. Verificar duplicados en el cartón
    public static boolean verificarDuplicados(int[][] matriz) {
        HashSet<Integer> usados = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = matriz[i][j];
                if (num == 0) continue;
                if (!usados.add(num)) return false;
            }
        }
        return true;
    }
    
    // 2. Validar rango según la columna
    public static boolean validarRangoColumna(int columna, int numero) {
        return switch (columna) {
            case 0 -> numero >= 1 && numero <= 15;
            case 1 -> numero >= 16 && numero <= 30;
            case 2 -> numero >= 31 && numero <= 45;
            case 3 -> numero >= 46 && numero <= 60;
            case 4 -> numero >= 61 && numero <= 75;
            default -> false;
        };
    }
    
     // 3. Validar formato completo del cartón
    public static boolean validarFormatoCarton(int[][] matriz) {
        if (!verificarDuplicados(matriz)) return false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero = matriz[i][j];
                if (numero == 0) continue;
                if (!validarRangoColumna(j, numero)) return false;
            }
        }
        return true;
    }
}
