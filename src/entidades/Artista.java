/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Artista {
    private String nombre;
    private String apellido;
    private String paisArtista;

    public Artista(String nombre, String apellido, String paisArtista) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisArtista = paisArtista;
        }
    
    public boolean sonIguales(Artista a1, Artista a2) {
        if(a1.getNombre().equals(a2.getNombre())) { 
            if(a1.getApellido().equals(a2.getApellido())){ 
                if (a1.paisArtista.equals(a2.paisArtista)) {
                    return true;
                }
            }
        }
        return false;
        }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getArtista() {
        return nombre + " " + apellido + " - " + paisArtista;
    }
}