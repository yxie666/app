package com.example.music_service;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Music extends Activity{
	private Button start= null;
	private Button stop = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        
        start = (Button)findViewById(R.id.start);       
        stop = (Button)findViewById(R.id.stop);       
        Button mbutton1 = (Button)findViewById(R.id.button5);  
        
        mbutton1.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(Music.this,MainActivity.class);
        		startActivity(_intent);
        		Music.this.finish();
			}
		}); 
        
        start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startService(new Intent("android.media"));
			}        	
        });
        
        stop.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				stopService(new Intent("android.media"));
			}        	
        });
        
    }
	
}
