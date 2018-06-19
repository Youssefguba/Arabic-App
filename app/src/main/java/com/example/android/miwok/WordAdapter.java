package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
    private int mColorResourceId;



    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param wordAdapter A List of AndroidFlavor objects to display in a list
     */
        public WordAdapter(Activity context, ArrayList<Word> wordAdapter, int colorResourceId){
            super(context, 0, wordAdapter);
            mColorResourceId = colorResourceId;
        }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is  used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
      final  Word currentWord = getItem(position);

        TextView defaultTranslate = (TextView) listItemView.findViewById(R.id.default_translate);

        defaultTranslate.setText(currentWord.getmDefaultTranslation());

        TextView arabicTranslate = (TextView) listItemView.findViewById(R.id.arabic_translate);

        arabicTranslate.setText(currentWord.getmArabicTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

       if(currentWord.hasImage()) {
           imageView.setImageResource(currentWord.getmImageResource());
           // Make sure the view is visible
           imageView.setVisibility(View.VISIBLE);
       } else  {
           imageView.setVisibility(View.GONE);
       }
        // Set the theme color for the list item
                View textContainer = listItemView.findViewById(R.id.text_container);
                // Find the color that the resource ID maps to
                       int color = ContextCompat.getColor(getContext(), mColorResourceId);
                // Set the background color of the text container View
                       textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
