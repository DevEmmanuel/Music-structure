package com.example.macbookair.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button play;
    Button album;
    Button playlist;
    Button folder;
    Button artist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button) findViewById(R.id.bplay);
        album=(Button)findViewById(R.id.balbum);
        playlist=(Button)findViewById(R.id.bplaylist);
        folder=(Button)findViewById(R.id.bfolder);
        artist=(Button)findViewById(R.id.bartist);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(MainActivity.this,Songlist.class);
                startActivity(ob);
            }
        });
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(MainActivity.this,Songlist.class);
                startActivity(ob);
            }
        });
        folder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(MainActivity.this,Folders.class);
                startActivity(ob);
            }
        });
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(MainActivity.this,Songlist.class);
                startActivity(ob);
            }
        });
    }

    public void onplayclicked(View v) {
        String flipper = "PAUSE";
        if (!(flipper.equals(play.getText().toString()))) {
            play.setText(flipper);
        } else {
            play.setText("PLAY");
        }

    }

    public void nextclick(View v) {
        Toast.makeText(this, "NEXT SONG", Toast.LENGTH_LONG).show();
    }

    public void prevclick(View v) {
        Toast.makeText(this, "PREVIOUS SONG", Toast.LENGTH_LONG).show();
    }
}
