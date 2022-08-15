package com.bakeryExodos.ExodosBakery.DTO;


import com.bakeryExodos.ExodosBakery.DTO.BreadDTO.NutBreadDTO;
import com.bakeryExodos.ExodosBakery.DTO.BreadDTO.RyeBreadDTO;
import com.bakeryExodos.ExodosBakery.DTO.BreadDTO.WholemealBreadDTO;

public class OrderDTO {

    int id;
    UserDTO us;
    WholemealBreadDTO wholemeal;
    RyeBreadDTO rye;
    NutBreadDTO nut;
    int amount;

    public OrderDTO(int id, UserDTO us, WholemealBreadDTO wholemeal, RyeBreadDTO rye, NutBreadDTO nut, int amount) {
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

    public WholemealBreadDTO getWholemeal() {
        return wholemeal;
    }

    public void setWholemeal(WholemealBreadDTO wholemeal) {
        this.wholemeal = wholemeal;
    }

    public RyeBreadDTO getRye() {
        return rye;
    }

    public void setRye(RyeBreadDTO rye) {
        this.rye = rye;
    }

    public NutBreadDTO getNut() {
        return nut;
    }

    public void setNut(NutBreadDTO nut) {
        this.nut = nut;
    }
}


