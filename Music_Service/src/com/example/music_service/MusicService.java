package com.example.music_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service{
		private MediaPlayer player;
		public IBinder onBind(Intent arg0){
			return null;
		}
		public void onStart(Intent intent, int startId){
			super.onStart(intent, startId);
			//װ�������ļ�
			player = MediaPlayer.create(this, R.raw.test);
			//��ʼ����
			player.start();
		}
		
		public void onDestroy(){
			super.onDestroy();
			//ֹͣservice
			player.stop();
		}
}
