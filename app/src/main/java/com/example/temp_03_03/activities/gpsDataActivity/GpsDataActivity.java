package com.example.temp_03_03.activities.gpsDataActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.temp_03_03.R;

public class GpsDataActivity extends AppCompatActivity implements IGpsDataActivity {

    private GpsDataActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new GpsDataActivityPresenter(this);
    }

    @Override
    public void show() {

    }
}