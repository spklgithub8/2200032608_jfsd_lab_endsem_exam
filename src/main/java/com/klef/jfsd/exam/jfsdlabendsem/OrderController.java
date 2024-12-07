package com.klef.jfsd.exam.jfsdlabendsem;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> viewAllOrders() {
        return orderService.getAllOrders();
    }
}
