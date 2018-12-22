package com.example.twtech.androidproject.playvideo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import com.example.twtech.androidproject.R;

public class Video extends AppCompatActivity {
    private VideoView videoView;
        @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.video);



    videoView = (VideoView) findViewById(R.id.videoView);

    Uri video = Uri.parse("http://makable-spill.000webhostapp.com/videos/VID_20181215_150618.mp4");
    videoView.setVideoURI(video);
    videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
        @Override
        public void onPrepared(MediaPlayer mp) {
            mp.setLooping(true);
            videoView.start();
        }
    });
}
}
