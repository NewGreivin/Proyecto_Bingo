/**
 * @author Greivin
 */
package Modelo.Facate;

import Modelo.Servicios.ServicioCarton;
import Modelo.Servicios.ServicioTablero;
import Modelo.Servicios.ServicioStrategy;
import Modelo.Servicios.ServicioTombola;

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
}
