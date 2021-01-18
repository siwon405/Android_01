package com.on.myapplication.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.on.myapplication.R;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

//        mViewPager = findViewById(R.id.pager);
//        mViewPager.setAdapter(adapter);
    }

//    private static class MyPagerAdapter extends FragmentPagerAdapter {
//
//
//        public MyPagerAdapter(@NonNull FragmentManager fm) {
//            super(fm);
//        }
//
//        @NonNull
//        @Override
//        public Fragment getItem(int position) {
//            switch (position) {
//                case 1:
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//
//            }
//        }
//
//        @Override
//        public int getCount() {
//            return 5;
//        }
//    }
}