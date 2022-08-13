package com.bakeryExodos.ExodosBakery.DTO;


import org.apache.catalina.User;

public class OrderDTO {

    int id;
    UserDTO us;
    int total;
    int quantity;

    public OrderDTO(int id, UserDTO us, int total, int quantity) {
        this.id = id;
        this.us = us;
        this.total = total;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UserDTO getUs() {
        return us;
    }

    public void setUs(UserDTO us) {
        this.us = us;
    }
}


