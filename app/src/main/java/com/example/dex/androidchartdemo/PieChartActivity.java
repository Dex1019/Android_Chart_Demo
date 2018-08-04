package com.example.dex.androidchartdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = findViewById(R.id.pie_chart);

        ChartData();


    }


    private void ChartData() {

        pieChart.setUsePercentValues(true);

        ArrayList<PieEntry> yvalues = new ArrayList<>();
        yvalues.add(new PieEntry(8f, "January"));
        yvalues.add(new PieEntry(15f, "February"));
        yvalues.add(new PieEntry(12f, "March"));
        yvalues.add(new PieEntry(25f, "April"));
        yvalues.add(new PieEntry(23f, "May"));
        yvalues.add(new PieEntry(17f, "June"));


        // X-axis labels
//        ArrayList<String> xVals = new ArrayList<String>();
//
//        xVals.add("January");
//        xVals.add("February");
//        xVals.add("March");
//        xVals.add("April");
//        xVals.add("May");
//        xVals.add("June");


        PieDataSet dataSet = new PieDataSet(yvalues, "Election Results");
        PieData data = new PieData(dataSet);


        // In percentage Term
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.BLACK);
        pieChart.getDescription().setEnabled(true);


        // Default value
        //data.setValueFormatter(new DefaultValueFormatter(0));

//        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
//        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
//        dataSet.setColors(ColorTemplate.LIBERTY_COLORS);
//        dataSet.setColors(ColorTemplate.PASTEL_COLORS);

        pieChart.setData(data);
        pieChart.invalidate();


    }


}
