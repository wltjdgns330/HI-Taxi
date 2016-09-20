package com.example.sunghoon.hitaxi_new;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ChattingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayList<ListViewItem> data = new ArrayList<>();
        ListViewItem lion = new ListViewItem(R.drawable.ddd, "주안역");
        ListViewItem tiger = new ListViewItem(R.drawable.ddd, "어서들오세요 언능가게요.");
        ListViewItem dog = new ListViewItem(R.drawable.ddd, "유사장님들 타세요!!");
        ListViewItem cat = new ListViewItem(R.drawable.ddd, "하하하핳하하 아무나 와라");

        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);

        ListViewAdapter adapter = new ListViewAdapter
                (this,R.layout.listview_item,data);
        listView.setAdapter(adapter);

    }
}
