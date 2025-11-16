package Controladores;

import GUI.Vistas.PnlTablero;
import Modelo.Tombolas.TombolaObserver;

public class ControladorTablero implements TombolaObserver {
    private final ControladorJuego controladorJuego;
    private final ControladorTombola controladorTombola;
    private final PnlTablero pnlTablero;

    public ControladorTablero(ControladorJuego controladorJuego,
                              ControladorTombola controladorTombola,
                              PnlTablero pnlTablero) {
        this.controladorJuego = controladorJuego;
        this.controladorTombola = controladorTombola;
        this.pnlTablero = pnlTablero;

        // Se registra como observador de la tómbola
        this.controladorTombola.agregarObserver(this);
    }

    @Override
    public void actualizarNumero(int numero) {
        try {
            controladorJuego.aplicarNumero(numero);
            pnlTablero.marcarNumero(numero);
        } catch (RuntimeException ex) {
            System.err.println("Error al actualizar tablero con número " + numero + ": " + ex.getMessage());
        }
    }

    public void reiniciarJuegoCompleto() {
        controladorJuego.reiniciarJuego(); 
        pnlTablero.limpiarTablero();       
    }

}
