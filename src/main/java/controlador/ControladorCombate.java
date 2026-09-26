/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Personaje;
import modelo.Ranger;
import vista.vistaCombate;
import modelo.Paladin;

/**
 *
 * @author JUAN CARLOS
 */
public class ControladorCombate {

    public ControladorCombate(Personaje[] grupo, vistaCombate vista) {
        this.grupo = grupo;
        this.vista = vista;
    }
    
    // EL CONTROLADOR DEBE TENER las referencias
    //al modelo pero en un arreglo
    // y tambien a la vista
    private Personaje[] grupo;
    private vistaCombate vista;
    //logica de coordinación
     public void ejecutarRonda(){
     vista.mostrarInicioDeCombate();
     //polimorfismo
     for (Personaje p:grupo){
     String accion = p.realizarAtaque();
     vista.mostrarAtaque(p.getNombre(), accion);
     }
     }
     

}
