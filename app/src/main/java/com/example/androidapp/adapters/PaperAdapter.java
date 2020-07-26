package com.example.androidapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.androidapp.BlankFragment;
import com.example.androidapp.BlankFragment2;

public class PaperAdapter extends FragmentPagerAdapter {
    int numOfTabs;
    public PaperAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOfTabs=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new BlankFragment2();
            case 1: return new BlankFragment2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
