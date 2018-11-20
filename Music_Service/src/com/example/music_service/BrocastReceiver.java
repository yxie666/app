package com.example.music_service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BrocastReceiver extends BroadcastReceiver{
	public BrocastReceiver(){
		System.out.println("I has received a message");
	}
	@Override
	public void onReceive(Context context,Intent intent){
		System.out.println("OnReceiver");
	}
}
