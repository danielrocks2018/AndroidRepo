package com.example.corei5.restaurant;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorMenuComidas extends BaseAdapter {
    Context context;
    List<MenuComidas> ListaObjetos;

    public AdaptadorMenuComidas(Context contexto, List<MenuComidas> listaObjetos) {
        this.context = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); ///retorna cantidad de objetos
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(context);

        vista = inflate.inflate(R.layout.item_menu_comidas,null);
        ImageView img = (ImageView) vista.findViewById(R.id.imgproducto);
        TextView titulo = (TextView) vista.findViewById(R.id.nombreproducto);
        TextView precio = (TextView) vista.findViewById(R.id.precioproducto);
        TextView bs = (TextView) vista.findViewById(R.id.bs);
        Button pedirproducto= (Button) vista.findViewById(R.id.pedirproducto);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        precio.setText(ListaObjetos.get(position).getPrecio().toString());
        img.setImageResource(ListaObjetos.get(position).getImg());
        bs.setText(ListaObjetos.get(position).getBs().toString());

        pedirproducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(context.getApplicationContext(), Descripcion4Activity.class);
                context.startActivity(intencion);
            }



    });return vista;

    }
}
