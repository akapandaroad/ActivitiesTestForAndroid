package com.example.akapandaroad.activitiestest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.startAnotherAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,AnotherAty.class));
                //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baidu.com")));
                Intent i=new Intent(MainActivity.this,AnotherAty.class);
                i.putExtra("data","woshinibaba");

                startActivity(i);

                System.out.println("onCreate");
            }
        });

        findViewById(R.id.startSecondAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,AnotherAty.class);
                //i.putExtra("data2","akapandaroad");
                Bundle bundle=new Bundle();
                bundle.putString("name","akapandaroad");
                bundle.putInt("age",25);
                bundle.putBoolean("single",true);
                i.putExtras(bundle);
                startActivity(i);



            }
        });



    }



}
