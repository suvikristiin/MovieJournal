package com.example.moviejournal2;


import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {
    ArrayList<Movie> data;
    Bitmap bitmap;


    public MovieAdapter(@NonNull Context context, ArrayList<Movie> data) {
        super(context, 0,data);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem==null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        Movie currentMovie = getItem(position);
        TextView title = listItem.findViewById(R.id.textViewTitle);
        title.setText(currentMovie.getTitle());

        return listItem;
    }
}
