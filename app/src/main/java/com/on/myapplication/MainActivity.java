package com.on.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = MainActivity.class.getSimpleName();

    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;

    private  int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();


//      레이아웃표시
        setContentView(R.layout.activity_coffee);

//      레이아웃에서 특정 id를 인스턴스 변수와 연결
        mMinusButton = findViewById(R.id.minus_button);
        mPlusButton = findViewById(R.id.plus_button);
        mQuantityTextView = findViewById(R.id.quantity_text);

        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                디버그
                Log.d(Tag,"마이너스버튼클릭");
                Log.v(Tag,"일반로그");
                Log.e(Tag,"에러로그");
                Log.i(Tag,"정보로그");
                Log.w(Tag,"경고로그");

                Toast.makeText(MainActivity.this, "메세지", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void init() {
        mQuantity = 0;
    }
}