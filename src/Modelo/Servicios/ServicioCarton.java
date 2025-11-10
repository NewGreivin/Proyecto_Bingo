/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.Cartones.CartonBingo;
import Modelo.Fabrica.FabricaCarton;
import Modelo.Repositorio.RepositorioCarton;

/**
 *
 * @author Ricardo Chaves
 */
public class ServicioCarton {
    private final RepositorioCarton repo = RepositorioCarton.getInstancia();
    
    public CartonBingo crearCarton(boolean automatico, int valores[][]){
        
        String id = "C" + (repo.obtenerCartones().size() + 1);
        CartonBingo carton;
        
        if (automatico)
            carton = FabricaCarton.crearCartonAutomatico(id);
        else
            carton = FabricaCarton.crearCartonManual(id, valores);

        if (carton != null && Utilidades.Validador.validarFormatoCarton(carton.getNumero()))
            repo.agregarCarton(carton);

        return carton;
    }
    
    public void eliminarCarton(String id){
        repo.eliminarCarton(id);
    }
}