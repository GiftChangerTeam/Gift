package com.example.giftchanger;

public class Present {  //просто класс
    private String name;
    private String price;

    private int presentResource;

    public Present(String name, String price, int presentResource) {
        this.name = name;
        this.price = price;
        this.presentResource = presentResource;
    }

    public int getPresentResource() {
        return presentResource;
    }

    public void setPresentResource(int presentResource) {
        this.presentResource = presentResource;
    }

    public Present(String name, String price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
