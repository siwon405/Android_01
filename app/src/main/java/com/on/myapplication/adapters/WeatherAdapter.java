package com.on.myapplication.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.on.myapplication.R;
import com.on.myapplication.models.Weather;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {

    private Context mContext;
    private List<Weather> mData;

    public WeatherAdapter(Context context, List<Weather> data) {
        mContext = context;
        mData = data;
    }

    //아이템 갯수
    @Override
    public int getCount() {
        return mData.size();
    }

    //position번째 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    //position번째 id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //position번째의 레이아웃
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        //convertView : 재사용 되는 view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            //뷰를 새로 만들 때
            convertView = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_weather, parent, false);

            //레이아웃 레퍼런스 연결(레이아웃 가져오기
            ImageView imageView = (ImageView) convertView.findViewById(R.id.weather_image);
            TextView locationTextView = (TextView) convertView.findViewById(R.id.location_text);
            TextView temperatureTextView = (TextView) convertView.findViewById(R.id.temperature_text);

            //뷰홀더에 넣기
            viewHolder.weatherImage = imageView;
            viewHolder.locationTextView = locationTextView;
            viewHolder.temperatureTextView = temperatureTextView;

            convertView.setTag(viewHolder);
        }else{
            //재사용 할 때
            viewHolder = (ViewHolder) convertView.getTag();
        }

//        Log.d (TAG,"getView: " + position);

        //데이터
        Weather weather = mData.get(position);

        //화면에 출력
        viewHolder.weatherImage.setImageResource((weather.getImageRes()));
        viewHolder.locationTextView.setText(weather.getLocation());
        viewHolder.temperatureTextView.setText(weather.getTemperature());

        //홀수 마젠타
        if (position / 2 == 1) {
            convertView.setBackgroundColor(Color.MAGENTA);
        } else {
            convertView.setBackgroundColor(Color.CYAN);
        }

        //클린된 아이템 노란색
        if (mSelectedPosition == position) {
            convertView.setBackgroundColor(Color.YELLOW);
        }
         return convertView;
    }

    //-1이면 선택된게 없다
    private int mSelectedPosition = -1;

    public void setSelect(int position){mSelectedPosition = position;}

    //findViewById로 가져온 View 보관
    private static  class ViewHolder {
        ImageView weatherImage;
        TextView locationTextView;
        TextView temperatureTextView;
    }

}
