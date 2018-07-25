package com.jagroop.materialdesign.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutIconAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentNameList = new ArrayList<>();


    public TabLayoutIconAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentNameList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentNameList.get(position);
        //return null for icon only
    }

    public void addFragment(Fragment fragment, String fragmentName) {
        fragmentList.add(fragment);
        fragmentNameList.add(fragmentName);
    }
}
