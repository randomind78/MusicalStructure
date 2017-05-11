package com.marconota.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Playing_now extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);


        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingNowIntent = new Intent(Playing_now.this, MainActivity.class);
                startActivity(playingNowIntent);
            }
        });


        // Find the View that shows the Playlists category
        TextView playlists = (TextView) findViewById(R.id.playlists);

// Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(Playing_now.this, Playlists.class);
                startActivity(playlistsIntent);
            }
        });


        // Find the View that shows the Recent category
        TextView recent = (TextView) findViewById(R.id.recent);

// Set a click listener on that View
        recent.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recent View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(Playing_now.this, Recent.class);
                startActivity(recentIntent);
            }
        });

    }
}
