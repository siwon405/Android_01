package com.on.myapplication.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.on.myapplication.R;
import com.on.myapplication.fragments.ColorFragment;

public class ColorFragmentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_fragment);

        //xml에서 프래그먼트 가져오기
        ColorFragment colorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.color_frag);
        colorFragment.setColor(Color.BLUE);

        //동적인 프래그 먼트 추가
        ColorFragment colorFragment2 = new ColorFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,colorFragment2)
                .commit();
    }

    public void onClick(View view) {
        ColorFragment newColorFragment = new ColorFragment();
        int color = 0xFFFD1F70;
        newColorFragment.setColor(color);

        //기존 프래그먼트를 교체
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,newColorFragment)
                .commit();
    }
}