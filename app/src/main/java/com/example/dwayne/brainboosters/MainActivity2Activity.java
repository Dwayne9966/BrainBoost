package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity2Activity extends Activity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.drawable.showmethree);
        mp.start();
    }
    public void wrongchoice(View view) {
        Intent intent = new Intent(getApplicationContext(), sadface.class);
        startActivity(intent);
    }
    public void result(View view) {
        Intent intent = new Intent(getApplicationContext(), smileface.class);
        startActivity(intent);
    }
}
