package com.example.android.musicalstructureapp.utils;

/**
 * Created by Mac on 7/16/2018.
 */
public class Song {
    private String nName;
    private String nArtist;
    private String nAlbum;
    private Playlist[] nPlaylist;

    public Song(String name, String artist, String album) {
        this.nName = name;
        this.nArtist = artist;
        this.nAlbum = album;
    }

    public Song(String name, String artist, String album, Playlist[] playlist) {
        this.nName = name;
        this.nArtist = artist;
        this.nAlbum = album;
        this.nPlaylist = playlist;
    }

    public String getName() {
        return nName;
    }

    public void setName(String name) {
        nName = name;
    }

    public String getArtist() {
        return nArtist;
    }

    public void setArtist(String artist) {
        nArtist = artist;
    }

    public String getAlbum() {
        return nAlbum;
    }

    public void setAlbum(String album) {
        nAlbum = album;
    }

    public Playlist[] getPlaylist() {
        return nPlaylist;
    }

    public void setPlaylist(Playlist[] playlist) {
        nPlaylist = playlist;
    }

    @Override
    public String toString() {
        return nName + " (by " + nArtist + " from " + nAlbum + ")";
    }
}
