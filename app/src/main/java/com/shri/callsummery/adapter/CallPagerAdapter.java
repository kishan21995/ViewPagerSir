package com.shri.callsummery.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.shri.callsummery.fragments.ContactFragment;
import com.shri.callsummery.fragments.FavoriteFragment;
import com.shri.callsummery.fragments.HistoryFragment;

public class CallPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public CallPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
//                FavoriteFragment favoriteFragment = FavoriteFragment.newInstance("Favorite", "Call");
                FavoriteFragment favoriteFragment = new FavoriteFragment();

                return favoriteFragment;

            case 1:
                HistoryFragment historyFragment = HistoryFragment.newInstance("History", "Call");

                return historyFragment;
            case 2:
                ContactFragment contactFragment = ContactFragment.newInstance("Contact", "Call");

                return contactFragment;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
