package com.furkangulec.odevvv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ArrayList<CountryItem> mCountryList;
    private CountryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initList();

        Spinner spinnerCountries = findViewById(R.id.spinner2);

        mAdapter = new CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem clickedItem = (CountryItem) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(Main2Activity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("Aksaray", R.drawable.aksaray));
        mCountryList.add(new CountryItem("Ankara", R.drawable.ankara));
        mCountryList.add(new CountryItem("Eskişehir", R.drawable.eskisehir));

    }
}
