package com.bakeryExodos.ExodosBakery.controller;

import com.bakeryExodos.ExodosBakery.DTO.OrderDTO;
import com.bakeryExodos.ExodosBakery.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class OrderController {

    List <OrderDTO> list = new ArrayList<>();

    // Method GET -- Obtiene todos los pedidos.
    @GetMapping("/orders")
    public List<OrderDTO> getOrder() {


        return list;
    }

    @PostMapping("/add")
    public List<OrderDTO> postOrder(
            @RequestBody OrderDTO order
    ) {

        UserDTO us =  new UserDTO(order.getUs().getName(),
                order.getUs().getLastName(),
                order.getUs().getPhone(),
                order.getUs().getAddress());

        list.add(new OrderDTO(order.getId(), us, order.getTotal(), order.getQuantity()));
        return list;
    }

    // --- Método PUT
    @PutMapping("/update")
    public List<OrderDTO> putOrder(
            @RequestBody OrderDTO order
    ) {
        list.forEach(data -> {
            if (data.getId() == order.getId()) {
                data.setQuantity(order.getQuantity());
            }
        });

        return list;
    }

    @DeleteMapping("/delete")
    public List<OrderDTO> deleteOrder(
            @RequestBody OrderDTO order
    ) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i).getId() == order.getId() && list.get(i).getUs().getName().contains(order.getUs().getName())){
                list.remove(i);
            }
        }
        return list;
    }


}
