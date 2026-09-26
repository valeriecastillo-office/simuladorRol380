/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JUAN CARLOS
 */
public class Paladin extends Personaje{
    public Paladin (String nombre, int constitucion){
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
    
    @Override
    public String realizarAtaque(){
    return "ataca con un martillo divino y hace un ataque radiante";
    }
}
    
