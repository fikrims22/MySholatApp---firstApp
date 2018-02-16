package com.example.me.mysholatapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView text_detail, judul_detail;
    ImageView foto;
    Toolbar mToolBar;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        text_detail = (TextView)findViewById(R.id.tv_detail);
        foto        = (ImageView)findViewById(R.id.img_detail);
        judul_detail = (TextView) findViewById(R.id.tv_detail_judul);
        String foto_url = getIntent().getStringExtra("foto_detail");
        String detail   = getIntent().getStringExtra("text_detail");
        String judul   = getIntent().getStringExtra("judul_detail");
        text_detail.setText(detail);
        judul_detail.setText(judul);
        Glide.with(this)
                .load(foto_url)
                .override(350, 550)
                .into(foto);
        mToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setTitle("Detail Gerakan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
