package com.threedigital.fragmenttabstutorial;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar.Tab Tab1, Tab2, Tab3, Tab4;
        Fragment fragmentTab1 = new FragmentTab1();
        Fragment fragmentTab2 = new FragmentTab2();
        Fragment fragmentTab3 = new FragmentTab3();
        Fragment fragmentTab4 = new FragmentTab4();



            ActionBar actionBar = getActionBar();

            // Hide Actionbar Icon
            assert actionBar != null;
            actionBar.setDisplayShowHomeEnabled(false);

            // Hide Actionbar Title
            actionBar.setDisplayShowTitleEnabled(false);

            // Create Actionbar Tabs
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

            // Set Tab Icon and Titles
            Tab1 = actionBar.newTab().setText("Tab1");
            Tab2 = actionBar.newTab().setText("Tab2");
            Tab3 = actionBar.newTab().setText("Tab3");
            Tab4 = actionBar.newTab().setText("Tab4");

            // Set Tab Listeners
            Tab1.setTabListener(new TabListener(fragmentTab1));
            Tab2.setTabListener(new TabListener(fragmentTab2));
            Tab3.setTabListener(new TabListener(fragmentTab3));
            Tab4.setTabListener(new TabListener(fragmentTab4));

            // Add tabs to actionbar
            actionBar.addTab(Tab1);
            actionBar.addTab(Tab2);
            actionBar.addTab(Tab3);
            actionBar.addTab(Tab4);
        }
    }



