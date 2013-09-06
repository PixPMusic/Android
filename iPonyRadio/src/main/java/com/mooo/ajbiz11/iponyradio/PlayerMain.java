package com.mooo.ajbiz11.iponyradio;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class PlayerMain extends Activity implements
        MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener,
        MediaPlayer.OnErrorListener, MediaPlayer.OnBufferingUpdateListener {

    private String TAG = getClass().getSimpleName();
    private MediaPlayer mp = null;
    private Button play;
    private Button stop;
    private String url = null;
    private boolean playing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_main);
        Intent intent = getIntent();

        String station = intent.getStringExtra("key");
        if ("ponyfeather".equals(station)){
            url = getString(R.string.ponyfeather);
        }  else if ("everfree".equals(station)){
            url = getString(R.string.everfree128);
        } else if ("fillydelphia".equals(station)){
            url = getString(R.string.fillydelphia128);
        } else if ("ponyvillefm".equals(station)){
            url = getString(R.string.ponyvillefmHQ);
        } else if ("lunaradio".equals(station)){
            url = getString(R.string.lunaradio64);
        } else if ("alicornradio".equals(station)){
            url = getString(R.string.alicornradio);
        } else if ("sonicradioboom".equals(station)){
            url = getString(R.string.sonicradioboom);
        } else if ("fracturedfrequencies".equals(station)){
            url = getString(R.string.fracturedfrequencies);
        } else if ("bronyradio".equals(station)){
            url = getString(R.string.bronyradio);
        } else if ("everypony".equals(station)){
            url = getString(R.string.everypony);
        }

        play = (Button) findViewById(R.id.play);
        stop = (Button) findViewById(R.id.stop);

        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                    play();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                stop();
            }
        });
    }

    private void play() {
        Uri myUri = Uri.parse(url);
        try {
            if (mp == null) {
                this.mp = new MediaPlayer();
            } else {
                mp.stop();
                mp.reset();
            }
            mp.setDataSource(this, myUri); // Go to Initialized state
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.setOnPreparedListener(this);
            mp.setOnBufferingUpdateListener(this);

            mp.setOnErrorListener(this);
            mp.prepareAsync();

            Log.d(TAG, "LoadClip Done");
        } catch (Throwable t) {
            Log.d(TAG, t.toString());
        }
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        Log.d(TAG, "Stream is prepared");
        playing = true;
        mp.start();
    }

    private void pause() {
        mp.pause();
    }

    private void stop() {
        mp.stop();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stop();

    }

    public void onCompletion(MediaPlayer mp) {
        stop();
    }

    public boolean onError(MediaPlayer mp, int what, int extra) {
        StringBuilder sb = new StringBuilder();
        sb.append("Media Player Error: ");
        switch (what) {
            case MediaPlayer.MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK:
                sb.append("Not Valid for Progressive Playback");
                break;
            case MediaPlayer.MEDIA_ERROR_SERVER_DIED:
                sb.append("Server Died");
                break;
            case MediaPlayer.MEDIA_ERROR_UNKNOWN:
                sb.append("Unknown");
                break;
            default:
                sb.append(" Non standard (");
                sb.append(what);
                sb.append(")");
        }
        sb.append(" (" + what + ") ");
        sb.append(extra);
        Log.e(TAG, sb.toString());
        return true;
    }

    public void onBufferingUpdate(MediaPlayer mp, int percent) {
        Log.d(TAG, "PlayerService onBufferingUpdate : " + percent + "%");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.play:
                stop();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
