
package Modelo.ModoJuego;

/**
 * @author Greivin
 */
public class SeleccionModoJuego {
    private boolean esAutomatico;
    private String tipoVictoria;

    public SeleccionModoJuego(boolean esAutomatico, String tipoVictoria) {
        this.esAutomatico = esAutomatico;
        this.tipoVictoria = tipoVictoria;
    }

    public boolean isAutomatico() {
        return esAutomatico;
    }

    public String getTipoVictoria() {
        return tipoVictoria;
    }

}
