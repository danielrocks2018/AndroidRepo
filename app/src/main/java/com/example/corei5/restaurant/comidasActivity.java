package com.example.corei5.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class comidasActivity extends AppCompatActivity {

    ListView ListaComidas;
    ArrayList<MenuComidas> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidas);

        ListaComidas = findViewById(R.id.listMenu);
        lista = new ArrayList<>();

        lista.add(new MenuComidas(1,"comida","25",R.drawable.fideos));
        lista.add(new MenuComidas(2,"comida","20",R.drawable.silpancho));
        lista.add(new MenuComidas(3,"comida","30",R.drawable.mondongo));
        lista.add(new MenuComidas(4,"Pizza","50",R.drawable.hawuaiana));
        lista.add(new MenuComidas(5,"Pizza","60",R.drawable.estaciones));
        lista.add(new MenuComidas(6,"Pizza","70",R.drawable.champiniones));
    }

}
