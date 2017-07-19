package com.example.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //String path = "http://120.105.93.144/test.mp4" ;
        String path = "http://192.168.1.136:12003/prog1.m3u8" ;  
//        String path = "rtsp://192.168.1.245:8554/ntsc.ts";
        VideoView videoView = (VideoView)findViewById(R.id.videoView1);
        videoView.setVideoURI(Uri.parse(path));
//        videoView.setVideoPath(path);
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();
    }
}