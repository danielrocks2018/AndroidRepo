package com.example.corei5.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Descripcion2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion2);
    }

    public void onclic(View view) {
        Intent intent = new Intent(this,ListActivity.class);
        startActivity(intent);
    }
}
