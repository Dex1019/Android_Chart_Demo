package com.example.dex.androidchartdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mPieChart;
    private Button mBarChart;
    private Button mLineChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mPieChart = findViewById(R.id.btn_pie_chart);
        mBarChart = findViewById(R.id.btn_bar_chart);
        mLineChart = findViewById(R.id.btn_line_chart);

        mPieChart.setOnClickListener(this);
        mBarChart.setOnClickListener(this);
        mLineChart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int mId = v.getId();

        switch (mId) {
            case R.id.btn_pie_chart: {
                startActivity(new Intent(HomeActivity.this, PieChartActivity.class));
                break;
            }
            case R.id.btn_bar_chart: {
                startActivity(new Intent(HomeActivity.this, BarChartActivity.class));
                break;

            }

            case R.id.btn_line_chart: {
                startActivity(new Intent(HomeActivity.this, LineChartActivity.class));
                break;
            }

        }
    }

}
