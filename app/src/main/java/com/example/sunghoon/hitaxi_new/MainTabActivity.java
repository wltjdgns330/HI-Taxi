package com.example.sunghoon.hitaxi_new;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class MainTabActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tab);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecTab1 = tabHost.newTabSpec("TAB1").setIndicator("메뉴").setContent(new Intent(this, MenuActivity.class));
        tabHost.addTab(tabSpecTab1);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#c8c8c8"));

        TabHost.TabSpec tabSpecTab2 = tabHost.newTabSpec("TAB2").setIndicator("방목록").setContent(new Intent(this, ChattingActivity.class));
        tabHost.addTab(tabSpecTab2);
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#c8c8c8"));

        TabHost.TabSpec tabSpecTab3 = tabHost.newTabSpec("TAB3").setIndicator("설정").setContent(new Intent(this, InquryActivity.class));
        tabHost.addTab(tabSpecTab3);
        tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#c8c8c8"));

        tabHost.setCurrentTab(0);
    }
}