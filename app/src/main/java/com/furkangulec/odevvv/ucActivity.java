package com.furkangulec.odevvv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ucActivity extends AppCompatActivity {
TextView txtSonuc,txtyemek;
Intent intent;
Sehir s,s2;
Yemekler y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc);
        intent=getIntent();
        s=intent.getParcelableExtra("sehir");


        y=intent.getParcelableExtra("yemek");

        txtSonuc = findViewById(R.id.txtSonuc);
        txtyemek = findViewById(R.id.txtyemek);

        txtSonuc.setText(s.toString());

        txtyemek.setText(y.toString());
    }

    public void spinner(View view) {
intent=new Intent(this,Main2Activity.class);
startActivity(intent);
    }
}
