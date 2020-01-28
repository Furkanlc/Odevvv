package com.furkangulec.odevvv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ikiActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iki);
    }

    public void onClick(View view) {
        Sehir s=new Sehir("Eskisehir",792);

        Yemekler y=new Yemekler("Cig Börek",15);
        intent =new Intent(this,ucActivity.class);

        intent.putExtra("sehir",s);

        intent.putExtra("yemek",y);
        startActivity(intent);


    }
}
