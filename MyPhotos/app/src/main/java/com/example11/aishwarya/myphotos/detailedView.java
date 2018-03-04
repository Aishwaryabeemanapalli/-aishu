package com.example11.aishwarya.myphotos;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;

import static com.example11.aishwarya.myphotos.Config.nani;

/**
 * Created by Aishwarya on 02-03-2018.
 */

public class detailedView extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        //imageView.setImageResource(imageAdapter.mThumbIds[position]);
        imageView.setImageDrawable(nani[position]);
    }
}
