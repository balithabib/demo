package org.example.demo.controller;

import org.example.demo.api.OrderQuery;
import org.example.demo.entity.Order;
import org.example.demo.entity.Product;
import org.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toUnmodifiableSet;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody OrderQuery order) {
        final Order orderToSave = new Order();
        orderToSave.setCustomerName(order.customerName());
        final Set<Product> productsToAddInOrder = order.products().stream()
                .map(productQuery -> {
                    final Product product = new Product();
                    product.setId(productQuery.id());
                    return product;
                })
                .collect(toUnmodifiableSet());
        orderToSave.setProducts(productsToAddInOrder);
        return orderService.createOrder(orderToSave);
    }
}