package com.zj.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button viewById;
    Button viewById2;
    Button viewById3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewById = findViewById(R.id.bt_open1);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ManyAcyivity1.class);
                startActivity(intent);
            }
        });
        viewById2 = findViewById(R.id.bt_open2);
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ManyActivity2.class);
                startActivity(intent);
            }
        });
        viewById3 = findViewById(R.id.bt_open3);
        viewById3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ManyActivity3.class);
                startActivity(intent);
            }
        });

    }
}
