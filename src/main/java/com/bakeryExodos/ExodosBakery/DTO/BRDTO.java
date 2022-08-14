package com.bakeryExodos.ExodosBakery.DTO;

import java.util.List;

public class BRDTO {

    WholemealBread wholemealBread = new WholemealBread("", 0);
    NutBread nutBread = new NutBread("", 0);
    RyeBread ryeBread = new RyeBread("", 0);
    int availaW = wholemealBread.getAvailability();
    int W;
    int availaR = ryeBread.getAvailability();
    int R;
    int availaN = nutBread.getAvailability();
    int N;

    public int availabilityN(List<OrderDTO> list){
        list.forEach(dato -> {
            N = dato.getNut().getQuantity();
            availaN = availaN - N;
        });

        if (availaN <= 0) {
            availaN = 0;
        }

        return availaN;
    }

    public int availabilityR(List<OrderDTO> list){
        list.forEach(dato -> {
            R = dato.getRye().getQuantity();
            availaR = availaR - R;
        });

        if (availaR <= 0) {
            availaR = 0;
        }

        return availaR;
    }

    public int availabilityW(List<OrderDTO> list){
        list.forEach(dato -> {
            W = dato.getWholemeal().getQuantity();
            availaW = availaW - W;
        });

        if (availaW <= 0) {
            availaW = 0;
        }

        return availaW;
    }
}
