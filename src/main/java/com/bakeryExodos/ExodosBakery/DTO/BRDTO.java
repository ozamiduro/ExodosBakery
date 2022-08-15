package com.bakeryExodos.ExodosBakery.DTO;

import com.bakeryExodos.ExodosBakery.DTO.BreadDTO.NutBreadDTO;
import com.bakeryExodos.ExodosBakery.DTO.BreadDTO.RyeBreadDTO;
import com.bakeryExodos.ExodosBakery.DTO.BreadDTO.WholemealBreadDTO;

import java.util.List;

public class BRDTO {

    MethodCRUDDTO fd = new MethodCRUDDTO();

    WholemealBreadDTO wholemealBread = new WholemealBreadDTO("", 0);
    NutBreadDTO nutBread = new NutBreadDTO("", 0);
    RyeBreadDTO ryeBread = new RyeBreadDTO("", 0);
    int availaW = wholemealBread.getAvailability();
    int W;
    int availaR = ryeBread.getAvailability();
    int R;
    int availaN = nutBread.getAvailability();
    int N;

    public int availabilityN(List<OrderDTO> list) {
        list.forEach(dato -> {
            N = dato.getNut().getQuantity();
            availaN = availaN - N;
        });

        if (availaN <= 0) {
            availaN = 0;
        }

        return availaN;
    }

    public int availabilityR(List<OrderDTO> list) {
        list.forEach(dato -> {
            R = dato.getRye().getQuantity();
            availaR = availaR - R;
        });

        if (availaR <= 0) {
            availaR = 0;
        }

        return availaR;
    }

    public int availabilityW(List<OrderDTO> list) {
        list.forEach(dato -> {
            W = dato.getWholemeal().getQuantity();
            availaW = availaW - W;
        });

        if (availaW <= 0) {
            availaW = 0;
        }

        return availaW;
    }

    public String checkPhone(String phone) {
        String msg;

        if (phone.length() < 10) {
            msg = "Error, número inexistente, actualícelo porfavor";
        } else {
            msg = "Número de celular registrado correctamente.";
        }
        return msg;
    }
}
