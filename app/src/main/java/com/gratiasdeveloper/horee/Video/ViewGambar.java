package com.gratiasdeveloper.horee.Video;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;

import androidx.appcompat.app.AppCompatActivity;

import com.gratiasdeveloper.horee.R;

import java.util.ArrayList;

public class ViewGambar extends AppCompatActivity {
    private ArrayList<Foto> listFoto = new ArrayList<>();
    private ScaleGestureDetector mScaleGestureDetector;
    private float mScaleFactor = 1.0f;

    private MediaController mediaController;
   WebView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_gambar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
       int posisi = this.getIntent().getExtras().getInt("position");
       listFoto.addAll(DataForo.getListData());


        Foto foto = listFoto.get(posisi);

        videoView = findViewById(R.id.videoview);
        // setting
        videoView.setWebViewClient(new WebViewClient());
        videoView.setWebChromeClient(new WebChromeClient());
        videoView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        videoView.getSettings().setJavaScriptEnabled(true);
        videoView.getSettings().setPluginState(WebSettings.PluginState.ON);
        videoView.getSettings().setDefaultFontSize(18);


        int getImage = foto.getPhoto();

        switch (posisi) {
                    case 0:
                        linkvideo("KStcUTOA4BA");
                        break;
                    case 1:
                        linkvideo("o42hv3sF6nE");
                        break;
                    case 2:
                        linkvideo("aKvMxG0Sf4Q");
                        break;
                    default:
                        break;
                }
    }

    private void linkvideo(String link) {
        String html = "<head></head><body>" +
                "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/" +
                link +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" +
                "</body>";
        videoView.loadData(html,"text/html; charset=utf-8",null);
    }

}