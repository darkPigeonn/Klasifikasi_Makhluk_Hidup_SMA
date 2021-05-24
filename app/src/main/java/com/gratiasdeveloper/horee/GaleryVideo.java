package com.gratiasdeveloper.horee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.gratiasdeveloper.horee.Video.DataForo;
import com.gratiasdeveloper.horee.Video.Foto;
import com.gratiasdeveloper.horee.Video.GridFotoAdapater;
import com.gratiasdeveloper.horee.Video.ViewGambar;

import java.util.ArrayList;

public class GaleryVideo extends AppCompatActivity {
    ImageButton home_imun, back;

    private RecyclerView rvHeroes;
    private ArrayList<Foto> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery_video);
        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(DataForo.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this,1));
        GridFotoAdapater listHeroAdapter = new GridFotoAdapater(list);
        rvHeroes.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new GridFotoAdapater.OnItemClickCallback() {
            @Override
            public void onItemClicked(int position) {
                showSelectedHero(position);
                Intent i = new Intent(GaleryVideo.this, ViewGambar.class);
                i.putExtra("position",position);
                startActivity(i);
            }
        });
    }
    private void showSelectedHero(int foto) {

    }
}