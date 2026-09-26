/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JUAN CARLOS
 */
public class Ranger extends Personaje{
    
    public Ranger(String nombre, int constitucion){
        super(nombre, constitucion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }
    
    
    public String realizarAtaque(){
    return " dispara con una flecha letal desde las sombras";
    }
    
}
