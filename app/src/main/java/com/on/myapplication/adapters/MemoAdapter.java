package com.on.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.on.myapplication.R;
import com.on.myapplication.models.Memo;

import java.util.List;

public class MemoAdapter extends BaseAdapter {
    private final List<Memo> mData;

    public MemoAdapter(List<Memo> mMemoList) {
        mData = mMemoList;
    }


    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        //convertView : 재사용 되는 view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            //뷰를 새로 만들 때
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_memo, parent, false);

            //레이아웃 레퍼런스 연결(레이아웃 가져오기
            TextView titleTextView = (TextView) convertView.findViewById(R.id.title_text);
            TextView contentTextView = (TextView) convertView.findViewById(R.id.content_text);

            //뷰홀더에 넣기
            viewHolder.titleTextView = titleTextView;
            viewHolder.contentTextView = contentTextView;

            convertView.setTag(viewHolder);
        } else {
            //재사용 할 때
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //데이터
        Memo memo = mData.get(position);

        //화면에 출력
        viewHolder.titleTextView.setText(memo.getTitle());
        viewHolder.contentTextView.setText(memo.getContent());

        return convertView;
    }

    //findViewById로 가져온 View 보관
    private static class ViewHolder {
        TextView titleTextView;
        TextView contentTextView;
    }
}


