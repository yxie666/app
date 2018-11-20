package com.example.music_service;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button mbutton1 = (Button)findViewById(R.id.button1);
        Button mbutton2 = (Button)findViewById(R.id.button2); 
        Button mbutton3 = (Button)findViewById(R.id.button3);
        Button mbutton4 = (Button)findViewById(R.id.button4);
        
        mbutton1.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(MainActivity.this,Music.class);
        		startActivity(_intent);
        		MainActivity.this.finish();
			}
		});
        
        mbutton2.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Intent _intent = new Intent(MainActivity.this,Brocast.class);
        		startActivity(_intent);
        		MainActivity.this.finish();
        	}
        });   
        
        mbutton3.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Intent _intent = new Intent(MainActivity.this,People.class);
        		startActivity(_intent);
        		MainActivity.this.finish();
        	}
        }); 
        
        mbutton4.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Intent _intent = new Intent(MainActivity.this,Service.class);
        		startActivity(_intent);
        		MainActivity.this.finish();
        	}
        });        
    }   
}
