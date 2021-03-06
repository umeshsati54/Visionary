package com.example.ubuntu.seefood;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ubuntu.seefood.detector.Labels;

/**
 * Created by ubuntu on 25/2/18.
 */

public class AboutActivity extends AppCompatActivity {

    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Labels.LABELS_COCO);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(mAdapter);

    }
}
