/**
 * @author Greivin
 */
package Modelo.Tableros;

public class TableroNumeros {
    private boolean[] numerosMarcados;

    public boolean[] getNumerosMarcados(int numero) {
         validarRango(numero);
        return numerosMarcados;
    }

    public void setNumerosMarcados(int numero) {
         validarRango(numero);
        this.numerosMarcados[numero] = true;
    }

    public void reiniciarTablero() {
        for (int i = 1; i <= 75; i++) {
            numerosMarcados[i] = false;
        }
    }

    public boolean[] obtenerEstadoTablero() { return numerosMarcados.clone(); }

    private void validarRango(int numero) {
        if (numero < 1 || numero > 75) {
            throw new IllegalArgumentException("Número fuera de rango (1-75): " + numero);
        }
    }
        public TableroNumeros() {
        numerosMarcados = new boolean[76];
        reiniciarTablero();
    }
}
