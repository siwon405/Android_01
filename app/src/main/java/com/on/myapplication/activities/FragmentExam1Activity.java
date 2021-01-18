package com.on.myapplication.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.on.myapplication.R;
import com.on.myapplication.fragments.TextFragment;

public class FragmentExam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_exam1);
    }

    private void addFragment(int containerId, int color, String text) {
        TextFragment textFragment = new TextFragment();
        textFragment.setColor(color);

        getSupportFragmentManager().beginTransaction()
                .add(containerId, textFragment)
                .commit();

        textFragment.setmText(text);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                addFragment(R.id.container_1, 0xFFFD1F70,"1번입니다");
                break;
            case R.id.button2:
                addFragment(R.id.container_2, 0xFF88E329,"2번입니다");
                break;
            case R.id.button3:
                addFragment(R.id.container_3, 0xFF750065,"3번입니다");
                break;
        }
    }
}