package com.dinfogarneau.cours03e.ecotrajet.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dinfogarneau.cours03e.ecotrajet.R;

/**
 * Created by Guillaume on 2015-09-11.
 */
public class DemandeFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.demande_fragment, container, false);
        return rootView;
    }

}
