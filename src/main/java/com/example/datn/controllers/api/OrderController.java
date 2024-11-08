package com.example.datn.controllers.api;

import com.example.datn.dto.CheckOrderDto;
import com.example.datn.dto.Order.OrderDto;
import com.example.datn.services.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @ResponseBody
    @PostMapping("/api/orderUser")
    public void order(@RequestBody OrderDto orderDto) {
        cartService.orderUser(orderDto);
    }

    @ResponseBody
    @PostMapping("/api/orderAdmin")
    public OrderDto orderAdmin(@RequestBody OrderDto orderDto) {
        System.out.println("Received orderAdmin request with data: " + orderDto);
        return cartService.orderAdmin(orderDto);
    }

    @ResponseBody
    @PostMapping("/api/checkOrder")
    public List<CheckOrderDto> checkOrder(@RequestBody List<CheckOrderDto> checkOrderDtoList) {
        return null;
    }
}
