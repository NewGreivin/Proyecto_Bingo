/**
 * @author Greivin
 */
package Modelo.Repositorio;

import Modelo.Estados.EstadoJuego;

public class RepositorioEstadoJuego {
    private EstadoJuego estado;

    public RepositorioEstadoJuego() {
        this.estado = EstadoJuego.getInstancia();
    }

    public EstadoJuego obtenerEstado() {
        return estado;
    }

    public void guardarEstado(EstadoJuego nuevoEstado) {
        if (nuevoEstado != null)
            this.estado = nuevoEstado;
    }
}
