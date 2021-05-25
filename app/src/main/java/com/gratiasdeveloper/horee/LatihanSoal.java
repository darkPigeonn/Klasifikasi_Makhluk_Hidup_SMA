package com.gratiasdeveloper.horee;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import java.util.Base64;

@RequiresApi(api = Build.VERSION_CODES.O)
public class LatihanSoal extends AppCompatActivity {
    WebView wView_latihan_soal_materi1;
    byte[] api64_materi1_address = Base64.getDecoder().decode("aHR0cHM6Ly9kYXJrcGlnZW9ubi5naXRodWIuaW8v");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal);

        wView_latihan_soal_materi1 = findViewById(R.id.wView_latihan_soal_materi1);
        WebSettings webSettings = wView_latihan_soal_materi1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String materi1_addressHook = new String("https://darkpigeonn.github.io/");
        wView_latihan_soal_materi1.loadUrl(materi1_addressHook);

        ObjectAnimator anim = ObjectAnimator.ofInt(wView_latihan_soal_materi1, "scrollY", wView_latihan_soal_materi1.getScrollY(), 0);
        anim.setDuration(500).start();

        ImageView home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LatihanSoal.this, hal2.class));
                finish();
            }
        });
    }
}