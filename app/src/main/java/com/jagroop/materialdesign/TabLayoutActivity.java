package com.jagroop.materialdesign;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.jagroop.materialdesign.Adapters.TabLayoutAdapter;
import com.jagroop.materialdesign.Adapters.TabLayoutIconAdapter;
import com.jagroop.materialdesign.Fragments.TabFiveFragment;
import com.jagroop.materialdesign.Fragments.TabFourFragment;
import com.jagroop.materialdesign.Fragments.TabOneFragment;
import com.jagroop.materialdesign.Fragments.TabSixFragment;
import com.jagroop.materialdesign.Fragments.TabThreeFragment;
import com.jagroop.materialdesign.Fragments.TabTwoFragment;

public class TabLayoutActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayoutFixed, tabLayoutScoralable, tabLayoutIcon, tabLayoutIconText;
    ViewPager viewPagerFixed, viewPagerIcon;
    TabLayoutAdapter adapter;
    TabLayoutIconAdapter iconAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        toolbar = findViewById(R.id.toolbar_tabLayout);
        toolbar.setTitle("TAB LAYOUT");
        setActionBar(toolbar);

        viewPagerFixed = findViewById(R.id.viewPager_fixed);
        viewPagerIcon = findViewById(R.id.viewPager_icon);
        tabLayoutFixed = findViewById(R.id.tabLayout_fixed);
        tabLayoutScoralable = findViewById(R.id.tabLayout_scoralable);
        tabLayoutIcon = findViewById(R.id.tabLayout_icon);
        tabLayoutIconText = findViewById(R.id.tabLayout_iconText);

        adapter = new TabLayoutAdapter(getSupportFragmentManager());
        iconAdapter = new TabLayoutIconAdapter(getSupportFragmentManager());

        adapter.addFragment(new TabOneFragment(),"TAB ONE");
        adapter.addFragment(new TabTwoFragment(),"TAB TWO");
        adapter.addFragment(new TabThreeFragment(),"TAB THREE");
        adapter.addFragment(new TabFourFragment(),"TAB FOUR");
        adapter.addFragment(new TabFiveFragment(),"TAB FIVE");
        adapter.addFragment(new TabSixFragment(),"TAB SIX");

        iconAdapter.addFragment(new TabOneFragment(),"ONE");
        iconAdapter.addFragment(new TabTwoFragment(),"TWO");
        iconAdapter.addFragment(new TabThreeFragment(),"THREE");

        viewPagerFixed.setAdapter(adapter);
        viewPagerIcon.setAdapter(iconAdapter);

        tabLayoutFixed.setupWithViewPager(viewPagerFixed);
        tabLayoutScoralable.setupWithViewPager(viewPagerFixed);
        tabLayoutIcon.setupWithViewPager(viewPagerIcon);
        tabLayoutIconText.setupWithViewPager(viewPagerIcon);

        tabLayoutIcon.getTabAt(0).setIcon(R.drawable.ic_cart);
        tabLayoutIcon.getTabAt(1).setIcon(R.drawable.ic_drive);
        tabLayoutIcon.getTabAt(2).setIcon(R.drawable.ic_search);

        tabLayoutIcon.getTabAt(0).setText("");
        tabLayoutIcon.getTabAt(1).setText("");
        tabLayoutIcon.getTabAt(2).setText("");

        tabLayoutIconText.getTabAt(0).setIcon(R.drawable.ic_cart);
        tabLayoutIconText.getTabAt(1).setIcon(R.drawable.ic_drive);
        tabLayoutIconText.getTabAt(2).setIcon(R.drawable.ic_search);


    }
}
