package com.example.corei5.restaurant;

public class MenuComidas {
    private int Id;
    private String Titulo;
    private String Precio, Bs;
    private int Img;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public MenuComidas (int id, String titulo, String precio, int img){
        Id = id;
        Titulo = titulo;
        Precio = precio;
        Img = img;


    }

    public String getBs() {

        return Bs;
    }
}
