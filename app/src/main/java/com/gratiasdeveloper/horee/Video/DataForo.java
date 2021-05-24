package com.gratiasdeveloper.horee.Video;

import com.gratiasdeveloper.horee.R;

import java.util.ArrayList;

public class DataForo {
    private static  String[] namafoto = {
            "Pertemuan 1",
            "Pertemuan 2",
            "Pertemuan 3"
    };

    private static int[] heroesImages={
      R.drawable.pertemuan1,
      R.drawable.pertemuan2,
      R.drawable.pertemuan3

    };

    public static ArrayList<Foto> getListData() {
        ArrayList<Foto> list = new ArrayList<>();
        for (int position = 0; position<namafoto.length;position++) {
            Foto foto = new Foto();
            foto.setName(namafoto[position]);
            foto.setPhoto(heroesImages[position]);
            list.add(foto);
        }

        return list;
    }

    public static ArrayList<Foto> getData(int position) {
        ArrayList<Foto> list = new ArrayList<>();

        Foto foto = new Foto();
        foto.setName(namafoto[position]);
        foto.setPhoto(heroesImages[position]);
        list.add(foto);

        return list;
    }
}
