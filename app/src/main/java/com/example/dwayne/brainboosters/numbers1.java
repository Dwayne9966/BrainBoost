package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class numbers1 extends Activity {
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers1);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this,R.drawable.one);
        mp.start();
        Toast.makeText(getApplicationContext(), "Click here", Toast.LENGTH_SHORT).show();
    }
    public void toword1(View v) {
        Intent intent = new Intent(getApplicationContext(),word1.class);
        startActivity(intent);
    }
}
