package com.example.android.udacity_project5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create ArrayList of Student report card
        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();
        reportCards.add(new ReportCard(R.drawable.female_a, "Sarah", "Biology", "A"));
        reportCards.add(new ReportCard(R.drawable.female_b, "Tennese", "Mathematics", "C"));
        reportCards.add(new ReportCard(R.drawable.female_c, "Julie", "Algebra II", "D"));
        reportCards.add(new ReportCard(R.drawable.female_d, "Anna", "English", "B"));
        reportCards.add(new ReportCard(R.drawable.laki1, "Brandon", "History", "F"));
        reportCards.add(new ReportCard(R.drawable.laki2, "Max", "Net Eng", "A"));
        reportCards.add(new ReportCard(R.drawable.laki3, "Giovanni", "UI Eng", "C"));
        reportCards.add(new ReportCard(R.drawable.laki4, "Van Garde", "Soft Eng", "B"));
        reportCards.add(new ReportCard(R.drawable.laki5, "Afif", "Art", "A"));
        reportCards.add(new ReportCard(R.drawable.laki6, "Alex", "Physic", "A"));

        //link to ReportCardAdapter
        ReportCardAdapter reportCardAdapter = new ReportCardAdapter(this, reportCards);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_report);
        listView.setAdapter(reportCardAdapter);

    }
}
