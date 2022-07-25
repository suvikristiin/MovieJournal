package com.example.moviejournal2;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class MainActivity extends AppCompatActivity {

    EditText searchMovieName;
    EditText searchActorName;
    EditText searchInstructorName;
    ArrayList<Movie> moviesData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchMovieName = (EditText) findViewById(R.id.editTextMovieName);
        searchActorName = (EditText) findViewById(R.id.editTextActorName);
        searchInstructorName = (EditText) findViewById(R.id.editTextInstructorName);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        String url = "https://www.finnkino.fi/xml/Events/";

        MovieManager movieManager = new MovieManager();
        moviesData = movieManager.readXml(url);
        System.out.println(moviesData);

    }
}