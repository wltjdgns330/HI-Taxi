package com.example.sunghoon.hitaxi_new;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class SignupActivity extends Activity {

    private String Em;
    private String Name;
    private String Email;
    private String Gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final Spinner spi = (Spinner) findViewById(R.id.signup_spi);
        String[] str = getResources().getStringArray(R.array.spinnerArray);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item,str);

        spi.setAdapter(adapter);

        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Em = spi.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button btn = (Button)findViewById(R.id.signup_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this,MainTabActivity.class);

                EditText ed1 = (EditText)findViewById(R.id.signup_name);
                Name = ed1.getText().toString();
                EditText ed2 = (EditText)findViewById(R.id.signup_email);
                Email = ed2.getText().toString();
                RadioGroup ra = (RadioGroup)findViewById(R.id.rr);

                int aa = ra.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton)findViewById(aa);
                Gender = rb.getText().toString();

                TextView tv = (TextView)findViewById(R.id.tvv);
                tv.append("Name : " + Name + " Em : " + Email  + Em + " Gender : " + Gender);

            }
        });


    }


}
