/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Repositorio;

import Modelo.Cartones.CartonBingo;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Ricardo Chaves
 */
public class RepositorioCarton {
    private HashMap<String, CartonBingo> cartones;
    
    public RepositorioCarton() {
        cartones = new HashMap<>();
    }
    
    public void agregarCarton(CartonBingo carton){
        cartones.put(carton.getId(), carton);
    }
    
    public void eliminarCarton(String id){
        if (cartones.containsKey(id)) {
            cartones.remove(id);
        }
    }
    
    public Collection<CartonBingo> obtenerCartones() {
        return cartones.values();
    }

} 
