package com.marconota.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.marconota.musicalstructure.R.id.fields_text;
import static com.marconota.musicalstructure.R.id.love_text;
import static com.marconota.musicalstructure.R.id.playing_now;
import static com.marconota.musicalstructure.R.id.plists;

public class Recent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(Recent.this, MainActivity.class);
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
                Intent playingNowIntent = new Intent(Recent.this, Playing_now.class);
                startActivity(playingNowIntent);
            }
        });


        // Find the View that shows the Playlists category
        TextView playlists = (TextView) findViewById(plists);

// Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(Recent.this, Playlists.class);
                startActivity(playlistsIntent);
            }
        });


        // Find the View that shows the Fields of gold song
        TextView fields = (TextView) findViewById(fields_text);

// Set a click listener on that View
        fields.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent fieldsTextIntent = new Intent(Recent.this, Playing_now.class);
                startActivity(fieldsTextIntent);
            }
        });


        // Find the View that shows the Somebody to love song
        TextView love = (TextView) findViewById(love_text);

// Set a click listener on that View
        love.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Somebody to love View is clicked on.
            @Override
            public void onClick(View view) {
                Intent loveTextIntent = new Intent(Recent.this, Playing_now.class);
                startActivity(loveTextIntent);
            }
        });


    }
}
