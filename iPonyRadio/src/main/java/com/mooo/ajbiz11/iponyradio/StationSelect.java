package com.mooo.ajbiz11.iponyradio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class StationSelect extends Activity {

    private ImageButton ponyfeather;
    private ImageButton everfree;
    private ImageButton fillydelphia;
    private ImageButton ponyvillefm;
    private Button lunaradio;
    private Button alicornradio;
    private Button sonicradioboom;
    private Button fracturedfrequencies;
    private Button bronyradio;
    private Button everypony;

    public static final String PREFS_NAME = "StationSelection";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.station_select);

        ponyfeather = (ImageButton) findViewById(R.id.ponyfeather);
        ponyfeather.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "PonyFeather!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "ponyfeather"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        everfree = (ImageButton) findViewById(R.id.everfree);
        everfree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Everfree!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "everfree"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        fillydelphia = (ImageButton) findViewById(R.id.fillydelphia);
        fillydelphia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Fillydelphia!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "fillydelphia"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        ponyvillefm = (ImageButton) findViewById(R.id.ponyvillefm);
        ponyvillefm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "PonyVille FM!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "ponyvillefm"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        lunaradio = (Button) findViewById(R.id.lunaradio);
        lunaradio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Luna Radio!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "lunaradio"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        alicornradio = (Button) findViewById(R.id.alicornradio);
        alicornradio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Alicorn Radio!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "alicornradio"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        sonicradioboom = (Button) findViewById(R.id.sonicradioboom);
        sonicradioboom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "SonicRadio Boom!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "sonicradioboom"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        fracturedfrequencies = (Button) findViewById(R.id.fracturedfrequencies);
        fracturedfrequencies.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Fractured Frequencies!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "fracturedfrequencies"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        bronyradio = (Button) findViewById(R.id.bronyradio);
        bronyradio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Brony Radio!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "bronyradio"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });

        everypony = (Button) findViewById(R.id.everypony);
        everypony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Everypony Radio!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent myIntent = new Intent(StationSelect.this, PlayerMain.class);
                myIntent.putExtra("key", "everypony"); //Optional parameters
                StationSelect.this.startActivity(myIntent);
            }
        });
    }

}
