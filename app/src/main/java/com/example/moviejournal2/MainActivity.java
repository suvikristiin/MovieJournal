package com.example.moviejournal2;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText searchMovieName;
    EditText searchActorName;
    EditText searchInstructorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchMovieName = (EditText) findViewById(R.id.editTextMovieName);
        searchActorName = (EditText) findViewById(R.id.editTextActorName);
        searchInstructorName = (EditText) findViewById(R.id.editTextInstructorName);

    }
}