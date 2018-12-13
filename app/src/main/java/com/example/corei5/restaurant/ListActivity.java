package com.example.corei5.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.corei5.restaurant.Adaptadores.MenuAdapters;
import com.example.corei5.restaurant.items.MenuResItem;
import com.example.corei5.restaurant.utils.Data;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class ListActivity extends AppCompatActivity {

    ArrayList<MenuResItem> listData;
    RecyclerView recyclerMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listData = new ArrayList<>();
    }

    public void getData() {
        //cargar datos de la bd
        listData.clear();
        AsyncHttpClient client = new AsyncHttpClient();

        client.get(Data.MENUS,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try {
                    JSONArray data = response.getJSONArray("result");

                    for (int i = 0; i<data.length();i++ ){
                        JSONObject item = data.getJSONObject(i);
                        Double price = item.getDouble("precio");
                        String name = item.getString("nombre");
                        String id = item.getString("_id");
                        String idRestaurant = item.getString("restaurant");
                        String foto = "";

                        if(item.getString("foto")!= null){
                            foto = item.getString("foto");
                        }
                        //Log.i("IMG",item.getString("foto"));


                        MenuResItem menu = new MenuResItem(name,price,"","","",id);
                        listData.add(menu);
                    }

                    loadData();

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

    }

    private void loadData() {

        recyclerMenu.setLayoutManager(
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true));
        MenuAdapters adapter = new MenuAdapters(this, listData);
        recyclerMenu.setAdapter(adapter);

    }


}
