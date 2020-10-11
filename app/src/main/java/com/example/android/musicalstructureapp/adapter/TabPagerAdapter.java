package com.example.android.musicalstructureapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.musicalstructureapp.fragment.AlbumFragment;
import com.example.android.musicalstructureapp.fragment.ArtistFragment;
import com.example.android.musicalstructureapp.fragment.PlaylistFragment;
import com.example.android.musicalstructureapp.fragment.SongFragment;

/**
 * Created by Mac on 7/16/2018.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                //Fragment for PlaylistFragment Tab
                return new PlaylistFragment();
            case 1:
                //Fragment for ArtistFragment Tab
                return new ArtistFragment();
            case 2:
                return new AlbumFragment();
            case 3:
                return new SongFragment();
        }
        return null;

    }

    @Override
    public int getCount() {
        return 4; //No of Tabs
    }
}
