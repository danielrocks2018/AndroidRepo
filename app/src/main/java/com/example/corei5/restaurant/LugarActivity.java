package com.example.corei5.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class LugarActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugar);

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);

        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(LugarActivity.this, "El Fogon",Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton2);

        boton2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(LugarActivity.this, "El Pizarron",Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton3= (ImageButton) findViewById(R.id.imageButton3);

        boton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(LugarActivity.this, "Doña Eugenia",Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton4);

        boton4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(LugarActivity.this, "PizzaMania Express",Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));
    }
    @Override
    public void onClick(View v){

    }
}
