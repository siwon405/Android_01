package com.on.myapplication.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.on.myapplication.R;
import com.on.myapplication.adapters.WeatherAdapter;
import com.on.myapplication.models.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ListView mListView;
    private GridView mGridView;
    private Spinner mSpinner;
    private WeatherAdapter mAdapter;
    private List<Weather> mWeatherList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        mListView =(ListView) findViewById(R.id.list_view);
        mGridView =(GridView) findViewById(R.id.grid_view);
        mSpinner =(Spinner) findViewById(R.id.spinner);

        //날씨 데이터
        mWeatherList = new ArrayList<>();
        mWeatherList.add(new Weather(R.drawable.weather_b, "베를린","-1도"));
        mWeatherList.add(new Weather(R.drawable.weather_c, "코케","0도"));
        mWeatherList.add(new Weather(R.drawable.weather_d, "제주","3도"));
        mWeatherList.add(new Weather(R.drawable.weather_a, "수원","0도"));
        mWeatherList.add(new Weather(R.drawable.weather_e, "삼척","1도"));
        mWeatherList.add(new Weather(R.drawable.weather_a, "평양","2도"));
        mWeatherList.add(new Weather(R.drawable.weather_f, "베이징","6도"));
        mWeatherList.add(new Weather(R.drawable.weather_g, "울산","0도"));
        mWeatherList.add(new Weather(R.drawable.weather_h, "대전","-3도"));
        mWeatherList.add(new Weather(R.drawable.weather_i, "목포","5도"));
        mWeatherList.add(new Weather(R.drawable.weather_c, "델리","0도"));
        mWeatherList.add(new Weather(R.drawable.weather_e, "모스크바","2도"));
        mWeatherList.add(new Weather(R.drawable.weather_a, "런던","7도"));
        mWeatherList.add(new Weather(R.drawable.weather_f, "뉴욕","8도"));
        mWeatherList.add(new Weather(R.drawable.weather_b, "올란바토르","0도"));
        mWeatherList.add(new Weather(R.drawable.weather_i, "파리","10도"));
        mWeatherList.add(new Weather(R.drawable.weather_h, "도쿄","3도"));

        //어댑터
        mAdapter  = new WeatherAdapter(this,mWeatherList);

        //어댑터를 뷰에 설정
        mListView.setAdapter(mAdapter);
        mGridView.setAdapter(mAdapter);
        mSpinner.setAdapter(mAdapter);

        //이벤트
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);

        mGridView.setOnItemClickListener(this);
        mGridView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mAdapter.setSelect(position);

//        데이터 추가
//        mWeatherList.add(new Weather(R.mipmap.ic_launcher,"학원","열기가 뜨겁다"));

        //데이터 변경됨 = 새로고침
        mAdapter.notifyDataSetChanged();
    }

    public ListView getmListView() {
        return mListView;
    }

    public void setmListView(ListView mListView) {
        this.mListView = mListView;
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        //이벤트(setOnItemLongClickListener)감지시(롱 클릭되면) 해당 아이템 삭제
        mWeatherList.remove(position);

        //어댑터에 변경사항 전달, 새로고침
        mAdapter.notifyDataSetChanged();
        return true;
    }
}