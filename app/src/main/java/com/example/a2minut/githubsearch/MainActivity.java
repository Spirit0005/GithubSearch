package com.example.a2minut.githubsearch;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.URL;

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

    private  void searchQuery(){

        String Query= et_searchbox.getText().toString();
        URL githubSearchURL = NetworkUtils.buildUrl(Query);
        tv_url.setText(githubSearchURL.toString());
        String githubSearchResults = null;

        try{
            githubSearchResults = NetworkUtils.getResponseFromHttpUrl(githubSearchURL);
            tv_search_results.setText(githubSearchResults);

        } catch (IOException e) {
            e.printStackTrace();
        }


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
//         Context context = MainActivity.this;
//         String message = "search clicked";
//            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
            searchQuery();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
