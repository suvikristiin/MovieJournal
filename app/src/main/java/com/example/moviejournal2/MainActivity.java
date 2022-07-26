package com.example.moviejournal2;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    EditText searchMovieName;
    EditText searchActorName;
    EditText searchInstructorName;
    ListView listView;
    ArrayList<Movie> moviesData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchMovieName = (EditText) findViewById(R.id.editTextMovieName);
        searchActorName = (EditText) findViewById(R.id.editTextActorName);
        searchInstructorName = (EditText) findViewById(R.id.editTextInstructorName);
        listView = (ListView) findViewById(R.id.listView);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        String url = "https://www.finnkino.fi/xml/Events/";

        moviesData = MovieManager.readXml(url);
        MovieAdapter adapter = new MovieAdapter(this, moviesData);
        listView.setAdapter(adapter);

    }
}