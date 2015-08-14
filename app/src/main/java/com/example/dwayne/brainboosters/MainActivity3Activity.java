package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity3Activity extends Activity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.drawable.showmeseven);
        mp.start();
    }
    public void results(View view) {
        Intent intent =  new Intent(getApplicationContext(), smile2.class);
        startActivity(intent);
    }
    public void wrongchoice(View view) {
        Intent intent = new Intent(getApplicationContext(), sad2.class);
        startActivity(intent);
    }
}