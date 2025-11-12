/**
 * @author Greivin
 */
package Modelo.Estados;

import Modelo.Cartones.CartonBingo;
import Modelo.Strategy.ReglaVictoria;
import Modelo.Strategy.VictoriaNormal;
import Modelo.Tableros.TableroNumeros;
import Modelo.Tombolas.Tombola;
import java.util.ArrayList;
import java.util.List;

public class EstadoJuego {
    
    private static EstadoJuego instancia; // Singleton

    private List<CartonBingo> listaCartones;
    private Tombola tombola;
    private TableroNumeros tablero;
    private ReglaVictoria estrategiaActual;

    private boolean modoCreacionAutomatico;
    private boolean modoJuegoAutomatico;

    private EstadoJuego() {
        listaCartones = new ArrayList<>();
        tombola = new Tombola();
        tablero = new TableroNumeros();
        estrategiaActual = new VictoriaNormal();
        modoCreacionAutomatico = true;
        modoJuegoAutomatico = true;
    }

    public static EstadoJuego getInstancia() {
        if (instancia == null) {
            instancia = new EstadoJuego();
        }
        return instancia;
    }

    public void reiniciarJuego() {
        for (CartonBingo c : listaCartones) {
            c.reiniciarCarton();
        }
        tombola.reiniciarTombola();
        tablero.reiniciarTablero();
    }

    public List<CartonBingo> getListaCartones() { return listaCartones; }
    public void agregarCarton(CartonBingo c) { if (c != null) listaCartones.add(c); }
    public void eliminarCarton(String id) { listaCartones.removeIf(c -> c.getId().equals(id)); }

    public Tombola getTombola() { return tombola; }
    public TableroNumeros getTablero() { return tablero; }
    
    public ReglaVictoria getEstrategiaActual() { return estrategiaActual; }
    public void setEstrategiaActual(ReglaVictoria e) { this.estrategiaActual = e; }

    public boolean isModoCreacionAutomatico() { return modoCreacionAutomatico; }
    public void setModoCreacionAutomatico(boolean m) { this.modoCreacionAutomatico = m; }

    public boolean isModoJuegoAutomatico() { return modoJuegoAutomatico; }
    public void setModoJuegoAutomatico(boolean m) { this.modoJuegoAutomatico = m; }
}