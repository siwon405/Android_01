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

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                TextFragment textFragment = new TextFragment();
                textFragment.setColor( 0xFFFD1F70);

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container_1, textFragment)
                        .commit();

                textFragment.setmText("1번입니다");
                break;
            case R.id.button2:
                TextFragment textFragment2 = new TextFragment();
                textFragment2.setColor( 0xFF03DAC5);
                textFragment2.setmText("2번입니다");

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container_2, textFragment2)
                        .commit();
                break;
            case R.id.button3:
                TextFragment textFragment3 = new TextFragment();
                textFragment3.setColor( 0xFF750065);
                textFragment3.setmText("3번입니다");

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container_3, textFragment3)
                        .commit();
                break;
        }
    }
}