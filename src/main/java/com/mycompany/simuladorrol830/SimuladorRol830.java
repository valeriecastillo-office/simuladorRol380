/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.simuladorrol830;

import modelo.*;
import vista.vistaCombate;
import controlador.ControladorCombate;

/**
 *
 * @author JUAN CARLOS
 */
public class SimuladorRol830 {

    public static void main(String[] args) {
        System.out.println("simulador DND");
        //inicializar
        Personaje explorador = new Ranger("david", 14);
        Personaje guerrero = new Paladin("valerie", 17);
        Personaje profesor = new Personaje("edwin", 10);
        
        Personaje[] miGrupo = {explorador, guerrero, profesor};
        vistaCombate mivista = new vistaCombate();
        // inicializamos el controlador(inyectar el modelo y vista)
        ControladorCombate controlador = new ControladorCombate(miGrupo, mivista);
        // la logica de la cordinacciómn
        controlador.ejecutarRonda();
    }
}
