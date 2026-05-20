/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Podcast extends Contenido implements Publicitable{
    private TipoPodcast tipoPodcast;

    public Podcast(String titulo, int duracion, String nombre, String apellido, String paisArtista, TipoPodcast tipoPodcast) {
        super(titulo, duracion, nombre, apellido, paisArtista);
        this.tipoPodcast = tipoPodcast;
    }
    
    @Override
    public int getDuracionConPublicidad() {
        switch (this.tipoPodcast) {
            case TECNOLOGIA -> {
                return super.duracion + 60;
            }
            case ENTRETENIMIENTO -> {
                return super.duracion + 45;
            } 
            case EDUCACION -> {
                return super.duracion + 20;
            }
        }
        return super.duracion;
    }

    @Override
    public String toString() {
        return "Podcast: " + super.mostrar(this) + ", tipoPodcast:" + tipoPodcast;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.tipoPodcast);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Podcast other = (Podcast) obj;
        return this.tipoPodcast == other.tipoPodcast;
    }
    
    
}
