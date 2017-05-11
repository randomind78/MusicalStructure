package com.marconota.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.marconota.musicalstructure.R.id.playing_now;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);


        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(Playlists.this, MainActivity.class);
                startActivity(songsIntent);
            }
        });


        // Find the View that shows the Playing now category
        TextView playingNow = (TextView) findViewById(playing_now);

// Set a click listener on that View
        playingNow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing now View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingNowIntent = new Intent(Playlists.this, Playing_now.class);
                startActivity(playingNowIntent);
            }
        });


        // Find the View that shows the Recent category
        TextView recent = (TextView) findViewById(R.id.recent);

// Set a click listener on that View
        recent.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recent View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(Playlists.this, Recent.class);
                startActivity(recentIntent);
            }
        });


        // Find the View that shows the Greatest hits text
        TextView hits = (TextView) findViewById(R.id.hits_text);

// Set a click listener on that View
        hits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the greatest hits View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hitsIntent = new Intent(Playlists.this, Playing_now.class);
                startActivity(hitsIntent);
            }
        });


        // Find the View that shows  Love compilation text
        TextView compilation = (TextView) findViewById(R.id.compilation_text);

// Set a click listener on that View
        compilation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Love compilation View is clicked on.
            @Override
            public void onClick(View view) {
                Intent compilationIntent = new Intent(Playlists.this, Playing_now.class);
                startActivity(compilationIntent);
            }
        });

    }
}
