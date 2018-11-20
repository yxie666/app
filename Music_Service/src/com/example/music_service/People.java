package com.example.music_service;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.provider.ContactsContract;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.System;
import java.lang.String;

public class People extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people);
        
        Button mbutton1 = (Button)findViewById(R.id.button7);
        Button mbutton2 = (Button)findViewById(R.id.button11);
        
        mbutton1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(People.this,MainActivity.class);
        		startActivity(_intent);
        		People.this.finish();
			}});
        
        mbutton2.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
						ContentResolver contentResolver=getContentResolver();
						Cursor cursor=contentResolver.query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null);
						while(cursor.moveToNext()){
							String contactId=cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
							String displayName=cursor.getString
							(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
							System.out.println("People ID:"+ contactId +"    "+"name:"+ displayName);
						}}});
 }}
