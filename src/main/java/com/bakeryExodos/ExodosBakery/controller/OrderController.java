package com.bakeryExodos.ExodosBakery.controller;

import com.bakeryExodos.ExodosBakery.DTO.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@RestController
public class OrderController {

    List<OrderDTO> list = new ArrayList<>();


    // Method GET -- Obtiene todos los pedidos.
    @GetMapping("/orders")
    public List<OrderDTO> getOrder() {


        BRDTO brdto = new BRDTO();
        return list;
    }

    @PostMapping("/add")
    public List<OrderDTO> postOrder(
            @RequestBody OrderDTO order
    ) {

        int amountRye = 0;
        int amountWholemeal = 0;
        int amountNut = 0;

        UserDTO us = new UserDTO(order.getUs().getName(),
                order.getUs().getLastName(),
                order.getUs().getPhone(),
                order.getUs().getAddress());

        BRDTO brdto = new BRDTO();
        int amountAvaR = brdto.availabilityR(list);
        int amountAvaW = brdto.availabilityW(list);
        int amountAvaN = brdto.availabilityN(list);


        int availabilityRye = amountAvaR - order.getRye().getQuantity();
        int availabilityNut = amountAvaN - order.getNut().getQuantity();
        int availabilityWholemeal = amountAvaW - order.getWholemeal().getQuantity();


        int quantityW = 0;
        int quantityR = 0;
        int quantityN = 0;

        if (availabilityRye >= 0) {
            amountRye = order.getRye().getQuantity() * order.getRye().getPrice();
            quantityR = order.getRye().getQuantity();
        } else {
            availabilityRye = -1;
        }

        if (availabilityWholemeal >= 0) {
            amountWholemeal = order.getWholemeal().getQuantity() * order.getWholemeal().getPrice();
            quantityW = order.getWholemeal().getQuantity();
        } else {
            availabilityWholemeal = -1;
        }

        if (availabilityNut >= 0) {
            amountNut = order.getNut().getQuantity() * order.getNut().getPrice();
            quantityN = order.getNut().getQuantity();
        } else {
            availabilityNut = -1;
        }

        WholemealBread wholemealBread = new WholemealBread(order.getWholemeal().getName(),
                quantityW);

        RyeBread ryeBread = new RyeBread(order.getRye().getName(),
                quantityR);

        NutBread nutBread = new NutBread(order.getNut().getName(),
                quantityN);

        if (availabilityRye >= 0) {
            ryeBread.setAvailability(availabilityRye);
        } else {
            ryeBread.setAvailability(amountAvaR);
        }

        if (availabilityWholemeal >= 0) {
            wholemealBread.setAvailability(availabilityWholemeal);
        } else {
            wholemealBread.setAvailability(amountAvaW);
        }

        if (availabilityNut >= 0) {
            nutBread.setAvailability(availabilityNut);
        } else {
            nutBread.setAvailability(amountAvaN);
        }

        int amount = amountRye + amountNut + amountWholemeal;


        list.add(new OrderDTO(order.getId(), us, wholemealBread, ryeBread,
                nutBread, amount));

        return list;
    }

    // --- Método PUT
    @PutMapping("/update")
    public List<OrderDTO> putOrder(
            @RequestBody OrderDTO order
    ) {
        BRDTO brdto = new BRDTO();
        int amountAvaR = brdto.availabilityR(list);
        int amountAvaW = brdto.availabilityW(list);
        int amountAvaN = brdto.availabilityN(list);

        list.forEach(data -> {
            if (data.getId() == order.getId()) {
                data.getUs().setName(order.getUs().getName());
                data.getUs().setAddress(order.getUs().getAddress());
                data.getUs().setPhone(order.getUs().getPhone());
                data.getUs().setLastName(order.getUs().getLastName());

                int availabilityRye = amountAvaR - order.getRye().getQuantity();
                int availabilityNut = amountAvaN - order.getNut().getQuantity();
                int availabilityWholemeal = amountAvaW - order.getWholemeal().getQuantity();

                int quantityW = 0;
                int quantityR = 0;
                int quantityN = 0;

                int amountRye = 0;
                int amountWholemeal = 0;
                int amountNut = 0;

                if (availabilityRye >= 0) {
                    amountRye = order.getRye().getQuantity() * order.getRye().getPrice();
                    data.getRye().setQuantity(order.getRye().getQuantity());
                } else {
                    availabilityRye = -1;
                    data.getRye().setQuantity(0);
                }

                if (availabilityWholemeal >= 0) {
                    amountWholemeal = order.getWholemeal().getQuantity() * order.getWholemeal().getPrice();
                    data.getWholemeal().setQuantity(order.getWholemeal().getQuantity());
                } else {
                    availabilityWholemeal = -1;
                    data.getWholemeal().setQuantity(0);
                }

                if (availabilityNut >= 0) {
                    amountNut = order.getNut().getQuantity() * order.getNut().getPrice();
                    data.getNut().setQuantity(order.getNut().getQuantity());
                } else {
                    availabilityNut = -1;
                    data.getNut().setQuantity(0);
                }

                WholemealBread wholemealBread = new WholemealBread(order.getWholemeal().getName(),
                        quantityW);

                RyeBread ryeBread = new RyeBread(order.getRye().getName(),
                        quantityR);

                NutBread nutBread = new NutBread(order.getNut().getName(),
                        quantityN);

                if (availabilityRye >= 0) {
                    ryeBread.setAvailability(availabilityRye);
                    data.getRye().setAvailability(availabilityRye);
                } else {
                    ryeBread.setAvailability(amountAvaR);
                    data.getRye().setAvailability(amountAvaR);
                }

                if (availabilityWholemeal >= 0) {
                    // Actualice el inventario restantele la venta de ahora con los panes que ya habia
                    wholemealBread.setAvailability(availabilityWholemeal);
                    data.getWholemeal().setAvailability(availabilityWholemeal);
                } else {
                    // No se actualice que no hay pan
                    wholemealBread.setAvailability(amountAvaW);
                    data.getWholemeal().setAvailability(amountAvaW);
                }

                if (availabilityNut >= 0) {
                    nutBread.setAvailability(availabilityNut);
                    data.getNut().setAvailability(availabilityNut);
                } else {
                    nutBread.setAvailability(amountAvaN);
                    data.getNut().setAvailability(amountAvaN);
                }

                data.setAmount(amountRye + amountWholemeal + amountNut);
            }
        });

        return list;
    }

    @DeleteMapping("/delete")
    public List<OrderDTO> deleteOrder(
            @RequestBody OrderDTO order
    ) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i).getId() == order.getId() && list.get(i).getUs().getName().contains(order.getUs().getName())) {
                list.remove(i);
            }
        }
        return list;
    }


}
