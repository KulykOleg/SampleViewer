package com.example.okulyk.sampleviewer;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create a VideoView widget in the layout file
        //use setContentView method to set content of the activity to the layout file which contains videoView
        this.setContentView(R.layout.activity_main);

        videoView = (VideoView)this.findViewById(R.id.videoView);

        String path2 = "http://54.84.241.223:1935/live/myStream/playlist.m3u8";
        Uri video = Uri.parse(path2);

        videoView.setVideoURI(video);
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.postInvalidateDelayed(100);
        videoView.start();
        //
    }
}
