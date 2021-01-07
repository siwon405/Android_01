package com.on.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = MainActivity.class.getSimpleName();
    private static final int QUANTITY_MIN = 0;
    private static final int QUANTITY_MAX = 99;
    public static final int COFFEE_PRICE = 2900;

    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;
    private TextView mResultTextView;
    private Button mOrderButton;

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
        mResultTextView = findViewById(R.id.result_text);
        mOrderButton = findViewById(R.id.order_button);

        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuantity--;
                if (mQuantity < QUANTITY_MIN) {
                    mQuantity = QUANTITY_MIN;
                }
                displayResult();
            }
        });

        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuantity++;
                if (mQuantity > QUANTITY_MAX) {
                    mQuantity = QUANTITY_MAX;
                }
                displayResult();
            }
        });
        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mResultTextView.getText().toString();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void displayResult() {
        mQuantityTextView.setText("" + mQuantity);

        String result = "합계 ; " + (COFFEE_PRICE * mQuantity) + "원\n감사합니다.";
        mResultTextView.setText(result);
    }

    private void init() {
        mQuantity = 0;
    }
}