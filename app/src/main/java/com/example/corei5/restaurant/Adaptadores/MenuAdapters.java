package com.example.corei5.restaurant.Adaptadores;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.corei5.restaurant.R;
import com.example.corei5.restaurant.items.MenuResItem;

import java.util.ArrayList;


public class MenuAdapters extends RecyclerView.Adapter<MenuAdapters.MenuViewHolder> {

    private Context context;
    private ArrayList<MenuResItem> listData;

    public MenuAdapters(Context context, ArrayList<MenuResItem> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, final int position) {
        // holder.setData(listData.get(position));
         holder.parentLayout.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 //Toast.makeText(context,listData.get(position), Toast.LENGTH_SHORT).show();
                // context.startActivity(new Intent(context.mainActivity.class));
             }
         });
    }

    @Override
    public int getItemCount() { return listData.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        private TextView name, description, idrestaurant,price, picture, registerdate;
        private ConstraintLayout parentLayout;

        public MenuViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textNombre);
            description = itemView.findViewById(R.id.textNombre);
            idrestaurant = itemView.findViewById(R.id.textNombre);
            picture = itemView.findViewById(R.id.imageFoto);
            registerdate = itemView.findViewById(R.id.textNombre);
            price = itemView.findViewById(R.id.textPrecio);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
        public void setData(MenuResItem item)
        {
            name.setText(item.getName());
            description.setText(item.getPrice().toString());
        }
    }
}
