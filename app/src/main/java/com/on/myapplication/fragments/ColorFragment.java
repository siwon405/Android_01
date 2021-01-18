package com.on.myapplication.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.on.myapplication.R;

public class ColorFragment extends Fragment {

    private int mColor = Color.WHITE;

    // 빈 생성자 필수
    public ColorFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color,container,false);
        view.setBackgroundColor(mColor);
        return view;
    }

    public  void setColor(int color) {
        mColor = color;
        if (getView() !=null) {
            getView().setBackgroundColor(mColor);
        }
    }
}
