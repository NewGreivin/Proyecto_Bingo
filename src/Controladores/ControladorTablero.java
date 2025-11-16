package Controladores;

import Modelo.Facate.ServiciosFacate;
import Modelo.Tombolas.TombolaObserver;

public class ControladorTablero implements TombolaObserver {
    private final ServiciosFacate facate;

    public ControladorTablero() {
        this.facate = ServiciosFacate.getInstancia();
    }
    
    @Override
    public void actualizarNumero(int numero) { facate.getServicioTablero().marcarNumero(numero); }
    public boolean[] obtenerEstado() { return facate.getServicioTablero().obtenerEstado(); }
    public void reiniciarTablero() { facate.getServicioTablero().reiniciarTablero(); }
}
