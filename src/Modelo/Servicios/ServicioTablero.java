/**
 * @author Greivin
 */
package Modelo.Servicios;

import Modelo.Repositorio.RepositorioTablero;
import Modelo.Tableros.TableroNumeros;

public class ServicioTablero {
    private final RepositorioTablero repo;

    public void marcarNumero(int numero) {
        TableroNumeros tablero = repo.obtenerTablero();
        tablero.setNumerosMarcados(numero);
    }

    public void reiniciarTablero() {
        repo.reiniciarTablero();
    }

    public boolean[] obtenerEstado() {
        return repo.obtenerTablero().obtenerEstadoTablero();
    }

    public ServicioTablero(RepositorioTablero r) {
        this.repo = r;
    }
}
