package Controladores;

import Modelo.Servicios.ServicioTablero;
import Modelo.Tombolas.TombolaObserver;

public class ControladorTablero implements TombolaObserver {
    private final ServicioTablero servicioTablero;

    public ControladorTablero() {
        this.servicioTablero = new ServicioTablero();
    }

    @Override
    public void actualizarNumero(int numero) {
        try {
            servicioTablero.marcarNumero(numero);
        } catch (RuntimeException ex) {
            System.err.println("Error al actualizar tablero con número " + numero + ": " + ex.getMessage());
        }
    }

    public void marcarNumero(int numero) {
        servicioTablero.marcarNumero(numero);
    }

    public boolean[] obtenerEstado() {
        return servicioTablero.obtenerEstado();
    }

    public void reiniciarTablero() {
        servicioTablero.reiniciarTablero();
    }
}
