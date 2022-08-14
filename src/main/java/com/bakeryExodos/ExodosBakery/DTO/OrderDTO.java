package com.bakeryExodos.ExodosBakery.DTO;


import org.apache.catalina.User;

public class OrderDTO {

    int id;
    UserDTO us;
    WholemealBread wholemeal;
    RyeBread rye;
    NutBread nut;
    int amount;

    public OrderDTO(int id, UserDTO us, WholemealBread wholemeal, RyeBread rye, NutBread nut, int amount) {
        this.id = id;
        this.us = us;
        this.wholemeal = wholemeal;
        this.rye = rye;
        this.nut = nut;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public UserDTO getUs() {
        return us;
    }

    public void setUs(UserDTO us) {
        this.us = us;
    }

    public WholemealBread getWholemeal() {
        return wholemeal;
    }

    public void setWholemeal(WholemealBread wholemeal) {
        this.wholemeal = wholemeal;
    }

    public RyeBread getRye() {
        return rye;
    }

    public void setRye(RyeBread rye) {
        this.rye = rye;
    }

    public NutBread getNut() {
        return nut;
    }

    public void setNut(NutBread nut) {
        this.nut = nut;
    }
}


