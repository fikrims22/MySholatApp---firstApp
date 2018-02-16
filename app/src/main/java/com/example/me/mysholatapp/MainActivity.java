package com.example.me.mysholatapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Sholat> list;
    Toolbar mToolBar;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(SholatData.getListData());

        showRecyclerGrid();

        mToolBar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setTitle("App Sholat");
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridSholatAdapter gridSholatAdapter = new GridSholatAdapter(this);
        gridSholatAdapter.setListSholat(list);
        rvCategory.setAdapter(gridSholatAdapter);

//        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
//            @Override
//            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
//                showSelectedSholat(list.get(position));
//            }
//        });
    }

    private void showSelectedSholat(Sholat sholat){
        Toast.makeText(this, "Anda memilih "+sholat.getNama(), Toast.LENGTH_SHORT).show();
    }




}
