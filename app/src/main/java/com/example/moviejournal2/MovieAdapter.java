package com.example.moviejournal2;

import android.content.Context;
import android.graphics.Bitmap;

import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {

    public MovieAdapter(@NonNull Context context, ArrayList<Movie> movieData) {
        super(context, 0,movieData);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem==null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        Movie currentMovie = getItem(position);
        TextView title = (TextView) listItem.findViewById(R.id.textViewTitle);
        TextView genre = (TextView) listItem.findViewById(R.id.textViewGenre);
        TextView year = (TextView) listItem.findViewById(R.id.textViewYear);
        ImageView image = (ImageView) listItem.findViewById(R.id.imageView);

        title.setText(currentMovie.getTitle());
        genre.setText("Lajityyppi: " + currentMovie.getGenre());
        year.setText("Vuosi: "+ currentMovie.getYear());



        return listItem;
    }
}

