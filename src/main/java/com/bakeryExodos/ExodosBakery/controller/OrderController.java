package com.bakeryExodos.ExodosBakery.controller;

import com.bakeryExodos.ExodosBakery.DTO.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class OrderController {

    MethodCRUDDTO functionDTO = new MethodCRUDDTO();


    // ====================== Method GET ======================
    @GetMapping("/orders")
    public List<OrderDTO> getOrder() {
        return functionDTO.getOrder();
    }

    // ----- Family HTTP Status for Get -----
    @PostMapping("/orders")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String getOrderGetIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with GET");
        return "Method incorrect, try with GET";
    }
    @PutMapping("/orders")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String getOrderPutIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with GET");
        return "Method incorrect, try with GET";
    }
    @DeleteMapping("/orders")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String getOrderDeleteIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with GET");
        return "Method incorrect, try with GET";
    }



    // ====================== Method POST ======================
    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "ORDER SAVE")
    public String postOrder(
            @RequestBody OrderDTO order
    ) {
        String result = functionDTO.postOrder(order);
        System.out.println(result);
        return result;
    }

    // ----- Family HTTP Status for Post -----
    @GetMapping("/add")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String postOrderGetIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with POST");
        return "Method incorrect, try with POST";
    }

    @PutMapping("/add")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String postOrderPutIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with POST");
        return "Method incorrect, try with POST";
    }

    @DeleteMapping("/add")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String postOrderDeleteIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with POST");
        return "Method incorrect, try with POST";
    }



    // ====================== Method PUT ======================
    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "ORDER UPDATE")
    public String putOrder(
            @RequestBody OrderDTO order
    ) {
        String result = functionDTO.putOrder(order);
        System.out.println(result);
        return result;
    }

    // ----- Family HTTP Status for Put -----
    @GetMapping("/update")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String putOrderGetIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with PUT");
        return "Method incorrect, try with PUT";
    }

    @PostMapping("/update")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String putOrderPostIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with PUT");
        return "Method incorrect, try with PUT";
    }

    @DeleteMapping("/update")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String putOrderDeleteIn(
            @RequestBody OrderDTO order
    ) {
        System.out.println("Method incorrect, try with PUT");
        return "Method incorrect, try with PUT";
    }


    // ====================== Method DELETE ======================
    @DeleteMapping("/delete")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "ORDER UPDATE")
    public String deleteOrder(
            @RequestBody OrderDTO order
    ) {
        System.out.println(functionDTO.deleteOrder(order));
        return functionDTO.deleteOrder(order);
    }

    // ----- Family HTTP Status for Delete -----
    @GetMapping("/delete")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String deleteOrderGetIn() {
        System.out.println("Method incorrect, try with DELETE");
        return "Method incorrect, try with DELETE";
    }

    @PostMapping("/delete")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String deleteOrderPostIn() {
        System.out.println("Method incorrect, try with DELETE");
        return "Method incorrect, try with DELETE";
    }

    @PutMapping("/delete")
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "METHOD_NOT_ALLOWED")
    public String deleteOrderPutIn() {
        System.out.println("Method incorrect, try with DELETE");
        return "Method incorrect, try with DELETE";
    }

}
