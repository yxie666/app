package com.example.music_service;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Brocast extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brocast);
        
        Button mbutton1 = (Button)findViewById(R.id.button6);
        Button mbutton2 = (Button)findViewById(R.id.button10);
        
        mbutton1.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(Brocast.this,MainActivity.class);
        		startActivity(_intent);
        		Brocast.this.finish();
			}
		}); 
        
        mbutton2.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
        		intent.setAction(Intent.ACTION_EDIT);
        		Brocast.this.sendBroadcast(intent);   		
			}
		});        
    }
}
