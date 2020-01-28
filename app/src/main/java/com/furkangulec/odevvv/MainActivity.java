package com.furkangulec.odevvv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText edkullanıcı,edps;
   Intent intent;
   String user="furkan";
   String parola="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // EditText username = (EditText)findViewById(R.id.edkullanıcı);
        //EditText password = (EditText)findViewById(R.id.edps);
        edkullanıcı=findViewById(R.id.edkullanıcı);
        edps=findViewById(R.id.edps);





    }

    public void Git(View view) {
        if (edkullanıcı.equals(user)||edps.equals(parola))
            {
                intent = new Intent(this, ikiActivity.class);

            }
        else{
                Toast.makeText(this, "Basarılı Giris", Toast.LENGTH_LONG).show();
                 intent = new Intent(this, ikiActivity.class);
                 startActivity(intent);
            }


        }
    }

