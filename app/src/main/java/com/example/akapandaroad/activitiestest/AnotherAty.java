package com.example.akapandaroad.activitiestest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherAty extends AppCompatActivity {

    private TextView tv;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_aty);

        Intent i=getIntent();
        Bundle data=i.getExtras();
        tv=findViewById(R.id.tv);
       // tv.setText(i.getStringExtra("data2"));

        tv.setText(String.format("name=%s,age=%d,name1=%s",data.getString("name")
                ,data.getInt("age")
                , data.getString("name1","jialuwang")));




    }
}
