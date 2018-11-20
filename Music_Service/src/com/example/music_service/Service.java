package com.example.music_service;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class Service extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service);
        
        Button mbutton1 = (Button)findViewById(R.id.button8);
        Button mbutton2 = (Button)findViewById(R.id.button15);
        Button mbutton3 = (Button)findViewById(R.id.button16);
        Button mbutton4 = (Button)findViewById(R.id.button17);
        
        final LinearLayout layout_back = (LinearLayout)findViewById(R.id.s123);
        
        mbutton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(Service.this,MainActivity.class);
        		startActivity(_intent);
        		Service.this.finish();
			}
		});  
        
        mbutton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				layout_back.setBackgroundColor(Color.RED);
			}
		});  
        
        mbutton3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				layout_back.setBackgroundColor(Color.BLUE);
			}
		});
        
        mbutton4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				layout_back.setBackgroundColor(Color.YELLOW);
			}
		});
    }
}
