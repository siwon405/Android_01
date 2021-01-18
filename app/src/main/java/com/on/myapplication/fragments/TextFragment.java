package com.on.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.on.myapplication.R;

public class TextFragment extends ColorFragment{
    private String mText = "";
    private TextView mTextView;

    public TextFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mTextView  = (TextView)view.findViewById(R.id.text_text);
        mTextView.setText(mText);
        return view;
    }

    public void setmText(String text){
        mText = text;

        if(mTextView !=null) {
            mTextView.setText(mText);
        }
    }
}
