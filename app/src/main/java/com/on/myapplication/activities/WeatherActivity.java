package com.on.myapplication.activities;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.on.myapplication.R;
import com.on.myapplication.adapters.WeatherAdapter;
import com.on.myapplication.models.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        mListView = findViewById(R.id.list_view);

        //날씨 데이터
        List<Weather> weatherList = new ArrayList<>();
        weatherList.add(new Weather(R.drawable.weather_a, "수원","0도"));
        weatherList.add(new Weather(R.drawable.weather_b, "베를린","-1도"));
        weatherList.add(new Weather(R.drawable.weather_c, "코케","0도"));
        weatherList.add(new Weather(R.drawable.weather_d, "제주","3도"));
        weatherList.add(new Weather(R.drawable.weather_e, "삼척","1도"));
        weatherList.add(new Weather(R.drawable.weather_a, "평양","2도"));
        weatherList.add(new Weather(R.drawable.weather_f, "베이징","6도"));
        weatherList.add(new Weather(R.drawable.weather_g, "울산","0도"));
        weatherList.add(new Weather(R.drawable.weather_h, "대전","-3도"));
        weatherList.add(new Weather(R.drawable.weather_i, "목포","5도"));
        weatherList.add(new Weather(R.drawable.weather_c, "델리","0도"));
        weatherList.add(new Weather(R.drawable.weather_e, "모스크바","2도"));
        weatherList.add(new Weather(R.drawable.weather_a, "런던","7도"));
        weatherList.add(new Weather(R.drawable.weather_f, "뉴욕","8도"));
        weatherList.add(new Weather(R.drawable.weather_b, "올란바토르","0도"));
        weatherList.add(new Weather(R.drawable.weather_i, "파리","10도"));
        weatherList.add(new Weather(R.drawable.weather_h, "도쿄","3도"));

        //어댑터
        WeatherAdapter adapter = new WeatherAdapter(this,weatherList);

        mListView.setAdapter(adapter);

    }
}