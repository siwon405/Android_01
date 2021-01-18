package com.on.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.on.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LifeCycleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LifeCycleFragment extends Fragment {



    public LifeCycleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false);
    }
}