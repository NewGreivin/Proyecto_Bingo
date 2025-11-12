/**
 * @author Greivin
 */
package Controladores;

import Modelo.Cartones.CartonBingo;
import Modelo.Servicios.ServicioJuego;
import java.util.NoSuchElementException;

public class ControladorJuego {
    private final ServicioJuego servicioJuego;

    public ControladorJuego() {
        this.servicioJuego = new ServicioJuego();
    }

    public void iniciarJuego() {
        if (servicioJuego == null) {
            throw new IllegalStateException("El servicio del juego no se inicializó correctamente.");
        }
    }

    public void aplicarNumero(int numero) {
        if (numero < 1 || numero > 75) {
            throw new IllegalArgumentException("Número fuera de rango: " + numero + " (válido 1–75)");
        }

        if (servicioJuego == null) {
            throw new IllegalStateException("No existen cartones activos en el juego.");
        }

        servicioJuego.aplicarNumero(numero);
    }

    public CartonBingo verificarGanador() {
        CartonBingo ganador = servicioJuego.verificarGanador();

        if (ganador == null) {
            throw new NoSuchElementException("Aún no hay ganador en esta partida.");
        }

        return ganador;
    }

    public void reiniciarJuego() {
        if (servicioJuego == null) {
            throw new IllegalStateException("No se puede reiniciar: el servicio no está disponible.");
        }

        servicioJuego.reiniciarJuego();
    }
}