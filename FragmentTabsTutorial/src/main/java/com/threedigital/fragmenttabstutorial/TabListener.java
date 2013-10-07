package com.threedigital.fragmenttabstutorial;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by 3digital on 10/7/13.
 */
public class TabListener implements ActionBar.TabListener {
    Fragment fragment;
    public TabListener(Fragment fragment) {
        this.fragment = fragment;

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

        ft.replace(R.id.fragment_container, fragment);
        
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        ft.remove(fragment);

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
