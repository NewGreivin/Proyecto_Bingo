
package Controladores;

import GUI.Vistas.DlgResultados;
import Modelo.Cartones.CartonBingo;
import Modelo.Facate.ServiciosFacate;
import Modelo.Tombolas.TombolaObserver;
import java.awt.Frame;
import javax.swing.SwingUtilities;

public class ObservadorGanador implements TombolaObserver {
    private Frame frameParent;
    
    public ObservadorGanador(Frame frameParent) {
        this.frameParent = frameParent;
    }
    
    @Override
    public void actualizarNumero(int numero) {
        // Verificar si algún cartón ganó
        for (CartonBingo carton : ServiciosFacate.getInstancia().getServicioCarton().obtenerCartones()) {
            if (carton.contieneNumero(numero)) {
                // Verificar si este cartón es ganador
                if (ServiciosFacate.getInstancia().getServicioStrategy().esGanador(carton)) {
                    mostrarGanador(carton);
                }
            }
        }
    }
    
    private void mostrarGanador(CartonBingo carton) {
        SwingUtilities.invokeLater(() -> {
            DlgResultados dlg = new DlgResultados(frameParent, true);
            dlg.setCartonGanador(carton.getId());
            dlg.setTipoVictoria(ServiciosFacate.getInstancia().getServicioStrategy().obtenerNombreEstrategia());
            dlg.setVisible(true);
        });
    }
}
