package croma.video_streaming;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView visor;
    String url="rtsp://172.16.163.71:1234/video";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor=(VideoView) findViewById(R.id.videoView);
        visor.setVideoPath(url);
        visor.requestFocus();
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(visor);
        visor.setMediaController(mediaController);
        visor.start();
    }

    public void video(View V){

    }
}
