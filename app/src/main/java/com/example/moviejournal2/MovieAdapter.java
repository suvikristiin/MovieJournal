package com.example.moviejournal2;

import static com.squareup.picasso.Picasso.*;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {
    Context context;
    ArrayList<Movie> moviesData;

    public MovieAdapter(Context context, ArrayList<Movie> moviesData) {
        super(context, 0,moviesData);
        this.context = context;
        this.moviesData = moviesData;

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


        Picasso.get().load(currentMovie.getImageUrl()).into(image);

        return listItem;

    }

}


