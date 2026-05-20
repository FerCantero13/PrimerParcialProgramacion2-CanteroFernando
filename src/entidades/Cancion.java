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
public class Cancion extends Contenido implements Publicitable{
    private GeneroMusical generoMusical;
    private CalidadAudio calidadAudio;

    public Cancion(String titulo, int duracion, Artista artista, GeneroMusical generoMusical, CalidadAudio calidadAudio) {
        super(titulo, duracion, artista);
        this.generoMusical = generoMusical;
        this.calidadAudio = calidadAudio;
    }

    @Override
    public int getDuracionConPublicidad() {
        switch (this.calidadAudio) {
            case BAJA -> {
                return super.duracion + 30;
            }
            case MEDIA -> {
                return super.duracion + 20;
            } 
            case ALTA -> {
                return super.duracion;
            }
        }
        return super.duracion;
    }

    @Override
    public String toString() {
        return "Cancion" + super.mostrar(this) + ", generoMusical=" + generoMusical + ", calidadAudio=" + calidadAudio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.generoMusical);
        hash = 53 * hash + Objects.hashCode(this.calidadAudio);
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
        final Cancion other = (Cancion) obj;
        if (this.generoMusical != other.generoMusical) {
            return false;
        }
        return this.calidadAudio == other.calidadAudio;
    }
    
    
}

