package com.example.me.mysholatapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by ME on 24/12/2017.
 */

public class GridSholatAdapter extends RecyclerView.Adapter<GridSholatAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Sholat>listSholat;

    public ArrayList<Sholat> getListSholat() {
        return listSholat;
    }

    public void setListSholat(ArrayList<Sholat> listSholat) {
        this.listSholat= listSholat;
    }

    public GridSholatAdapter(Context context) {
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_sholat, parent, false);
        GridViewHolder gridViewHolder = new GridViewHolder(view);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, final int position) {
        Glide.with(context)
                .load(getListSholat().get(position).getFoto())
                .override(200, 400)
                .into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DetailActivity.class);
                intent.putExtra("foto_detail", listSholat.get(position).getFoto());
                intent.putExtra("judul_detail", listSholat.get(position).getNama());
                intent.putExtra("text_detail", listSholat.get(position).getText_detail());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListSholat().size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);

        }
    }

}
