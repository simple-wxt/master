package com.kpi.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.bm.library.PhotoView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.storm.kpi.R;

/**
 * 产品简介
 */
public class ProductAboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_about);
        initToolBar();
        PhotoView img_product_about = (PhotoView) findViewById(R.id.img_product_about);
        img_product_about.enable();
        RequestManager manager = Glide.with(this);
        manager.load("http://192.168.0.19:4444/image/productInfo.png").into(img_product_about);
    }

    private void initToolBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("产品简介");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return false;
    }
}