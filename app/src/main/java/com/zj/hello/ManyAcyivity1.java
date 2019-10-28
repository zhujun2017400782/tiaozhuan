package com.zj.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ManyAcyivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_many1);

        View viewById = findViewById(R.id.bt_open4);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManyAcyivity1.this, ManyActivity4.class);
                startActivity(intent);
            }
        });
        View viewById2 = findViewById(R.id.bt_open5);
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManyAcyivity1.this,ManyActivity5.class);
                startActivity(intent);
            }
        });
    }
}
