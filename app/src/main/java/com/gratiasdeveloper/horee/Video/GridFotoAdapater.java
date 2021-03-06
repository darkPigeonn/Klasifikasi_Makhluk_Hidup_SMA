package com.gratiasdeveloper.horee.Video;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.gratiasdeveloper.horee.R;

import java.util.ArrayList;


public class GridFotoAdapater extends RecyclerView.Adapter<GridFotoAdapater.GridViewHolder> {
    private ArrayList<Foto> listFoto;


    public GridFotoAdapater(ArrayList<Foto> list) {
        this.listFoto = list;
    }
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.foto_grid_layaout,viewGroup,false);
        return new GridViewHolder(view);
    }
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Foto foto = listFoto.get(position);
        Glide.with(holder.itemView.getContext())
                .load(foto.getPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.imgPhoto);
        holder.tvName.setText(foto.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onItemClickCallback.onItemClicked(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFoto.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(int position);
    }
}
