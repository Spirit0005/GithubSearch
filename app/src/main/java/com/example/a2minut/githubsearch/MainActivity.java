package com.example.a2minut.githubsearch;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selecteditem = item.getItemId();
        if(selecteditem == R.id.menu_search ){
         Context context = MainActivity.this;
         String message = "search clicked";
            Toast.makeText(context,message,Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);
    }
}
