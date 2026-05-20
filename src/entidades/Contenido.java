/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Contenido implements Comparable<Contenido>{
    protected Artista artista;
    protected String titulo;
    protected int duracion;
    protected int likes;
    protected static Random generadorLikes;

    public Contenido(String titulo, int duracion, Artista artista) {
        this.artista = artista;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Contenido(String titulo, int duracion, String nombre, String apellido, String paisArtista) {
        this.artista = new Artista(nombre, apellido, paisArtista);
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    static {
        generadorLikes = new Random();
    }
    
    public int getLikes(){
        return this.likes = generadorLikes.nextInt(100000);
    }
    
    public String mostrar(Contenido c) {
        return c.artista.getArtista() + ", Titulo: " + c.titulo + ", Duracion: " +
                c.duracion + ", Likes: " + c.likes;
    }
    
    public boolean sonIguales(Contenido c1, Contenido c2) {
        if (c1 == null || c2 == null) {
            return false;
        }
        return c1.equals(c2);
    }

    @Override
    public String toString() {
        return "Contenido{" + "artista=" + artista + ", titulo=" + titulo + ", likes=" + likes + '}';
    }

    @Override
    public int compareTo(Contenido o) {
        int resultadoArtista = this.artista.getArtista().compareTo(o.artista.getArtista());
        if (resultadoArtista != 0) {
            return resultadoArtista;
        }
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.artista);
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + this.duracion;
        hash = 53 * hash + this.likes;
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
        final Contenido other = (Contenido) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (this.likes != other.likes) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }
    
    
     
}
