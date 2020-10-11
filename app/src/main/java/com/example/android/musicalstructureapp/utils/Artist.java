package com.example.android.musicalstructureapp.utils;

/**
 * Created by Mac on 7/16/2018.
 */
public class Artist {
    private String nArtistName;
    private Song[] nSongs;
    private Album[] nAlbums;

    public Artist(String artistName, Song[] songs, Album[] albums) {
        nArtistName = artistName;
        nSongs = songs;
        nAlbums = albums;
    }

    public String getArtistName() {
        return nArtistName;
    }

    public void setArtistName(String artistName) {
        nArtistName = artistName;
    }

    public Song[] getSongs() {
        return nSongs;
    }

    public void setSongs(Song[] songs) {
        nSongs = songs;
    }

    public String[] getSongNames() {
        int len = nSongs.length;
        String[] songNames = new String[len];
        for (int i = 0; i < len; i++) {
            songNames[i] = nSongs[i].getName();
        }
        return songNames;
    }

    public Album[] getAlbums() {
        return nAlbums;
    }

    public void setAlbums(Album[] albums) {
        nAlbums = albums;
    }

    public String[] getAlbumNames() {
        int len = nAlbums.length;
        String[] albumNames = new String[len];
        for (int i = 0; i < len; i++) {
            albumNames[i] = nAlbums[i].getAlbumName();
        }
        return albumNames;
    }

    @Override
    public String toString() {
        return nArtistName;
    }
}

