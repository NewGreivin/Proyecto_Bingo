/**
 * @author Greivin
 */
package Modelo.Repositorio;

import Modelo.Tableros.TableroNumeros;

public class RepositorioTablero {
    private TableroNumeros tableroActual;

    public RepositorioTablero() {
        tableroActual = new TableroNumeros();
    }

    public TableroNumeros obtenerTablero() {
        return tableroActual;
    }

    public void reiniciarTablero() {
        tableroActual.reiniciarTablero();
    }
}