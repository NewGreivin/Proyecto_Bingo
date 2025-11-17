package Controladores;

import Modelo.Facate.ServiciosFacate;
import Modelo.ModoJuego.SeleccionModoJuego;
import Modelo.Tombolas.TombolaObserver;

/**
 *
 * @author Marisol Alfaro
 */
public class ControladorTombola {
    private final ServiciosFacate facate;
    private SeleccionModoJuego modoJuego;

    public ControladorTombola() {
        this.facate = ServiciosFacate.getInstancia();
        this.modoJuego = null;
    }

    public void establecerModoJuego(SeleccionModoJuego modoJuego) {
        this.modoJuego = modoJuego;
    }
    
    public SeleccionModoJuego obtenerModoJuego() {
        return modoJuego;
    }
    
    public boolean esAutomatico() {
        if (modoJuego == null) {
            return false;
        }
        return modoJuego.isAutomatico();
    }
 
    public String obtenerTipoVictoria() {
        if (modoJuego == null) {
            return "Victoria Normal";
        }
        return modoJuego.getTipoVictoria();
    }
     
    public void generarNumero(){
        facate.getServicioTombola().generarAutomatico();
    }
    
    public void ingresarNumeroManual(int numero){
        boolean exito = facate.getServicioTombola().ingresarManual(numero);
        if(!exito){
            throw new IllegalArgumentException("El numero ingresado ya fue usado");
        }
    }
    
    public int ObtenerUltNumero(){
        Integer ultimo = facate.getServicioTombola().obtenerUltimoNumero();
        if(ultimo == null) {
            return -1;
        }
        return ultimo;
    }
    
    public void agregarObserver(TombolaObserver observer) {
        facate.getServicioTombola().agregarObserver(observer);
    }
}
