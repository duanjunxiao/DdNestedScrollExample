package com.getbase.nestedscrollingchilddemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by wsl on 16-7-19.
 */
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initViews();
    }

    private void initViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tableLayout = (TabLayout) findViewById(R.id.tableLayout);
        tableLayout.addTab(tableLayout.newTab().setText("tab0"));
        tableLayout.addTab(tableLayout.newTab().setText("tab1"));
        tableLayout.addTab(tableLayout.newTab().setText("tab2"));
    }
}
