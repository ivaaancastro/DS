package ej3;

import java.util.Objects;

public class Track {
    private String posicion;
    private String id_grabacion;
    private String artist;
    private String title;
    private int duracion;



    //Constructor
    public Track(String posicion, String id_grabacion, String artist, String title, int duracion) {
        this.posicion = posicion;
        this.id_grabacion = id_grabacion;
        this.artist = artist;
        this.title = title;
        this.duracion = duracion;

        //Lanzamiento de excepciones
        if (posicion == null) {
            throw new NullPointerException("La posición no puede ser nula.");
        }
        if (id_grabacion == null || id_grabacion.isEmpty()) {
            throw new IllegalArgumentException("El ID de grabación no puede ser nulo o estar vacío.");
        }
        if (artist == null || artist.isEmpty()) {
            throw new IllegalArgumentException("El artista no puede ser nulo o estar vacío.");
        }
        if (title == null) {
            throw new NullPointerException("El título no puede ser nulo.");
        }
        if (duracion < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa.");
        }
    }

    //Getters and Setters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        if (posicion == null || posicion.isEmpty()){
            throw new NullPointerException("La posición no puede ser null o estar vacía");
        }
        this.posicion = posicion;
    }

    public String getId_grabacion() {
        return id_grabacion;
    }

    public void setId_grabacion(String id_grabacion) {
        if (artist == null || artist.isEmpty()){
            throw new NullPointerException("El id_grabación no puede ser nulo o estar vacío");
        }
        this.id_grabacion = id_grabacion;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (artist == null || artist.isEmpty()){
            throw new NullPointerException("El artista no puede ser nulo o estar vacío");
        }
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()){
            throw new NullPointerException("El título no puede ser null o estar vacío");
        }
        this.title = title;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        }
        this.duracion = duracion;
    }


    // Otros métodos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posición: ").append(posicion).append("\n");
        sb.append("ID Grabación: ").append(id_grabacion).append("\n");
        sb.append("Artista: ").append(artist).append("\n");
        sb.append("Título: ").append(title).append("\n");
        sb.append("Duración: ").append(duracion).append("\n");


        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(id_grabacion, track.id_grabacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_grabacion);
    }
}
