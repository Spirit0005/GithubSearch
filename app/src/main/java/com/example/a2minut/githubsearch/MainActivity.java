package com.example.a2minut.githubsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_url, tv_search_results;
    EditText et_searchbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_url = findViewById(R.id.tv_url);
        tv_search_results = findViewById(R.id.tv_search_results);
        et_searchbox = findViewById(R.id.et_searchbox);
    }
}
