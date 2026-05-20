/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
public class BibliotecaStreaming {
    private int capacidad;
    private Collection<Contenido> contenidos;

    public BibliotecaStreaming() {
        this.capacidad = 3;
        this.contenidos = new ArrayList<>();
    }
    
    public BibliotecaStreaming(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public boolean sonIguales(Contenido c) {
        if(c == null) {
            return false;
        }
        return this.contenidos.contains(c);
    }
    
    public void agregar(Contenido c) {
        if (c == null) {
            System.out.println("Esta vacio");
        }
        this.contenidos.add(c);
    }
    
    public int getDuracionContenido(TipoContenido tipoContenido) {
        switch (tipoContenido) {
            case CANCIONES:
                return this.capacidad;
        }
        return 0;
    }
    
    public int getDuracionCanciones() {
        int acumulador = 0;
        
        for (Contenido c : this.contenidos) {
            if(c instanceof Cancion) {
                Cancion estaCancion = (Cancion) c;
                acumulador += estaCancion.getDuracionConPublicidad();
                }
            }
        return acumulador;
        }
    public int getDuracionPodcasts() {
        int acumulador = 0;
        
        for (Contenido c : this.contenidos) {
            if(c instanceof Podcast) {
                Podcast estePodcast = (Podcast) c;
                acumulador += estePodcast.getDuracionConPublicidad();
                }
            }
        return acumulador;
    }
    public int getDuracionTotal() {
        int acumulador = 0;
        
        for (Contenido c : this.contenidos) {
            if(c instanceof Cancion) {
                Cancion estaCancion = (Cancion) c;
                acumulador += estaCancion.getDuracionConPublicidad();
                } else if (c instanceof Podcast) {
                Podcast estePodcast = (Podcast) c;
                acumulador += estePodcast.getDuracionConPublicidad();
                }
            }
        return acumulador;  
    }
    
//    public void ordenar() {
//        Collections.sort(this.contenidos);
//    }

    @Override
    public String toString() {
        return "BibliotecaStreaming{" + "capacidad=" + capacidad + ", contenidos=" + contenidos + '}';
    }
    
    
}
