package com.example.temp_03_03.activities.sensorListActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.temp_03_03.R;
import com.example.temp_03_03.activities.mainActivity.MainActivityPresenter;

public class SensorListActivity extends AppCompatActivity implements ISensorListActivity {


    private SensorListActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mPresenter = new SensorListActivityPresenter(this);
    }

    @Override
    public void show() {

    }
}
