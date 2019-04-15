package com.example.temp_03_03.activities.accelerometerActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.temp_03_03.R;
import com.example.temp_03_03.activities.mainActivity.MainActivityPresenter;

public class AccelerometerDataActivity extends AppCompatActivity implements IAccelerometerDataActivity{


    private AccelerometerDataActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mPresenter = new AccelerometerDataActivityPresenter(this);
    }

    @Override
    public void show() {

    }
}
