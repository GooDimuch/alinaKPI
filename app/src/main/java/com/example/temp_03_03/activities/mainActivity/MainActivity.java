package com.example.temp_03_03.activities.mainActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.temp_03_03.activities.sensorListActivity.SensorListActivity;
import com.example.temp_03_03.R;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    private MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainActivityPresenter(this);
    }

    public void bSensorNameListOnClick(View view) {
        startActivity(new Intent(this, SensorListActivity.class));
    }

    public void bAccelerometerDataOnClick(View view) {
        startActivity(new Intent(this, SensorListActivity.class));

    }

    public void bGpsDataOnClick(View view) {
        startActivity(new Intent(this, SensorListActivity.class));

    }

    @Override
    public void show() {

    }
}