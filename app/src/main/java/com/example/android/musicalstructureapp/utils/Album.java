package com.example.android.musicalstructureapp.utils;

/**
 * Created by Mac on 7/16/2018.
 */
public class Album {
    private String nAlbumName;
    private Song[] nSongs;

    public Album(String albumName, Song[] songs) {
        nAlbumName = albumName;
        nSongs = songs;
    }

    public String getAlbumName() {
        return nAlbumName;
    }

    public void setAlbumName(String albumName) {
        nAlbumName = albumName;
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

    @Override
    public String toString() {
        return nAlbumName;
    }
}
