package com.company.foodorderapp.controller.ordersController;

import com.company.foodorderapp.order.Order;
import com.company.foodorderapp.repository.OrderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/api/order")
public class OrderController {

    private OrderRepository orderRepo;

    @Autowired
    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @PostMapping
    void createOrder(@RequestBody String orderJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Order order = new Order(mapper.readValue(orderJson, Order.class));
        orderRepo.save(order);
    }
}
