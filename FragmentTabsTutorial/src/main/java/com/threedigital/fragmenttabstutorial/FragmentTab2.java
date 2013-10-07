package com.threedigital.fragmenttabstutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 3digital on 10/7/13.
 */
public class FragmentTab2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmenttab2, container, false);
        return rootView;
    }
}
