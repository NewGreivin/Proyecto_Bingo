/**
 * @author Greivin
 */
package Modelo.Servicios;

import Modelo.Cartones.CartonBingo;
import Modelo.Estados.EstadoJuego;
import Modelo.Repositorio.RepositorioEstadoJuego;
import Modelo.Strategy.ReglaVictoria;

public class ServicioJuego {
    private final RepositorioEstadoJuego repo;

    public ServicioJuego() {
        this.repo = new RepositorioEstadoJuego();
    }

    public void aplicarNumero(int numero) {
        EstadoJuego estado = repo.obtenerEstado();

        estado.getTablero().setNumerosMarcados(numero); //Marcar en cada tablero

        for (CartonBingo c : estado.getListaCartones()) { //Marcar en el cada carton
            c.marcarNumero(numero);
        }
    }

    public CartonBingo verificarGanador() {
        EstadoJuego estado = repo.obtenerEstado();
        ReglaVictoria regla = estado.getEstrategiaActual();

        for (CartonBingo c : estado.getListaCartones()) {
            if (regla.esGanador(c)) {
                return c;
            }
        }
        return null;
    }

    public void reiniciarJuego() {
        repo.obtenerEstado().reiniciarJuego();
    }
}
