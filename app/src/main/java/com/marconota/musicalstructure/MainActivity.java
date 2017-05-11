package com.marconota.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Find the View that shows the Playing now category
        TextView playingNow = (TextView) findViewById(R.id.playing_now);

// Set a click listener on that View
        playingNow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playing now View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingNowIntent = new Intent(MainActivity.this, Playing_now.class);
                startActivity(playingNowIntent);
            }
        });


        // Find the View that shows the Playlists category
        TextView playlists = (TextView) findViewById(R.id.playlists);

// Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, Playlists.class);
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
                Intent recentIntent = new Intent(MainActivity.this, Recent.class);
                startActivity(recentIntent);
            }
        });


        // Find the View that shows the Fields of gold song
        TextView fields = (TextView) findViewById(R.id.fields_text);

// Set a click listener on that View
        fields.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Fields of gold  View is clicked on.
            @Override
            public void onClick(View view) {
                Intent fieldsTextIntent = new Intent(MainActivity.this, Playing_now.class);
                startActivity(fieldsTextIntent);
            }
        });


        // Find the View that shows the Fields of gold song
        TextView love = (TextView) findViewById(R.id.love_text);

// Set a click listener on that View
        love.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Somebody to love song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent loveTextIntent = new Intent(MainActivity.this, Playing_now.class);
                startActivity(loveTextIntent);
            }
        });

        // Find the View that shows Message in a bottle song
        TextView message = (TextView) findViewById(R.id.message);

// Set a click listener on that View
        message.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Message in a bottle View is clicked on.
            @Override
            public void onClick(View view) {
                Intent messageTextIntent = new Intent(MainActivity.this, Playing_now.class);
                startActivity(messageTextIntent);
            }
        });


    }
}
