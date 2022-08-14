package com.bakeryExodos.ExodosBakery.DTO;

public class WholemealBread {

    String name = "Wholemeal";
    int price = 3000;
    int availability = 2;
    int quantity;

    public WholemealBread(String name,  int quantity) {
        this.name = name;
        //this.price = price;
        //this.availability = availability;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
