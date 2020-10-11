package com.example.android.musicalstructureapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.musicalstructureapp.activity.ViewerActivity;
import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.utils.Album;
import com.example.android.musicalstructureapp.utils.Song;

import java.util.ArrayList;

/**
 * Created by Mac on 7/16/2018.
 */
public class AlbumFragment extends Fragment {
    ArrayAdapter<Album> mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View album = inflater.inflate(R.layout.frag_album, container, false);

        final ArrayList<Album> items = new ArrayList<Album>();
        Song song1 = new Song(getString(R.string.song_1), getString(R.string.artist_1), getString(R.string.album_1));
        Song song2 = new Song(getString(R.string.song_2), getString(R.string.artist_2), getString(R.string.album_2));
        Song song3 = new Song(getString(R.string.song_3), getString(R.string.artist_1), getString(R.string.album_1));
        Song song4 = new Song(getString(R.string.song_4), getString(R.string.artist_2), getString(R.string.album_2));
        Album album1 = new Album(getString(R.string.album_1), new Song[]{song1, song3});
        Album album2 = new Album(getString(R.string.album_2), new Song[]{song2, song4});
        items.add(album1);
        items.add(album2);

        ListView listView = (ListView) album.findViewById(R.id.listView);

        mAdapter = new ArrayAdapter<Album>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                                                Intent intent = new Intent(getActivity(), ViewerActivity.class);
                                                intent.putExtra("album", items.get(position).getAlbumName());
                                                intent.putExtra("songs", items.get(position).getSongNames());
                                                intent.putExtra("fragment", "Album");
                                                startActivity(intent);
                                            }
                                        }
        );
        return album;
    }
}

