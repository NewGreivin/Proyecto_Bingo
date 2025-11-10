/**
 * @author Greivin
 */
package Modelo.Repositorio;

import Modelo.Tableros.TableroNumeros;

public class RepositorioTablero {

    private static RepositorioTablero instancia;
    private TableroNumeros tableroActual;

    private RepositorioTablero() {
        tableroActual = new TableroNumeros();
    }

    public static RepositorioTablero getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioTablero();
        }
        return instancia;
    }

    public TableroNumeros obtenerTablero() {
        return tableroActual;
    }

    public void reiniciarTablero() {
        tableroActual.reiniciarTablero();
    }
}