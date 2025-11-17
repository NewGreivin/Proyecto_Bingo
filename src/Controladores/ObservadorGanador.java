
package Controladores;

import GUI.Vistas.DlgResultados;
import GUI.Vistas.PnlVisualizacionCartones;
import Modelo.Cartones.CartonBingo;
import Modelo.Facate.ServiciosFacate;
import Modelo.Tombolas.TombolaObserver;
import java.awt.Frame;
import javax.swing.SwingUtilities;

public class ObservadorGanador implements TombolaObserver {
    private Frame frameParent;
    private PnlVisualizacionCartones pnlVisualizacionCartones;
    public ObservadorGanador(Frame frameParent, PnlVisualizacionCartones pnlVisualizacionCartones) {
        this.frameParent = frameParent;
        this.pnlVisualizacionCartones = pnlVisualizacionCartones;
    }
    
    @Override
    public void actualizarNumero(int numero) {
        for (CartonBingo carton : ServiciosFacate.getInstancia().getServicioCarton().obtenerCartones()) {
            if (carton.contieneNumero(numero)) {
                if (ServiciosFacate.getInstancia().getServicioStrategy().esGanador(carton)) {
                   String tipoVictoria = ServiciosFacate.getInstancia().getServicioStrategy().obtenerNombreEstrategia();
                    carton.limpiarNumerosNoGanadores(tipoVictoria);
                    limpiarCartonesNoGanadores(carton);
                    refrescarCartones();
                    mostrarGanador(carton, tipoVictoria);
                }
            }
        }
    }
        
    private void limpiarCartonesNoGanadores(CartonBingo cartonGanador) {
        for (CartonBingo carton : ServiciosFacate.getInstancia().getServicioCarton().obtenerCartones()) {
            if (!carton.getId().equals(cartonGanador.getId())) {
                carton.reiniciarCarton();
            }
        }
    }
    private void refrescarCartones() {
        SwingUtilities.invokeLater(() -> {
            if (pnlVisualizacionCartones != null) {
                pnlVisualizacionCartones.refrescarTodosLosCartones();
            }
        });
    }
    private void mostrarGanador(CartonBingo carton, String tipoVictoria) {
        SwingUtilities.invokeLater(() -> {
            DlgResultados dlg = new DlgResultados(frameParent, true);
            dlg.setCartonGanador(carton.getId());
            dlg.setTipoVictoria(tipoVictoria);
            dlg.setLocationRelativeTo(frameParent);
            dlg.setVisible(true);
        });
    }
}
