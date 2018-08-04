package com.example.dex.androidchartdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {


    private BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        barChart = findViewById(R.id.bar_chart);
        ChartData();

    }

    private void ChartData() {

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(2f, 1, ""));
        entries.add(new BarEntry(4f, 2, "2015"));
        entries.add(new BarEntry(6f, 3, "2014"));
        entries.add(new BarEntry(10f, 4, "2013"));
        entries.add(new BarEntry(2f, 5, "2012"));
        entries.add(new BarEntry(8f, 6, "2011"));

        BarDataSet dataSet = new BarDataSet(entries, "Cells");
        BarData data = new BarData(dataSet);

        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);

        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        barChart.setData(data);
        barChart.getBarData().setValueFormatter(new IValueFormatter() {
            @Override
            public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
                return entry.getData().toString();
            }
        });

        barChart.getDescription().setEnabled(false);
        barChart.invalidate();


    }
}
