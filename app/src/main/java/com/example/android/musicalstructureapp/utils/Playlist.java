package com.example.android.musicalstructureapp.utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mac on 7/16/2018.
 */
public class Playlist {
    private String nPlaylistName;
    private Song[] nSongs;

    public Playlist(String playlistName) {
        nPlaylistName = playlistName;
    }

    public Playlist(String playlistName, Song[] songs) {
        nPlaylistName = playlistName;
        nSongs = songs;
    }

    public String getPlaylistName() {
        return nPlaylistName;
    }

    public void setPlaylistName(String playlistName) {
        nPlaylistName = playlistName;
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
        return nPlaylistName;
    }
}