package com.example.sunghoon.hitaxi_new;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by 이현주 on 2016-09-24.
 */
public class MenuActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button bt = (Button)findViewById(R.id.bnt_make);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnClick(view);
            }
        });
    }

    public void mOnClick(View v)
    {

        switch(v.getId()){
            case R.id.bnt_make:
                LayoutInflater inflater = getLayoutInflater();

                final View dialogView = inflater.inflate(R.layout.dialog_makeroom, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("방 만들기");
                builder.setView(dialogView);
                builder.setPositiveButton("방만들기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //EditText edit_name = (EditText)dialogView.findViewById(R.id.room_title);
                        //RadioGroup rg = (RadioGroup)dialogView.findViewById(R.id.dialog_rg);

                        //String name = edit_name.getText().toString();
                        //int checkedId = rg.getCheckedRadioButtonId();


                        Log.i("t1","tt");
                        //RadioButton rb = (RadioButton)rg.findViewById(checkedId);
                        //String number = rb.getText().toString();
                    }
                });

                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(MenuActivity.this, "방 만들기를 취소합니다", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.setCanceledOnTouchOutside(false);

                dialog.show();
                break;
        }
    }
}