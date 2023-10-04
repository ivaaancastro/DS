package ej3;

import java.util.*;
import java.util.stream.Collectors;

public class Release {
    private String identificador;
     private String titulo;
     private String artista;
     private List<Track> trackList;

     //Constructor
    public Release(String identificador) {
        this.identificador = identificador;
        this.trackList = new ArrayList<>();
    }

    //Getters and Setters


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtist(String artista) {
        this.artista = artista;
    }

    public List<Track> getTracks() {
        return trackList;
    }

    public void addTrack(Track tracks) {
        trackList.add(tracks);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(identificador).append("\n");
        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Artista Principal: ").append(artista).append("\n");
        sb.append("Pistas:\n");
        for (Track track : trackList) {
            sb.append(" - Pista ").append(track.getPosicion()).append("-> Duración: ")
                    .append(track.getDuracion()).append(" min").append(", ID Grabación: ").append(track.getId_grabacion()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Release release = (Release) o;
        return areTracksEqual(release.trackList);
    }



    private boolean areTracksEqual(List<Track> otherTracks) {
        if (trackList == null && otherTracks == null) {
            return true;
        }
        if (trackList == null || otherTracks == null || trackList.size() != otherTracks.size()) {
            return false;
        }

        Set<String> thisTrackIds = new HashSet<>();
        for (Track track : trackList) {
            thisTrackIds.add(track.getId_grabacion());
        }

        Set<String> otherTrackIds = new HashSet<>();
        for (Track track : otherTracks) {
            otherTrackIds.add(track.getId_grabacion());
        }

        return thisTrackIds.equals(otherTrackIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackList.stream().map(Track::getId_grabacion).collect(Collectors.toSet()));
    }


    //Métodos adicionales
}
