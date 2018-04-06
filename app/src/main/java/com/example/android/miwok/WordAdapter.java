package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kengshing.aw on 3/22/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;


    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());


        TextView defaultTextView = listView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        View textLayout = listView.findViewById(R.id.text_layout);
        int textLayoutColor = ContextCompat.getColor(getContext(), mColorResourceId);
        textLayout.setBackgroundColor(textLayoutColor);
       //textLayout.setBackgroundColor(mColorResourceId);

        ImageView imageView = listView.findViewById(R.id.image);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
            else{
            imageView.setVisibility(View.GONE);
        }

        Log.i("WordAdaptor", "Image id is:" + currentWord.getmImageResourceId());
        Log.i("WordAdaptor", "testcolorId is" + mColorResourceId);
        Log.i("WordAdaptor", "testLayoutcolor is" + textLayoutColor);

        return listView;
    }
}
