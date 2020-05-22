package com.example.android.warsawtourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CinemasFragment();
        } else if (position == 1) {
            return new GalleriesFragment();
        } else if (position == 2) {
            return new MallsFragment();
        } else {
            return new ShopsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cinemas);
        } else if (position == 1) {
            return mContext.getString(R.string.galleries);
        } else if (position == 2) {
            return mContext.getString(R.string.malls);
        } else {
            return mContext.getString(R.string.shops);
        }
    }
}