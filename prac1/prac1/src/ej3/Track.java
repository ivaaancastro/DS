package ej3;

import java.util.Objects;

public class Track {
    private String posicion;
    private String id_grabacion;
    private String artist;
    private String title;
    private double duracion;



    //Constructor
    public Track(String posicion, String id_grabacion, String artist, String title, double duracion) {
        this.posicion = posicion;
        this.id_grabacion = id_grabacion;
        this.artist = artist;
        this.title = title;
        this.duracion = duracion;
    }

    //Getters and Setters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getId_grabacion() {
        return id_grabacion;
    }

    public void setId_grabacion(String id_grabacion) {
        this.id_grabacion = id_grabacion;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }


    //Métodos
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
