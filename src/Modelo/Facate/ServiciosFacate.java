/**
 * @author Greivin
 * 
 * Fachada centralizada que gestiona todos los servicios
 * Proporciona un acceso único a la lógica del modelo desde cualquier interfaz gráfica
 */
package Modelo.Facate;

import Modelo.Cartones.CartonBingo;
import Modelo.Servicios.ServicioCarton;
import Modelo.Servicios.ServicioTablero;
import Modelo.Servicios.ServicioStrategy;
import Modelo.Servicios.ServicioTombola;
import Modelo.Strategy.ReglaVictoria;
import java.util.Collection;

public class ServiciosFacate {
    private static ServiciosFacate instancia;
    
    private final ServicioCarton servicioCarton;
    private final ServicioTablero servicioTablero;
    private final ServicioTombola servicioTombola;
    private final ServicioStrategy servicioStrategy;

    public ServicioCarton getServicioCarton() { return servicioCarton; }
    public ServicioTablero getServicioTablero() { return servicioTablero; }
    public ServicioTombola getServicioTombola() { return servicioTombola; }
    public ServicioStrategy getServicioStrategy() { return servicioStrategy; }

    private ServiciosFacate() {
        this.servicioCarton = new ServicioCarton();
        this.servicioTablero = new ServicioTablero();
        this.servicioTombola = new ServicioTombola();
        this.servicioStrategy = new ServicioStrategy();
    }

    public static ServiciosFacate getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosFacate();
        }
        return instancia;
    }

    // ==================== MÉTODOS PARA CARTONES ====================
    public CartonBingo crearCarton(boolean automatico, int[][] valores) {
        return servicioCarton.crearCarton(automatico, valores);
    }
    public void eliminarCarton(String id) {
        servicioCarton.eliminarCarton(id);
    }
    public Collection<CartonBingo> obtenerCartones() {
        return servicioCarton.obtenerCartones();
    }
    public void marcarNumeroEnCartones(int numero) {
        servicioCarton.marcarNumero(numero);
    }

    // ==================== MÉTODOS PARA TÓMBOLA ====================
    public int generarNumeroTombola() {
        return servicioTombola.generarAutomatico();
    }
    public boolean ingresarNumeroManual(int numero) {
        return servicioTombola.ingresarManual(numero);
    }
    public void reiniciarTombola() {
        servicioTombola.reiniciarTombola();
    }

    // ==================== MÉTODOS PARA TABLERO ====================
    public void marcarNumeroTablero(int numero) {
        servicioTablero.marcarNumero(numero);
    }
    public boolean[] obtenerEstadoTablero() {
        return servicioTablero.obtenerEstado();
    }
    public void reiniciarTablero() {
        servicioTablero.reiniciarTablero();
    }

    // ==================== MÉTODOS PARA ESTRATEGIA ====================
    public void cambiarEstrategia(ReglaVictoria nuevaRegla) {
        servicioStrategy.cambiarEstrategia(nuevaRegla);
    }
    public String obtenerNombreEstrategia() {
        return servicioStrategy.obtenerNombreEstrategia();
    }
    public boolean esGanador(CartonBingo carton) {
        return servicioStrategy.esGanador(carton);
    }
}
