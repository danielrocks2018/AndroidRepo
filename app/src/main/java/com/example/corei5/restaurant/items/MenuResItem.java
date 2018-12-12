package com.example.corei5.restaurant.items;

public class MenuResItem {
    private String name;
    private Double price;
    private String description;
    private String registerdate;
    private String picture;
    private String idrestaurant;

    public MenuResItem(String name, Double price, String description, String registerdate, String picture, String idrestaurant) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.registerdate = registerdate;
        this.picture = picture;
        this.idrestaurant = idrestaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIdrestaurant() {
        return idrestaurant;
    }

    public void setIdrestaurant(String idrestaurant) {
        this.idrestaurant = idrestaurant;
    }
}
