package com.gratiasdeveloper.horee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hal2 extends AppCompatActivity {
    TextView petunjuk,pendahuluan,ki,mv,te,dapus,profil;
    ImageView ipentunjuk,ipendahuluan,iki,imv,ite,idapus,iprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);


        petunjuk = findViewById(R.id.petunjuk2);
        pendahuluan = findViewById(R.id.pendahuluan1);
        ki = findViewById(R.id.ki2);
        mv = findViewById(R.id.vm1);
        te = findViewById(R.id.te2);
        dapus = findViewById(R.id.dp1);
        profil = findViewById(R.id.profil);

        ipentunjuk = findViewById(R.id.petunjuk1);
        ipendahuluan = findViewById(R.id.pendahuluan2);
        iki = findViewById(R.id.ki1);
        imv = findViewById(R.id.vm2);
        ite = findViewById(R.id.te1);
        idapus = findViewById(R.id.dp2);
        iprofil = findViewById(R.id.profil2);

        petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal3.class));
            }
        });

        ipentunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal3.class));
            }
        });

        pendahuluan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal4.class));
            }
        });

        ipendahuluan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal4.class));
            }
        });

        ki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal5.class));
            }
        });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal5.class));
            }
        });

        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, GaleryVideo.class));
            }
        });

        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, GaleryVideo.class));
            }
        });

        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent(hal2.this, LatihanSoal.class);
                startActivity(implicit);
            }
        });

        ite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent(hal2.this, LatihanSoal.class);
                startActivity(implicit);
            }
        });

        dapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        idapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal6.class));
            }
        });

        iprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal2.this, hal6.class));
            }
        });
    }
}