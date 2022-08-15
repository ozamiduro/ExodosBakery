package com.bakeryExodos.ExodosBakery.DTO.BreadDTO;

public class NutBreadDTO {

    String name = "Nut";
    int price = 10000;
    int availability = 5;
    int quantity;

    public NutBreadDTO(String name, int quantity) {
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
