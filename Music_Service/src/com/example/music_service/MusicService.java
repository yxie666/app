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
			//装载音乐文件
			player = MediaPlayer.create(this, R.raw.test);
			//开始播放
			player.start();
		}
		
		public void onDestroy(){
			super.onDestroy();
			//停止service
			player.stop();
		}
}
